//�ӿ���̨����������λ������ӡ������λ

package lianxi;

import java.util.Scanner;

public class Pra1 {
	public static void main(String[] args) {
		System.out.println("������һ����λ����");
		
		Scanner input=new Scanner(System.in);		
		int i=input.nextInt();
		int a=i/100;
		int c=i%10;
		int b1=i%100;
		int b=b1/10;
		
		System.out.println("��λ���ǣ�"+c);		
		System.out.println("ʮλ���ǣ�"+b);		
		System.out.println("��λ���ǣ�"+a);
		
		
	}

}
