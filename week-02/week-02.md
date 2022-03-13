
## 4.（必做）根据上述自己对于 1 和 2 的演示，写一段对于不同 GC 和堆内存的总结



### 不同 GC 总结：


### 堆内存：

按年代来划分内存，分为新生代(1个enden区和2个survivor区构成)、老年代、永久代（jdk8以后被元数据区取代）

老年代和新生代的比例，默认NewRatio = 2    
Eden 和 Survivor 的大小，默认SurvivorRatio=8   
