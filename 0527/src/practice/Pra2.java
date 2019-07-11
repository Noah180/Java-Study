/*
	1.键盘录入行数和列数，输出对应的星形
	2.键盘录入一个数据n（1<=n<=9），输出对应的nn乘法表
 */


package practice;
import java.util.Scanner;

public class Pra2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入星形图形的行数：");
		int a=input.nextInt();
		System.out.println("请输入星形图形的列数：");
		int b=input.nextInt();
		star(a,b);
		System.out.println("---------------------------------");
		System.out.println("请输入一个数据：");
		int z=input.nextInt();
		list(z);
	}
	public static void star(int m,int n) {
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void list(int p) {
		for(int x=1;x<=p;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(y+"x"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
	}

}
