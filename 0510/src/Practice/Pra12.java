//1.¼��༶������ѧԱ�ɼ�������༶ѧԱ��ƽ���ɼ�
//2.2012������ѧԱ8���ˣ�ÿ������25%�����ʰ��������ٶȣ�����һ����ѵѧԱ�������ﵽ20���ˣ�
//3.�����ꡢ�£��������һ��������ʼ����һ�칲�ж����죿

package Practice;

import java.util.Scanner;

public class Pra12 {
	public static void main(String[] args) {
		//1.¼��༶������ѧԱ�ɼ�������༶ѧԱ��ƽ���ɼ�
		System.out.println("������༶������");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int sum=0;
		System.out.println("������ѧԱ�ɼ���");
		for(int i=0;i<a;i++) {
			int b=input.nextInt();
			sum+=b;
		}
		int var=sum/a;
		System.out.println("ƽ���ɼ�Ϊ��");
		System.out.println(var);
		System.out.println("==================================");
		//2.2012������ѧԱ8���ˣ�ÿ������25%�����ʰ��������ٶȣ�����һ����ѵѧԱ�������ﵽ20���ˣ�
		int m=80000,n=200000;
		int j=0;
		while(m<=n) {
			m*=1.25;
			j++;
		}
		System.out.println(j);
		//3.�����ꡢ�¡��գ��������һ��������ʼ����һ�칲�ж����죿
		System.out.println("================================");
		System.out.println("��������ݣ�");
		Scanner input1=new Scanner(System.in);
		int Y=input.nextInt();
		if(Y<1000||Y>9999) {
			System.out.println("�������");
			System.exit(0);			
		}
		System.out.println("�������·ݣ�");
		int M=input.nextInt();
		if(M<1||M>12) {
			System.out.println("�������");
			System.exit(0);			
		}
		System.out.println("���������ڣ�");
		int D=input.nextInt();
		if(D<1||D>30) {
			System.out.println("�������");
			System.exit(0);			
		}
		int day_sum=0;
		for(int q=1;q<M;q++) {
			int day=0;
			switch(q) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day=30;
				break;
			case 2:
				if(((Y%4==0)&&(Y%100!=0))||(Y%400==0)) {
					day=29;
				}else {
					day=28;
				}
			}
			day_sum+=day;
		}
		int Day_sum=day_sum+D;
		System.out.println(Y+"��1��1�տ�ʼ����"+M+"��"+D+"��Ϊֹ����������"+Day_sum+"��");
	}

}
