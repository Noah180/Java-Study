/*
	定义一个类Demo，其中定义一个求两个数据和的方法，定义一个测试类,进行测试
	
	变量什么时候定义为成员变量：
		如果这个变量是用来描述这个类的信息的，那么，该变量就应该定义为成员变量。
		
	变量的范围越小越好，因为能及时的被回收。
*/

package practice;

import java.util.Scanner;

//定义一个Demo类
class Plus {
	//两个数据
	private int num1;
	private int num2;
	
	//构造方法
	public Plus() {
		
	}
	
	//求和
	public int getPlus(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		return num1+num2;
	}
	
}

public class Pri1 {
	public static void main(String[] args) {
		Plus sum=new Plus();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个数：");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("和为：");
		sum.getPlus(num1, num2);
		System.out.println(sum.getPlus(num1, num2));
		
	}

}
