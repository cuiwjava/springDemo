package com.cuiwjava.impl;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * @Classname IocEntityResolver
 * @Description TODO
 * @Date 2019/6/12 21:29
 * @Created by cuiwei34
 */
public class IocEntityResolver implements EntityResolver {
	public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
		return null;
	}
}
