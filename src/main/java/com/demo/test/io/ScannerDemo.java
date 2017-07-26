package com.demo.test.io;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		if(scan.hasNext()){
			String str2 = scan.nextLine();
	         System.out.println("输入的数据为："+str2);  
		}
	}
}
