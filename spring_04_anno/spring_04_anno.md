Spring 规范提供
1. 可以让Spring自动的把属性需要的对象找出来，并注入到对象
2. 可以贴在字段或者setter上面
3. 可以同时注入多个对象

@Autowired
public void setter(OtherBean otherBean , OtherBean other2){
}

4.可以注入一些Spring内置的重要对象，比如BeanFactory,ApplicationContext,ServletContext等;
5.默认情况下Autowired注解必须要能找到对应的对象，否则报错。
    通过required=false 来避免这个问题 @Autowired(required=false)
6.第三方程序:Spring3.0之前，需要手动配置Autowired注解的解析程序;

```
<context:annotation-config/>
// 在Web开发中必须配置
```

7.Autowired注解寻找bean方式:

1).首先按照依赖对象的类型找，如果找到，就是setter或者字段直接注入;
2).如果在Spring上下文中找到多个匹配的类型,再按照名字去找，如果没有匹配报错;
3).可以通过使用@Qualifier("other")标签来规定依赖对象 按照bean的id和类型的组合方式去找;