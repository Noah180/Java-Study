/*
	����һ����MyMath����߻����ļӼ��˳����ܣ�Ȼ����в���
*/

package practice;

import java.util.Scanner;

class MyMath {
	//��ʱ��Ӧ�ö����Ա����
	
	
	
	
	//�ӷ�
	public int getSum(int num1,int num2) {
		return num1+num2;
	}
	
	//����
	public int getJian(int num1,int num2) {
		return num1-num2;
	}
	
	//�˷�
	public int getCheng(int num1,int num2) {
		return num1*num2;
	}
	
	//����
	public int getChu(int num1,int num2) {
		return num1/num2;
	}
	
}

class Pri4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("����������������");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		MyMath mm=new MyMath();
		System.out.println("��ѡ��������ţ�1.+��2.-��3.*��4./");
		int i=input.nextInt();
		
		switch(i) {
		case 1:
			
			System.out.println("����ǣ�"+mm.getSum(num1, num2));
			break;
		case 2:
			
			System.out.println("����ǣ�"+mm.getJian(num1, num2));
			break;
		case 3:
			
			System.out.println("����ǣ�"+mm.getCheng(num1, num2));
			break;
		case 4:
			
			System.out.println("����ǣ�"+mm.getChu(num1, num2));
			break;
			
		}
		
	}

	

	
	}


