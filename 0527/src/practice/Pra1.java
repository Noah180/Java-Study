/*
	1.键盘输入两个数据，返回两个数中的较大者
	2.键盘输入两个数据，比较两个数是否相等
	3.键盘输入三个数据，返回三个数中的最大值
 */

package practice;

import java.util.Scanner;

public class Pra1 {
	public static void main(String[] args) {
		System.out.println("请输入三个数：");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		int z=input.nextInt();
		int r1=result1(x,y);
		boolean r2=result2(x,y);
		int r3=result3(x,y,z);
		System.out.println("前两个数最大的是："+r1);
		System.out.println("前两个数是否相等："+r2);
		System.out.println("三个数最大的是："+r3);
		
	}
	public static int result1(int a,int b) {
		int ret1;
		if(a>b) {
			ret1=a;
		}else {
			ret1=b;
		}
		return ret1;		
	}
	public static boolean result2(int a,int b) {
		boolean ret2;
		ret2=(a==b);
		return ret2;
	}
	public static int result3(int a,int b,int c) {
		int ret3=a;
		if(ret3<b) {
			ret3=b;
		}
		if(ret3<c) {
			ret3=c;
		}
		return ret3;
	}

}
