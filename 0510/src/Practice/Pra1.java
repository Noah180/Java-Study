//����һ����ݣ��жϸ�����Ƿ�Ϊ����

package Practice;

import java.util.Scanner;

public class Pra1 {
	public static void main(String[] args) {
		System.out.println("������һ����ݣ�");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if(year<1000||year>9999) {
			System.out.println("�������");
			System.exit(0);
		}
		//��+���ʽ1��ʾȡ��
		//������ʽ1��ֵΪ�棬���������ʽ��ֵΪ��
		//������ʽ1��ֵΪ�٣����������ʽ��ֵΪ��
		//if(year>=1000&&year<=9999) {
		if(!(year<1000||year>9999))	{
			
			//if(���ʽ){
			//	���1��
			//}else {			
			//	���2��
			//}
			//������ʽ��ֵΪ�棬��ִ�����1
			//������ʽ��ֵΪ�٣���ִ�����2
			//ע�����1�����2�ǲ��нṹ��ֻ��ִ��һ��
			
			boolean ret=(year%4==0)&&(year%100!=0)||(year%400==0);
			if(ret) {
						
			//if(year%4==0&&year%100!=0||year%400==0) {
				System.out.println("��һ��������");
			}else {
				 System.out.println("��һ�겻������");
			}
				
		}
			
	}

}
