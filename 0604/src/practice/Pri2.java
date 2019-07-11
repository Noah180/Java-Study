/*
	定义一个长方形类，定义求周长和面积的方法，然后定义测试类进行测试
*/

package practice;

import java.util.Scanner;

class Square {
	//定义长和宽
	private int a;
	private int b;
	//构造方法
	public Square() {
		
	}
	public void setA(int a) {
		this.a=a;
	}
	
	public void setB(int b) {
		this.b=b;
	}
	
	//求周长方法
	public int getC(int a,int b) {
		return (a+b)*2;
	}
	
	//求面积方法
	public int getA(int a,int b) {
		return a*b;
	}
}

public class Pri2 {
	public static void main(String[] args) {
		Square s=new Square();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入该长方形的长：");
		int a=input.nextInt();
		System.out.println("请输入该长方形的宽：");
		int b=input.nextInt();
		
		s.setA(a);
		s.setB(b);
		s.getC(a, b);
		System.out.println("长方形周长为："+s.getC(a, b));
		s.getA(a, b);
		System.out.println("长方形面积为："+s.getA(a, b));
	}

}
