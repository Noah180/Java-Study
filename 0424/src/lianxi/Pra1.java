//从控制台输入任意三位数，打印出各个位

package lianxi;

import java.util.Scanner;

public class Pra1 {
	public static void main(String[] args) {
		System.out.println("请输入一个三位数：");
		
		Scanner input=new Scanner(System.in);		
		int i=input.nextInt();
		int a=i/100;
		int c=i%10;
		int b1=i%100;
		int b=b1/10;
		
		System.out.println("个位数是："+c);		
		System.out.println("十位数是："+b);		
		System.out.println("百位数是："+a);
		
		
	}

}
