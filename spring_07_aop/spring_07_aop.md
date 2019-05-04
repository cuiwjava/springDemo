Joinpoint:连接点，被拦截到需要被增强的方法 where 去哪里做增强
Pointcut:切入点，哪些包中的哪些类中的哪些方法，可认为是连接点的集合。where 去哪些地方最增强
Advice:增强，当拦截到Joinpoint之后，在方法执行的什么时机where做什么样what 的增强。
根据时机分为: 前置增强，后置增强，异常增强，最终增强，环绕增强
Aspect:切面，Pointcut+Advice 去哪些地方+在什么时候+做什么增强
Target:目标对象，被代理的目标对象
Weaving:织入，把Advice加到Target上之后，创建出Proxy对象的过程。
Proxy:一个类被AOP织入增强后，产生的代理类
