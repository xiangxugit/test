package com.demo.test.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @see 创建一个继承了invocationHandler的处理器
 * @author admin
 *
 */
public class DynamicProxyHandler implements InvocationHandler{
	
	private Object proxied;
	
	
	 public DynamicProxyHandler(Object proxied) {
		// TODO Auto-generated constructor stub
		 System.out.println("动态代理的构造方法："+proxied.getClass());
		this.proxied = proxied;
	}
	 
	/**
	 * 
	 *  与代理对象相关联的InvocationHandler，只有在代理对象调用方法时，才会执行它的invoke方法
	 *  
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("动态代理的name"+proxy.getClass());
		System.out.println("动态代理的方法"+method.getName());
		System.out.println("动态代理的参数"+args);
		
		Object invokeObject  = method.invoke(proxied, args);
		if(invokeObject != null){
			 System.out.println("invoke object: " + invokeObject.getClass());
		}
		else{
			System.out.println("invoke object is null");	
		}
		return invokeObject;
		
		
		
		//后续的源码剖析还没看
		
	}

}
