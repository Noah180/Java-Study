//��һ���򵥵ļ�����������ʵ�������������Ӽ��˳�������ʾ���

package Practice;

import java.util.Scanner;

public class Pra3 {
	public static void main(String[] args) {
		System.out.println("��ѡ��");
		System.out.print("1-�ӷ���");
		System.out.print("2-������");
		System.out.print("3-�˷���");
		System.out.println("4-����");
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
