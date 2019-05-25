package com.cuiwjava.base;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by wangmeiqing on 2015/9/29.
 */

public abstract class AbstractInterceptor {
    public abstract Object intercept(ProceedingJoinPoint pjp) throws Throwable;

    protected Method getMethod(JoinPoint jp) throws NoSuchMethodException {
        Signature sig = jp.getSignature();
        MethodSignature msig = (MethodSignature) sig;
        return getClass(jp).getMethod(msig.getName(), msig.getParameterTypes());
    }

    protected Class<? extends Object> getClass(JoinPoint jp)
            throws NoSuchMethodException {
        return jp.getTarget().getClass();
    }
}
