package com.demo.test.interfacecallback;
/**
 * 　2创建回调接口的实现类，此例中，员工干完活后还要干什么事情是老板说了算的。

复制代码
 * @author admin
 *
 */
public class Boss implements CallBack {

	@Override
	public void doEvent() {
		// TODO Auto-generated method stub
		  System.out.println("打电话给老板，告知已经完成工作了");
	}

}
