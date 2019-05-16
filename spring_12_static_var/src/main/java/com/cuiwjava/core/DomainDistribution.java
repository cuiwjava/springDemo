package com.cuiwjava.core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * http://www.zhongruitech.com/594885944.html
 */
public class DomainDistribution {
    static String x;
    //静态语句块
    static{
        x = "测试静态语句块。";
        System.out.println(x);
    }
    public static Map<String,Set<String>> domainMap = new LinkedHashMap<String,Set<String>>();
    /**
     * 静态调用方法测试
     * @param domainInfo
     */
    public static void setDomainInfo(String[] domainInfo) {

        for (String json : domainInfo) {
            System.out.println(json);
        }
    }

}