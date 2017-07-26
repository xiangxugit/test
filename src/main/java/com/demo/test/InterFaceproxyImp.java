package com.demo.test;

public class InterFaceproxyImp implements InterFaceproxy{

	@Override
	public void getMyname() {
		// TODO Auto-generated method stub
		System.out.println("my name is xiangxu");
	}

	@Override
	public String getNameById(String id) {
		// TODO Auto-generated method stub
		System.out.println("id"+id);
		
		return "xiangxu";
	}

}
