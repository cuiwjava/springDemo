关于性能:
JDK动态代理是基于实现接口的 CGLIB和Javassist是基于集成委托类的 
从性能上考虑:
Javassit > CGLIB > JDK
struts2拦截器和Hibernate延迟加载对象，采用的是Javassis的方式
对接口创建代理由于对类创建代理，因为会产生更加松耦合的系统，也更符合面相接口编程规范;
若委托对象实现了若干接口，优先选用JDK动态代理.
若委托对象没有实现任何接口，使用Javassist和CGLIB动态代理
