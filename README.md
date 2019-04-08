# springDemo
learn to spring 

spring_01_helloworld 体验IOC AOP

1. 准备jar
2. 开发HelloWorld程序
3. 在applicationContext.xml中完成配置 如果获取xsd声明
4. 启动spring容器
5. 从容器中后去指定名称的bean
6. 调用bean方法

什么是BeanFactory?
BeanFactory是Spring最古老的接口，表示Spring IoC容器-- 生产bean对象的工厂，负责配置，
创建和管理bean
被Spring IOC容器管理的对象称为bean

Spring IoC容器如何知道哪些是它管理的对象呢?
需要配置文件，Spring IoC容器通过读取配置文件中的配置元数据，通过元数据对应用中的
各个对象进行实例化及装配。
元数据的配置有三种方式:
1. XML-based configuration
2. Annotation-bared configuration
3. Java-based configuration

Spring IoC管理bean的原理:
1. 通过Resource对象加载配置文件
2. 解析配置文件，得到指定名称的bean
3. 解析bean元素，id作为bean的名字，class用于反射得到bean实例
注意 此时，bean类必须存在一个无参数构造器 和访问权限无关
4. 调用getBean方法的时候，从容器中返回对象实例；
结论:就是把店面从JAVA文件中转移到了XML中

Spring IoC容器(Container)
BeanFactory:Spring最底层的接口，只提供了IoC功能，负责创建、
组装、管理bean，在应用中，一般不使用BeanFactory,而推荐使用
ApplicationContext 应用上下文

ApplicationContext接口继承了BeanFactory，除此之外
还提供AOP集成，国际化处理，事件传播，统一资源加载等功能。


```
public interface ApplicationContext 
           extends EnvironmentCapable, 
           ListableBeanFactory, 
           HierarchicalBeanFactory, 
           MessageSource, 
           ApplicationEventPublisher, 
           ResourcePatternResolver {
   }
```

bean实例化方式
1. 构造器实例化(无参数构造器)，最标准，使用最多
2. 静态工厂方法实例化：解决系统遗留问题
3. 实例工厂方法实例化：解决系统遗留问题
4. 实现FactoryBean接口实例化：实例工厂变种，如集成MyBatis框架使用:
org.mybatis.spring.SqlSessionFactoryBean

bean作用域
在spring容器中是指创建的bean对象相对于其他bean对象的请求可见范围
<bean id="" class="" scope="作用域" />

singleton:单例，在Spring IOC容器中仅存在一个Bean实例(默认的scope)

prototype:多例，每次从容器中调用Bean时，都返回一个新的实例，即每次调用getBean时，
相当于执行new XxxBean(); 不会在容器启动时创建对象

request:用于web开发，将Bean放入request范围，request.setAttribute("xxx"),
在同一个request 获得同一个Bean

session: 用于web开发，将Bean 放入Session范围，在同一个Session获得同一个Bean
globalSession: 一般用于Porlet应用环境，分布式系统存在全局session概念(单点登录)，
如果不是prolet环境，globalSession 等同于Session

application: Scopes a single bean definition to the lifecycle of a ServletContext.
Only valid in  the context of a web-aware Spring ApplicationContext.

websocket: Scopes a single bean definition to the lifecycle of a WebSocket.
Only valid in the context of a web-aware Spring ApplicationContext.

Spring5开始出现:websocket,globalSession作废。

###开发中主要使用: scope="singleton",scope="prototype"
####总结 struts1->action->request
    struts2->action->prototype
    其他使用singletoin
    
    