/*
	1.���������������ݣ������������еĽϴ���
	2.���������������ݣ��Ƚ��������Ƿ����
	3.���������������ݣ������������е����ֵ
 */

package practice;

import java.util.Scanner;

public class Pra1 {
	public static void main(String[] args) {
		System.out.println("��������������");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		int z=input.nextInt();
		int r1=result1(x,y);
		boolean r2=result2(x,y);
		int r3=result3(x,y,z);
		System.out.println("ǰ�����������ǣ�"+r1);
		System.out.println("ǰ�������Ƿ���ȣ�"+r2);
		System.out.println("�����������ǣ�"+r3);
		
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
