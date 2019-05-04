# springDemo
learn to spring 


如果动态的创建一份字节码
由于JVM通过字节码的二进制信息加载类的，如果我们在运行期系统中，遵循Java编译系统组织.class文件的格式
和结果，生成相应的二进制数据，然后再把这个二进制数据加载转换成对应的类。
如此，就完成了在代码中动态创建一个类的能力了。


动态代理
在程序运行期间由JVM通过反射等机制动态的生成的，所以不存在代理类的字节码文件，
代理对象和真实对象的关系在程序运行时期才确定的。

如果实现动态代理:

1):针对有接口: 使用JDK动态代理
2):针对无接口: 使用CFLIB或Javassist组件

JDK动态代理API分析: (必须要求真实对象是有接口)
1.java.lang.reflect.Proxy 类:Java动态代理机制生成的所有动态代理类的父类，它提供了一组
静态方法来为一组接口动态地生成代理类及其对象。

主要方法 public staticOBjectnewProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler hanlder))
方法职责: 为指定类加载器、一组接口及调用处理器生成动态代理类实例

参数:
leader 类加载器，一般传递真实对象的类加载器
interfaces 代理类需要实现的接口
handlder 代理对象如何做增强
返回: 创建的代理对象
2、java.lang.reflect.InvocationHandler接口: public Object invoke(Object proxy, Method method,
Object[] args)
方法职责: 负责集中处理动态代理类上的所有方法调用
参数：
proxy 生成的代理对象
method 当前调用的真实方法对象
args 当前调用方法的实参
返回: 真实方法的返回结果n
jdk动态代理操作步骤

1.实现InvocationHandler接口, 创建自己增强代码的处理器

Filter就是对请求和相应做拦截
Interceptor 整个Java领域的概念 不仅可以运用到service层,
还可以用到Web层

需求: 在每一个service方法调用之前，做日志记录
