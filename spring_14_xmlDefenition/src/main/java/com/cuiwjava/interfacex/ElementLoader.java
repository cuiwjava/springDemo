package com.cuiwjava.interfacex;

import java.util.Collection;
import org.dom4j.Document;
import org.dom4j.Element;

/**
 * 加载Element元素
 *
 */
public interface ElementLoader {
    
    void addElements(Document doc);//添加元素
    
    Element getElement(String id);//获取元素
    
    Collection<Element> getElements();//获取所有的元素

}