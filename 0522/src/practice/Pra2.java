//��֪2018��1��1��������һ���ӿ���̨���������·ݣ�����ӡ�����µ�����
//1.�ӿ���̨�����·�m
//2.��ʾ�˵�
//3.���㱾�¹��ж�����
//4.��һ�������ڼ�
//4.1 ���������m-1��ĩ���ж�����
//4.2 ��������d���m�·ݵ�һ�������ڼ�
//5.��ӡ��������

package practice;

import java.util.Scanner;

public class Pra2 {
	public static void main(String[] args) {
		//�ӿ���̨�����·�m
		System.out.println("�������·ݣ�");
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		if((m<1)||(m>12)) {
			System.out.println("�������");
			System.exit(0);
		}else {
			//2.��ʾ�˵�
			System.out.println("--------------------->2018��"+m+"��<--------------------");
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			System.out.println();
			int d=0,day=0;
			//3.���㱾���ж�����
			switch(m) {			
			case 2:
				d=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				d=30;
				break;				
			default:
				d=31;
				break;
			}
			//4.1���������m-1�¹��ж�����
			for(int i=1;i<m;i++) {
				switch(i) {
				case 2:
					d=28;
					break;
				case 4:
				case 6:
				case 9:
				case 11: 
					d=30;
					break;				
				default:
					d=31;
					break;
				}
				day+=d;
			}
			//4.2�����m�·ݵĵ�һ�������ڼ�
			int t=day%7;
			//��m�·ݵĵ�һ��������t+1
			//��ӡ����
			if(t<6) {
				for(int j=1;j<=t;j++) {
					System.out.print("\t");
				}
			}
			int n1=1;
			for(int n=1;n<=d;n++) {
				
					System.out.print(n+"\t");
				
				//System.out.println();				
			}
				
		}
	}

}
