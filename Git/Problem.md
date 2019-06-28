#### Problem

##### 1. Github每次上传文件都需要密码
在建立远程仓库或者clone时，使用的是HTTPS方式，HTTPS方式push不会保存用户名和密码，得使用SSH方式

**method：**<br>
* git remote -v 查看远程连接的方式
* git remote rm origin 删除原先的的连接方式
* github 上面找出该项目的复制地址(git@github.com:XXXXX)
* git remote add origin git@github.com:XXXXX
* git push origin(若出错，则先输入git push --set-upstream origin master)