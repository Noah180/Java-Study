/*
	�Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�����long���ͣ�����main�����н��в���
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
