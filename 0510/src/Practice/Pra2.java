//�ӿ���̨����һ�������ж�����������ż��

package Practice;

import java.util.Scanner;

public class Pra2 {
	public static void main(String[] args) {
		System.out.println("������һ������");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if(a==0) {
			System.out.println("0�Ȳ���������Ҳ����ż����");
		}else {
			if(a%2==0) {
				System.out.println("�������ż��");
			}else {
				System.out.println("�����������");
				
			}
			
		}
	}

}
