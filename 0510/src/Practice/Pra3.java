//做一个简单的计算器，可以实现任意两个数加减乘除，并显示结果

package Practice;

import java.util.Scanner;

public class Pra3 {
	public static void main(String[] args) {
		System.out.println("请选择：");
		System.out.print("1-加法、");
		System.out.print("2-减法、");
		System.out.print("3-乘法、");
		System.out.println("4-除法");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();		
		if(a==1) {
			System.out.println(b+c);
		}else if(a==2) {
			System.out.println(b-c);
		}else if(a==3) {
			System.out.println(b*c);
		}else {
			System.out.println(b/c);
		}
	}

}
