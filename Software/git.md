# Git operation

### Goal: Operate version control with git

- git pull //get the latest version

- git pull --rebase 

- git checkout //go to the branch

- git checkout -b // creat a new branch

- git add

- git commit -m "I am a smart boy"

- git push 

pwd             用于显示当前目录 【请确保目录名（包括父目录）不包含中文。】
git init        把这个目录变成Git可以管理的仓库
git add         把文件添加到仓库，实际上是把文件修改添加到暂存区
git commit      把文件提交到仓库，实际上就是把暂存区的所有内容提交到当前分支；
                -m后面输入的是本次提交的说明，可以输入任意内容，当然最好是有意义的，这样你就能从历史记录里方便地找到改动记录。 
git status      时刻掌握仓库当前的状态【文件是否被修改过】
git diff        查看具体修改了什么内容
git log         查看历史记录，显示从最近到最远的提交日志，以便确定要回退到哪个版本
                    【git log--pretty=oneline可以看到版本号commit id,append GPL的commit id是第一行前七位】
                    【git log --graph】看分支合并图
git reset       回退到上一个版本
                    【git reset --hard HEAD^】上上一版本是HEAD^^
                    【git reset HEAD file】还可以把暂存区的修改回退到工作区
cat             查看文件内容
git reflog      查看命令历史，以便确定要回到未来的哪个版本
git checkout        【git checkout --file】撤销/丢弃文件在工作区的全部修改，也就是让文件回到最近一次git commit或git add时的状态
                    【git checkout -b 分支名】创建并切换分支
git rm              【git rm file】删除文件，commit后文件就从版本库中被删除了
git push            【git push origin master】把本地库的内容推送到远程，实际上是把当前分支master推送到远程，每次本地提交后就可以用来推送最新修改
git clone           【git clone 仓库地址】克隆一个仓库
git branch      查看所有分支，当前分支前会标上一个*号
                    【git branch name】创建分支
                    【git branch -d name】删除分支
                    【git branch -D feature-vulcan】强行删除一个没有被合并的分支
git stash       把当前工作现场“储藏”起来
                    【git stash list】查看工作现场存储在哪里
                    【git stash apply】恢复工作现场
                    【git stash drop】删除stash内容
git remote      查看远程库的信息
git pull        远程抓取分支
git tag name    打一个新标签
git tag         查看所有的标签
                    【git tag name commit id】给这个name打上commitid这个标签
                    【-a tagname -m 】 -a指定标签名，-m指定说明文字
                    【-s tagname -m】
                    【git tag -d tagname】删除标签
git show tagname查看标签信息
                            
                               