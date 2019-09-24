### Redis

#### 数据类型
##### STRING
* SDS()

##### LIST
##### SET
##### HASH
##### ZSET

![avatar](3.redis数据类型.png)

#### 持久化
##### RDB
* 将某个点上的数据库状态保存到一个RDB文件中
* SAVE: 阻塞Redis服务器进程，直到RDB文件创建完成
* BGSAVE: 派生出一个子进程进行保存
* 载入RDB文件期间，会一直处于阻塞状态
* save选项，可以每隔一段时间自动执行一次BGSAVE命令
   * save 900 1
   * 在900s内，对数据库进行了至少一次修改

##### AOF
* AOF
* [RDB/AOF详解](https://segmentfault.com/a/1190000012908434?utm_source=tag-newest)
* [RDB/AOF区别](https://blog.csdn.net/sinat_35821285/article/details/79842188)
* [redis数据迁移](https://www.cnblogs.com/hygs/p/6826202.html)

#### 热点Key
##### 缓存穿透、缓存雪崩、缓存击穿
https://baijiahao.baidu.com/s?id=1619572269435584821&wfr=spider&for=pc

#### 采样方法判定热点key
哈希值采样，这样减少代价
（如何统计一定时间的哈希值）

#### 
1. hot key
   * 经常访问，如何处理
   * redis 保护自己被打挂 提供一个恢复方案
   * 客户端那边怎么处理

2. 分布式锁
   * 分布式锁挂的问题（设置锁的进程挂了，别人怎么处理)
   * 分布式锁如何去实现 

3. 备份
4. 同步
   * redis双副本，更新数据如何同步
   * 同步挂了如何保证数据的一致性
5. 基本原理
  数据结构怎么实现的 list，dict之类怎么实现的
  搜索的时间复杂度之类的
6. redis cluster
7. 缓存击穿
