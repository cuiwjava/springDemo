Joinpoint:连接点，被拦截到需要被增强的方法 where 去哪里做增强
Pointcut:切入点，哪些包中的哪些类中的哪些方法，可认为是连接点的集合。where 去哪些地方最增强
Advice:增强，当拦截到Joinpoint之后，在方法执行的什么时机where做什么样what 的增强。
根据时机分为: 前置增强，后置增强，异常增强，最终增强，环绕增强
Aspect:切面，Pointcut+Advice 去哪些地方+在什么时候+做什么增强
Target:目标对象，被代理的目标对象
Weaving:织入，把Advice加到Target上之后，创建出Proxy对象的过程。
Proxy:一个类被AOP织入增强后，产生的代理类

根据在连接点方法(Joinpoint，需要被增强的方法)中执行时机的不同，我们把增强划分为五种情况
before:前置增强 被增强方法执行之前执行 权限控制，日志记录等
after-returning:后置增强 被增强方法正常执行完毕后执行(中途无异常) 提交事务 统计分析数据结果等
after:最终增强 被增强方法无论是否有异常，最终都要执行的增强操作(finally)  释放资源等
around:环绕增强 可以自定义在被增强方法的什么时机执行(返回Object),参数processedingJoinpoint 缓存，性能日志，权限，事务管理

获取被增强方法信息，并可以传递给增强方法:
Spring AOP: Joinpoint类 连接点 访问呗增强方法的真实对象，代理对象，方法参数等等
可以做前置，后置，异常，最终增强方法的参数，第一个参数

ProceedingJoinpoint:是Joinpoint的子类