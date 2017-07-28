package com.demo.test.error;

public class ErrorTest {
		public static void main(String[] args) {
			 int age = 220;
		        try {
		            AgeInput.checkAage(age);
		        } catch (AgeOutOfBound e) {
		             System.out.println("Are you rellly :" + age + " years old?");
		        }
		}
}
