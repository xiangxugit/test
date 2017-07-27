package com.demo.test.interfacecallback;
/**
 * 创建控制类，也就是本例中的员工对象，他要持有老板的地址（既回调接口）
 * @author admin
 *
 */
public class Employee {
	CallBack callback;
	public Employee(CallBack callback){
		this.callback = callback;
		
	}
	
	public void dowork(){
		System.out.println("员工开始做工作");
		System.out.println("做完了");
		callback.doEvent();
	}
}
