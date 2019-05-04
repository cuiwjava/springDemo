package com.cuiwjava.log;

import java.util.Date;

/**
 * @Classname LogUtile
 * @Description TODO
 * @Date 2019/5/4/004 1:37
 * @Created by cuiwjava
 */
public class LogUtil {

    public void writeLog(String className,String methodName){
        System.out.println(new Date().toLocaleString() + "调用了"
                + className + "类中的" + methodName);
    }


}
