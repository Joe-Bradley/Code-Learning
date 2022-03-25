# 工作总结20210817

### Software

- Beyond compare
- Listray
- Typora
- Vscode
- Xmind
- Pomo
- 7-zip
- Anaconda
- Node.js
- Sublime 
- Xshell
- Xftp
- Postman
- git教程 by 廖雪峰

### Knowledge
- cron expression
- select t.*,t.rowid from sctimertask t
#### 知识点

- Rpad( string1, padded_length, [ pad_string ] )

  > string1：源字符串
  >
  > padded_length: 即最终结果返回的字符串的长度；如果最终返回的字符串的长度比源字符串的小，那么此函数实际上对源串进行截取处理，与substr(string,number1,number2)的作用完全相同，如果padded_length比源字符串的长度长，则用pad_string进行填充，确保返回的最终字符串的长度为padded_length；
  >
  > pad_string:用于填充的字符，可以不填，默认为空字符

- Lpad( string1, padded_length, [ pad_string ] )

  > 方向向左

```sql
select lpad('123456',7,'0') from dual
--结果为 0123456--注意在左侧填充 lpad中的l为left，左侧的意思

select lpad('123456',2) from dual
--结果为 12

select rpad('123456',2,'0') from dual
--结果为 12

select rpad('123456',7,'0') from dual
--结果为 1234560
--rpad 填充在右侧，r为right 右侧
```

- 拼接行名

  ```sql
  select column1 || column2 || column3 from table
  ```

- NVL(exp1,exp2)

  ```mermaid
  graph LR
  a(exp1 =? null) --> |yes| b(return exp2)
  a(exp1 =? null) --> |no| c(return exp1)
  ```

- 替换换行符

  ```sql
  TRANSLATE (trafficname, CHR (13) || CHR (10), ' '）
  ```

- 插入换行符

  ```sql
  insert into table values ('1'||chr(10)||'2'||chr(13)||'3')
  ```

- 创建表

  ```sql
  creat table
  (
  	remark char(50) not null;
  );
  
  insert into table values('1');
  
  DROP TABLE table;
  ```

- 单引号双引号的区别

  - 字符串中双引号仅仅被当做一个普通字符进行处理

  ```sql
  select 'hh24"小时""mi""分"""ss"秒"' results from dual;
  RESULTS
  -------------------------
  hh24"小时""mi""分"""ss"秒"
  ```

  - 当出现在to_char的格式字符串中时，双引号将非法的格式符包装起来，to_char在处理格式字符串时，会忽略双引号。

  ```sql
  select to_char(sysdate,'hh24"小时"mi"分"ss"秒"') results from dual
  RESULTS
  --------------
  06小时39分51秒
  ```

  - 用双引号报错

  ```sql
  SELECT * FROM users WHERE id="F7119E4462E04303A7737AAB7B7E2917";
  -->报错：ORA-00972: identifier is too long。还是非法格式？
  SELECT * FROM users WHERE id='F7119E4462E04303A7737AAB7B7E2917';
  ```

- 单引号在 Oracle 中有三种作用

  - 引用一个字符串常量

    ```sql
    select * from table_name where id=’1123’;
    ```

  - 转义符，对紧随其后出现的字符(单引号)进行转义 

    ```sql
    SQL> select '''' result from dual;
    RESULT
    ------
    '
    ```

  - 连接符‘||’导致了新一轮的转义

    ```sql
    SQL> select 'name'||'''' result from dual;RESULT
    ------
    name'
    ```

  - 第一个和最后一个单引号作为字符串引用符,中间四个单引号两两转义。

    ```sql
    SQL> select 'name''''' result from dual;
    RESULT
    ------
    name''
    ```
### 脚本知识

#### bash

- **Bash**，Unix shell的一种，在1987年由布莱恩·福克斯为了GNU计划而编写。1989年发布第一个正式版本，原先是计划用在GNU操作系统上，但能运行于大多数类Unix系统的操作系统之上，包括Linux与Mac OS X v10.4都将它作为默认shell。
- **Unix shell**，通常被称作“命令行”，为Unix和类Unix操作系统提供了传统的用户界面。用户通过输入shell所执行的命令，引导计算机的操作
- Bash是Bourne shell的后继兼容版本与开放源代码版本，它的名称来自Bourne shell（sh）的一个双关语（*Bourne again* / born again）：**B**ourne-**A**gain **SH**ell。

#### shell script

- 是一种为 shell 编写的脚本程序。

- 业界所说的 shell 通常都是指 shell 脚本。shell 和 shell script 是两个不同的概念。
- Shell 是一个用 C 语言编写的程序，它是用户使用 Linux 的桥梁。Shell 既是一种命令语言，又是一种程序设计语言。

#### 运行 Shell 脚本的两种方法

- **作为可执行程序**

```shell
chmod +x ./test.sh  #使脚本具有执行权限
./test.sh  #执行脚本
```

- **作为解释器参数**

```sql
/bin/sh test.sh
/bin/php test.php
```

#### Shell变量

- 命名只能使用英文字母，数字和下划线，首个字符不能以数字开头。
- 中间不能有空格，可以使用下划线（_）。
- 不能使用标点符号。
- 不能使用bash里的关键字（可用help命令查看保留关键字）。

```
RUNOOB
LD_LIBRARY_PATH
_var
var2
?var=123 #不可以
user*name=runoob #不可以
```

