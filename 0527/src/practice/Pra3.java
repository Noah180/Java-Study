/*
	比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中进行测试
*/

package practice;
import java.util.Scanner;
public class Pra3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a1=1,a2=2;
		System.out.println(compare(a1,a2));
		
	}
	public static boolean compare(byte a,byte b) {
		System.out.println("byte");
		return ((a==b)?true:false);
	}
	public static boolean compare(short a,short b) {
		System.out.println("short");
		return ((a==b)?true:false);
	}
	public static boolean compare(int a,int b) {
		System.out.println("int");
		return ((a==b)?true:false);
	}
	public static boolean compare(long a,long b) {
		System.out.println("long");
		return ((a==b)?true:false);
	}
}
