/*
	��������������֪��
	�����Ĺ�����ͬ�������б�ͬ�������Ϊ�˼���֪�壬java����������һ��������
	jvm����ݲ�ͬ�Ĳ���ȥ���ò�ͬ�Ĺ���
	
	�������أ�
		��ͬһ�����У���������ͬ������������������Ͳ�ͬ���뷵��ֵ�����޹�
	
*/

package tian;

public class Text2 {
	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
	}
	//1.���������ĺ�
	public static int sum(int a,int b) {
		return a+b;
	}
	
	//2.���������ĺ�
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	//3.���ĸ����ĺ�
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
}
