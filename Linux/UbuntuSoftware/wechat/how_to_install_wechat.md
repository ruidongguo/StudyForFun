## Ubuntu安装微信

**Ubuntu 安装微信的坑与闲话**

---
### Step1： 网页版
开始用ubuntu的时候，没有pc版微信，好烦啊。<br>
然后最开始只好用网页版微信了。<br>
但是网页版真的难用啊<br>
因为是用chrome开的，doker上面都没有专门的微信栏。每次有消息，还得进入chrome才能点进去。<br>
贼鸡儿烦。

---
### Step2: 封装chrome app
网上找了个别人封装的微信chrome app(出处是真忘了，作者对不起哈哈)。<br>
已经压缩为本文件夹wechat.tar.gz<br>
对这个解压缩为文件夹，然后在chrome上安装app，就可以用了。<br>
相比于网页版，其好处doker上面多了一个微信的图标，容易点击，也容易和chrome分离。<br>
但是其也有网页版微信的一些缺点：
* 附件打不开啊啊啊啊要了我的命
* 重启没有聊天记录哈哈哈
* 微信自己的表情包、以及聊天记录转发都无法查看

---
### Step3: 第三方开发的wechat
chrome app版本的其实算挺好了。<br>
因为我又试着折腾了其他的方法，例如用第三方开发的wechat。
现在比较有名的第三方的包:　　[electronic wechat](https://github.com/geeeeeeeeek/electronic-wechat/releases)。<br>
但是其首先比较大，然后其也没有那么好用吧，而且也停止更新了。<br>
所以最后我又换回了chrome app版的微信。

---
### Step4: deepin-wine神器
因为不能打开附件真的伤透了我的心。<br>
所以我一直想尽了各种办法去折腾。<br>
大家都知道ubuntu有个wine，可以模拟安装windows的各种软件，但也会出现不兼容的情况。<br>
于是我确实先装了wine，然后用wine装exe，然后装上了打不开...<br>
于是我愁啊，然后百度发现了一个神器。
国产的deepin-wine。
下面甩方法：
* 安装[deepin-wine](https://github.com/wszqkzqk/deepin-wine-ubuntu)
(国内可以git clone https://gitee.com/wszqkzqk/deepin-wine-for-ubuntu.git) 。具体步骤见github的 ReadMe.md
* 安装好后，直接下载并运行[wechat.deb](https://mirrors.aliyun.com/deepin/pool/non-free/d/deepin.com.wechat/)
* 此时wechat就能用了，但可能还会遇到一些问题。例如会有软件托盘不显示问题。
解决方案如下：
```
安装gnome-tweak-tool(sudo apt install gnome-tweak-tool)
安装TopIcons Plus(进入官网下载)并设置。
```
* 此时wechat基本都能用了。但是Ubuntu下面，偶尔还会在微信界面前出现一个小黑框。
我百度了下，有人写了脚本，但是我用了好像不行(这个后续看有没有解决办法吧)。
目前的解决办法是退出扫码登录，就可以没有黑框了。
* [快捷键设置](https://wiki.deepin.org/wiki/Deepin-wine)

怎么说呢，deepin-wine的微信，或多或少还会有一些小问题的吧。但是，总体来说！！还是很好。起码能够支持大部分的操作了。这样在Ubuntu下，与人交流也方便多啦！