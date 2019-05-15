package com.cuiwjava.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 在执行调用的时候就会报错了！那原因是什么呢？
 * 原因还是很简单的，在调用Domain静态方法时，由于两个变量都是静态变量，不会对它进行赋值，但会对变量按顺序进行初始化。所以先给domain初始化，这个时候调用私有构造函数，函数内已经用到了domainMap,而这个变量还没有初始化，进而抛出了没有初始化类的异常。
 * 想要解决这个异常，两种方案。
 *
 * 把domain和domainMap的变量声明位置调换，这样在调用私有构造函数时domainMap已经初始化了。
 * 将domain的构造函数公有化，并使外部调用来初始化，而不是声明时即初始化。当然这样并不符合工具类的使用方便，会造成浪费内存等后果。
 *
 * 作者：syncwt
 * 链接：https://www.jianshu.com/p/127310cb90e0
 * 来源：简书
 * 简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。
 */
public class Domain {

    private static Domain domain = new Domain();

    private static Map<String,String> domainMap = new HashMap<String,String>();

    private Domain() {
        domainMap.put("isTrue","true");
    }

    public static Domain getInstance() {
        return domain;
    }
}