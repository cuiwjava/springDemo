package com.cuiwjava.tx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname TransactionManagerAdvice
 * @Description TODO
 * @Date 2019/4/23/023 7:11
 * @Created by cuiwjava
 */
public class TransactionManagerAdvice implements InvocationHandler{

    private Object target;
    // 真实对象 对谁做增强
    // 创建一个代理对象
    private TransactionManager transactionManager;

    public void setTarget(Object target) {
        this.target = target;
    }

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public <T> T getProxyObject(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),// 类加载器，一般跟上真实对象的类加载器
                target.getClass().getInterfaces(),// 真实对象所实现的接口(JDK动态代理必须要求真实对象有接口)
                this);// 如何做事务增强的对象
    }

    // 如何为真实对象的方法做增强的具体操作
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        System.out.println(method);
        transactionManager.begin();
        Object ret = null;// 调用真实对象的 方法
        try {
            // ---------------------------
            ret = method.invoke(target, args);
            transactionManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.rollback();
        }
        return ret;
    }
}
