/*
	1.����¼�������������������Ӧ������
	2.����¼��һ������n��1<=n<=9���������Ӧ��nn�˷���
 */


package practice;
import java.util.Scanner;

public class Pra2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("����������ͼ�ε�������");
		int a=input.nextInt();
		System.out.println("����������ͼ�ε�������");
		int b=input.nextInt();
		star(a,b);
		System.out.println("---------------------------------");
		System.out.println("������һ�����ݣ�");
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
