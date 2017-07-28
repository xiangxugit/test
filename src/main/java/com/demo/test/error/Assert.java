package com.demo.test.error;

public class Assert {
		public static int i = 5;
		public static void main(String[] args) {
			assert i == 5;
			System.out.println("如果断言正常的话,就走");
		}
}
