package com.demo.test;

public class SimpleTest {
		private static void consume(InterFaceproxy iface){
			iface.getMyname();
			String name = iface.getNameById("1");
			System.out.println("name"+name);
		}
		
		public static void main(String[] args) {
			consume(new InterFaceproxyImp());
			System.out.println("______________");
			consume(new SimpleProxy(new InterFaceproxyImp()));
		}
}	
