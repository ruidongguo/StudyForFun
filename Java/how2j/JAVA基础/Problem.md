### 遇到的坑

#### 1.HelloWorld

**java HelloWorld时，出现了如下问题:**
**错误: 找不到或无法加载主类 HelloWorld**<br>

* 网上查了下资料，发现是ubuntu系统java的CLASSPATH有问题。
* before: CLASSPATH=\$:CLASSPATH:\$JAVA_HOME/lib
只在JAVA_HOME的lib里面查找class，找不到
* afeter: CLASSPATH=\$:CLASSPATH:\$JAVA_HOME/lib:.
增加了当前目录.，这样就可以编译java了