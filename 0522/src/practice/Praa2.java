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

public class Praa2 {
	public static void main(String[] args) {
		
		//1.�ӿ���̨�����·�m
		System.out.println("�������·ݣ�");
		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		
		//2.��ʾ�˵�
		System.out.println("--->2018��"+month+"��<---");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		
		//3.���㱾�¹��ж�����
		int monthDay=0,dayFeb=0;
		switch(month) {
		case 2:
			int year=2018;
			if((year%4==0&&year%100!=0)||(year%400==0)) {
				monthDay=29;
			}else {
				monthDay=28;
			}
			dayFeb=monthDay;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			monthDay=30;
			break;
		default:
			monthDay=31;
			break;
		}
		
		//4.��һ�������ڼ�
		//4.1 ���������m-1��ĩ���ж�����
		int day=0;
		/*switch(month) {
		case 12:
			day+=31;
		case 11:
			day+=30;
		case 10:
			day+=31;
		case 9:
			day+=30;
		case 8:
			day+=31;
		case 7:
			day+=31;
		case 6:
			day+=30;
		case 5:
			day+=31;
		case 4:
			day+=30;
		case 3:
			day+=31;
		case 2:
			day+=dayFeb;
		case 1:
			day+=31;			
		}*/
		for(int i=1;i<month;i++) {
			if(i==2) {
				day+=dayFeb;
			}else if(i==4||i==6||i==9||i==11) {
				day+=30;
			}else {
				day+=31;
			}
		}
		
		//4.2 ��������d���m�·ݵ�һ�������ڼ�
		int week=day%7+1;
		
		//5.��ӡ��������
		
		for(int i=1;i<=week;i++) {
			System.out.print("\t");
		}
		int tmp=0;
		for(int i=1;i<=monthDay;i++) {
			System.out.print(i+"\t");
			if(i+week==7) {
				//System.out.println();
				tmp=i;
			}
			if((i-tmp)%7==0) {
				System.out.println();
			}
		}
	}

}
