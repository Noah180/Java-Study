/*
	方法命名：见名知义
	方法的功能相同，参数列表不同的情况，为了见名知义，java允许它们起一样的名字
	jvm会根据不同的参数去调用不同的功能
	
	方法重载：
		在同一个类中，方法名相同，参数个数或参数类型不同，与返回值类型无关
	
*/

package tian;

public class Text2 {
	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
	}
	//1.求两个数的和
	public static int sum(int a,int b) {
		return a+b;
	}
	
	//2.求三个数的和
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	//3.求四个数的和
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
}
