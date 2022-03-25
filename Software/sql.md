```sql
-- create a table
create table a
(
  aa varchar2(20),
  ab varchar2(30) not null primary key,
  ac varchar2(10)
);
comment on column a.aa is 'aa';
comment on column a.ab is 'ab';
comment on column a.ac is 'ac';
alter table aa add constraint P_aa primary key (aa,ab);
create index IND_aa on aa(ac) local;
alter table aa add partition Recdate20210818 values("20210818");
```

```sql
-- alter table
alter table a add ad varchar2(30);
comment on a.ad is 'ad';
```

```sql
-- delete table.column
alter table a drop column ad;
```

```sql
-- insert table
insert into a(aa,ab) values('1','2')
```

```sql
-- sql plus to file
sqlplus -S username/userpwd@oraz11g
WHENEVER SQLERROR EXIT sql.sqlcode;
set head off;
set long 100000000;
set longc 25500000;
set feedback off;
set wrap off;
set trimout off;
set echo off;
set trimspool off;
set term off;
set linesize 30;
set pagesize 0;
spool ${FILEPATH}/${FILENAME}
select 'aa,ab,ac,ad' from dual
union all
select 
a.aa || ',' ||
substr(a.ab,1,8) || ',' || 
replace(replace(replace(replace(a.ac,chr(13),''),chr(10),''),'|',''),',',' ') || ',' ||
case when a.ad like '1001%' then '11' when a.ad like '1002%' then '11' when a.ad like '1003%' then '10' else a.ad end 
spool off
```

```sql
-- to show multiple columns when select distinct
-- how to use cursor
declare cursor cur_accno is select TARGETACCNO,appltype from scappldetailinfo
                                                   where rowid in (select max(rowid) from scappldetailinfo
                                                   where appltype in ('100301','100201') and
                                                   applstatus <> '37' and
                                                   TARGETACCTYPE  = '05' and
                                                   merchno = 'PBOC0000' and
                                                   recvtime < ${DATE} || '000000'
                                                   group by TARGETACCNO);


  begin
    for accno in cur_accno
      loop
        insert into suspicious_list(generatetime,accno,transtype,operateflag)
        values
        (
        ${DATE},
        accno.TARGETACCNO,
        case when accno.appltype = '100201' then '查' else '冻' end,
        '+'
        );
      end loop;
    end;
/
exit
!

```


