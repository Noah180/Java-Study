//ʹ��whileѭ����ӡ1-100֮���ż����
//��ʹ��do-while��ӡ

package Practice;

import java.util.Scanner;

public class Pra13 {
	public static void main(String[] args) {
		//ʹ��while��ӡ 
		int i=1,sum=0;
		while(i<=100) {
			if(i%2==1) {
				sum+=i;
			}
			i++;
		}
		System.out.println("��Ϊ"+sum);
		System.out.println("==========================");
		//ʹ��do-while��ӡ
		int j=0,sum1=0;
		do {
			if(j%2==1) {
				sum1+=j;
			}
			j++;
		}while(j<=100);
		System.out.println("��Ϊ"+sum1);
	}

}
