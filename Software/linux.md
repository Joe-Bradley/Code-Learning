# Basic Linux Operations



## Ubuntu Desktop

### 查看安装

dpkg --list

### 安装

sudo dpkg -i  


### 卸载


sudo apt-get --purge remove

### 设置国内源

settings --> about  --> Software Updates

### 设置XFTP

sudo apt install ssh

sudo apt install net-tools

ifconfig
192.168.31.170

### 设置git

sudo apt install git

git config --global user.email “you@example.com”

git config --global user.name “Your Name”

ssh-keygen -t rsa

cd ~/.ssh

ll

cat id

### git代码

- 查看分支

  > git branch

- 合并分支

  > git merge feature/X01
  >
  > git push

- 新建分支

  > git checkout -b feature/X02

### 美化

#### 安装gnome美化工具

sudo apt update

sudo apt install gnome-tweaks

sudo apt install chrome-gnome-shell

sudo apt install gtk2-engines-murrine gtk2-engines-pixbuf 

sudo apt install sassc optipng inkscape libcanberra-gtk-module libglib2.0-dev libxml2-utils

sudo apt install plank

### 安装GNOME插件

[https://extensions.gnome.org](https://link.zhihu.com/?target=https%3A//extensions.gnome.org)

- user themes
- dash to dock
- netspeed

### 美化包

- 主题包：WhiteSur Gtk Theme

- - [https://www.gnome-look.org/p/1403328/](https://link.zhihu.com/?target=https%3A//www.gnome-look.org/p/1403328/)

- Icons 图标：WhiteSur icon theme

- - [https://www.pling.com/p/1405756/](https://link.zhihu.com/?target=https%3A//www.pling.com/p/1405756/)

- 鼠标图标：McMojave cursors

- - [https://www.pling.com/p/1355701/](https://link.zhihu.com/?target=https%3A//www.pling.com/p/1355701/)

- 壁纸：WhiteSur Wallpaper

- - [https://www.pling.com/p/1398833/](https://link.zhihu.com/?target=https%3A//www.pling.com/p/1398833/)

- Firefox 浏览器美化：

- - 参考：[https://github.com/vinceliuice/WhiteSur-gtk-theme/tree/master/src/other/firefox

### dock动画

右键 --> preferences --> transparent & iconzone

### 删除 dash to dock

https://extensions.gnome.org/

### 安装显卡驱动

nvidia-smi

看支持的版本

### 安装cuda11

- https://developer.nvidia.com/cuda-11.0-download-archive

- 环境变量配置

  > sudo gedit /etc/profile
  >
  > export PATH=/usr/local/cuda-11.0/bin:$PATH
  >
  > export LD_LIBRARY_PATH=/usr/local/cuda-11.0/lib64$LD_LIBRARY_PATH　

- 验证CUDA Toolkit

  > nvcc -V

### 安装cuDNN



### 安装anaconda

- 下载Anaconda3-2020.02-Linux-x86_64.sh

- bash Anaconda3-2020.02-Linux-x86_64.sh
- gedit ~/.bashrc
- export PATH=“/home/Joe/anaconda3/bin:$PATH"
- source ~/.bashrc
- jupyter notebook

- see file1



### 安装Java

- sudo apt update
- sudo apt install openjdk-11-jdk
- java -version
- sudo update-alternatives 
- sudo nano /etc/environment
- JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64"
- source /etc/environment
- echo $JAVA_HOME



### 安装idea

- 下载.tar.gz
- 解压
- sudo mkdir JetBrains
- sudo mv
- ./idea.sh



### 安装pycharm

- 下载.tar.gz
- 解压
- sudo mkdir JetBrains
- sudo mv
- ./idea.sh



### 出现没有图标的情况

- sudo gedit /usr/share/applications/pycharm.desktop

  ```
  [Desktop Entry]
  Type=Application
  Name=Pycharm
  GenericName=Pycharm3
  Comment=Pycharm3:The Python IDE
  Exec=sh /home/oliver/下载/pycharm-community-2018.1.2/bin/pycharm.sh
  Icon=/home/oliver/下载/pycharm-community-2018.1.2/bin/pycharm.png
  Terminal=pycharm
  Categories=Pycharm;
  ```

  





### 查看电源信息

gnome-power-statistics





## Uninstall Ubuntu

### 修复引导

- ubuntu系统盘
- try ubuntu
- sudo add-apt-repository ppa:yannubuntu/boot-repair
- sudo apt-get update
- sudo apt-get install -y boot-repair
- boot repair
- Recommended repair



### 卸载引导

- cmd
- diskpart
- list disk
- select disk 2
- list partition
- select partition 系统
- assign letter = p
- 管理员记事本打开P盘
- 删除ubuntu
- remove letter = p

### 看进程
ps -ef|grep fep.driven
kill 进程号

### CURL是一个利用URL语法在命令行下进行文件传输的工具

- client + URL
- 1997年首次发行
- 支持文件的上传和下载
- FTP, FTPS, HTTP, HTTPS, SFTP, Gopher, SCP, Telnet ...



### 用法

#### 查看网页源代码

```bash
#获取网页源代码
curl http://swp.dms.bocoa.com/

#获取网页源代码并下载到本地
curl -o 1.xml http://swp.dms.bocoa.com/

#显示http response的头信息
curl -i 2.xml http://swp.dms.bocoa.com/

#显示http通讯过程，包括端口连接和http request头信息
curl -v 3.xml http://swp.dms.bocoa.com/
```

#### 发送表单信息

```bash
# 参数H代表请求头信息，参数d表示传输的数据内容，参数X表示指定什么命令
curl -H "Content-Type: application/json"
	-X POST
	-d '{"user_id": "123", "coin": 100, "success": 1, "msg": "OK!"}'
	"http://192.168.0.1:8001/test"
```
