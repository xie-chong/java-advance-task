
## 4.（必做）根据上述自己对于 1 和 2 的演示，写一段对于不同 GC 和堆内存的总结



### 不同 GC 总结：

* **Serial GC**，其收集工作是单线程的，并且在进行垃圾收集过程中，会进入臭名昭著的“Stop-The-World”状态。当然，其单线程设计也意味着精简的 GC 实现，无需维护复杂的数据结构。

Serial GC 的对应 JVM 参数是：
```
-XX:+UseSerialGC
```
* **ParNew GC**，很明显是个新生代 GC 实现，它实际是 Serial GC 的多线程版本，最常见的应用场景是配合老年代的 CMS GC 工作，下面是对应参数
```
-XX:+UseConcMarkSweepGC -XX:+UseParNewGC
```
* **CMS（Concurrent Mark Sweep） GC**，基于标记 - 清除（Mark-Sweep）算法，设计目标是尽量减少停顿时间，但是，CMS 采用的标记 - 清除算法，存在着内存碎片化问题，所以难以避免在长时间运行等情况下发生 full GC，导致恶劣的停顿。并发（Concurrent），CMS 会占用更多 CPU 资源，并和用户线程争抢。（6个阶段）

* **Parrallel GC**，在早期 JDK 8 等版本中，它是 server 模式 JVM 的默认 GC 选择，也被称作是吞吐量优先的 GC。它的算法和 Serial GC 比较相似，尽管实现要复杂的多，其特点是新生代和老年代 GC 都是并行进行的，在常见的服务器环境中更加高效。
开启选项是：
```
-XX:+UseParallelGC
```

* **G1 GC** 这是一种兼顾吞吐量和停顿时间的 GC 实现，是 Oracle JDK 9 以后的默认 GC 选项。G1 可以直观的设定停顿时间的目标


* **ZGC**，具备令人惊讶的扩展能力，支持 T bytes 级别的堆大小，并且保证绝大部分情况下，延迟都不会超过 10 ms。



### 堆内存：

按年代来划分内存，分为新生代(1个enden区和2个survivor区构成)、老年代、永久代（jdk8以后被元数据区取代）

老年代和新生代的比例，默认NewRatio = 2    
Eden 和 Survivor 的大小，默认SurvivorRatio=8   
