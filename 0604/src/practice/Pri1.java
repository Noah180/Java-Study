/*
	����һ����Demo�����ж���һ�����������ݺ͵ķ���������һ��������,���в���
	
	����ʲôʱ����Ϊ��Ա������
		����������������������������Ϣ�ģ���ô���ñ�����Ӧ�ö���Ϊ��Ա������
		
	�����ķ�ΧԽСԽ�ã���Ϊ�ܼ�ʱ�ı����ա�
*/

package practice;

import java.util.Scanner;

//����һ��Demo��
class Plus {
	//��������
	private int num1;
	private int num2;
	
	//���췽��
	public Plus() {
		
	}
	
	//���
	public int getPlus(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		return num1+num2;
	}
	
}

public class Pri1 {
	public static void main(String[] args) {
		Plus sum=new Plus();
		Scanner input=new Scanner(System.in);
		System.out.println("��������������");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("��Ϊ��");
		sum.getPlus(num1, num2);
		System.out.println(sum.getPlus(num1, num2));
		
	}

}
