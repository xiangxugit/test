package com.demo.test.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.demo.test.InterFaceproxy;
import com.demo.test.InterFaceproxyImp;

public class DynamicProxyMain {
	
	public static void consumer(InterFaceproxy iface){
		iface.getMyname();
	/*	String name = iface.getNameById("1");
		System.out.println("name"+name);*/
	}
	
	
	//测试动态代理咯
	public static void main(String[] args) {
		InterFaceproxyImp realObject = new InterFaceproxyImp();
		consumer(realObject);
		System.out.println("_________________");
		//动态代理
        ClassLoader lcassloader = InterFaceproxy.class.getClassLoader();
        
        System.out.println(lcassloader);
        Class<?>[] InterFaceproxys = new Class[] { InterFaceproxy.class };
        
        System.out.println(InterFaceproxys);
        
        InvocationHandler handler = new DynamicProxyHandler(realObject);

        InterFaceproxy proxy = (InterFaceproxy) Proxy.newProxyInstance(lcassloader, InterFaceproxys, handler);
        System.out.println("in dynamicproxyMain proxy: " + proxy.getClass());
        consumer(proxy);
        

	}

}
