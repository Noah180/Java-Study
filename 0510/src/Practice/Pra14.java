//��7����7�͹�

package Practice;

import java.util.Scanner;

public class Pra14 {
	public static void main(String[] args) {
		System.out.println("��˵һ����ʼ�����֣�");
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		if(i<=0||i>100) {
			System.out.println("������Ҫ��");
			System.exit(0);
		}
		for(;i<=100;i++) {
			
			if((i%7==0)||(i%10==7)||(i/10==7)) {
				continue;
			}
			System.out.println(i);
		}
		
			
		
			
	}
}
