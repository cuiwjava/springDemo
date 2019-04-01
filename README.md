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


