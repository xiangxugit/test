package com.demo.test;

public class SimpleProxy implements InterFaceproxy {
	
	public SimpleProxy(InterFaceproxy proxied) {
		super();
		this.proxied = proxied;
	}

	//接口
	private InterFaceproxy proxied;
	
	
	
	@Override
	public void getMyname() {
		// TODO Auto-generated method stub
			System.out.println("简单代理类获取name");
			proxied.getMyname();
	}

	@Override
	public String getNameById(String id) {
		// TODO Auto-generated method stub
		System.out.println("简单代理类获取getnameById");
		return  proxied.getNameById(id);
		
	}

}
