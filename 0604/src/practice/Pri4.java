/*
	定义一个类MyMath，提高基本的加减乘除功能，然后进行测试
*/

package practice;

import java.util.Scanner;

class MyMath {
	//这时候不应该定义成员变量
	
	
	
	
	//加法
	public int getSum(int num1,int num2) {
		return num1+num2;
	}
	
	//减法
	public int getJian(int num1,int num2) {
		return num1-num2;
	}
	
	//乘法
	public int getCheng(int num1,int num2) {
		return num1*num2;
	}
	
	//除法
	public int getChu(int num1,int num2) {
		return num1/num2;
	}
	
}

class Pri4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个整数：");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		MyMath mm=new MyMath();
		System.out.println("请选择运算符号：1.+、2.-、3.*、4./");
		int i=input.nextInt();
		
		switch(i) {
		case 1:
			
			System.out.println("结果是："+mm.getSum(num1, num2));
			break;
		case 2:
			
			System.out.println("结果是："+mm.getJian(num1, num2));
			break;
		case 3:
			
			System.out.println("结果是："+mm.getCheng(num1, num2));
			break;
		case 4:
			
			System.out.println("结果是："+mm.getChu(num1, num2));
			break;
			
		}
		
	}

	

	
	}


