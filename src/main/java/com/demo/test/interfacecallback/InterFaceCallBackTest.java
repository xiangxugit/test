package com.demo.test.interfacecallback;
/**
 * 
 * @author admin
 * android接口回调的一些思考
 * 
 *
 */
public class InterFaceCallBackTest {
	public static void main(String[] args) {
		    Employee employee=new Employee(new Boss());
	        //启动控制器对象运行
	        employee.dowork();
	}
}
