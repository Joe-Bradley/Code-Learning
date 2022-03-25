 - set -x

- $0 shell 文件本身的名字

- basename [pathname] [suffix]  系统函数

  ```shell
  JOBNAME=`basename $0 .sh`
  
  123.sh --> 123
  ```

- date [option] [+FORMAT]

  ```shell
  DATE=`date +"%Y%m%d"`
  ```

- awk

  ```shell
  read_param(){
  	echo `awk "/$1/" $2 | awk -F"\"" '{ print $2 }'`
  }
  ```

- sqlplus

  ```SHELL
  TWOMONTHSAGO=`sqlplus -S "${DBUSER}/${DBPASSWD}${ORASID}"<<!
  											set head off;
  											set pagesize 0;
  											SELECT to_char(add_months(to_date('${PROCDATE}','YYYYMMDD'),-2),'YYYYMMDD') FROM DUAL;
  !`
  
  186
  
  235
  ```

- gzip [选项] [文件or目录]

  ```shell
  gzip ${BRANCHFILEG} 
  gzip *
  ```

- mv [options] source dest

  ```
  mv 文件 文件
  mv 文件 目录
  mv 目录 目录  
  mv 目录 文件
  
  mv aaa bbb 将文件名aaa改为bbb
  mv info/ logs 将info目录放入logs中，如果logs不存在则将info命名为logs
  mv /user/runoob/* . 将/user/runoob/下所有文件移动到当前目录下
  
  
  ```

  
