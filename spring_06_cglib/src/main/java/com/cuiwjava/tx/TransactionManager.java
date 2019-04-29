package com.cuiwjava.tx;

/**
 * @Classname TransactionManager
 * @Description TODO
 * @Date 2019/4/21/021 23:58
 * @Created by cuiwjava
 */
// 模拟事务管理器
public class TransactionManager {

    public void begin(){
        System.out.println("开启事务");
    }

    public void commit(){
        System.out.println("提交事务");
    }

    public void rollback(){
        System.out.println("回滚事务");
    }
}
