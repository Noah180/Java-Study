/*
	����һ���������࣬�������ܳ�������ķ�����Ȼ�����������в���
*/

package practice;

import java.util.Scanner;

class Square {
	//���峤�Ϳ�
	private int a;
	private int b;
	//���췽��
	public Square() {
		
	}
	public void setA(int a) {
		this.a=a;
	}
	
	public void setB(int b) {
		this.b=b;
	}
	
	//���ܳ�����
	public int getC(int a,int b) {
		return (a+b)*2;
	}
	
	//���������
	public int getA(int a,int b) {
		return a*b;
	}
}

public class Pri2 {
	public static void main(String[] args) {
		Square s=new Square();
		Scanner input=new Scanner(System.in);
		System.out.println("������ó����εĳ���");
		int a=input.nextInt();
		System.out.println("������ó����εĿ�");
		int b=input.nextInt();
		
		s.setA(a);
		s.setB(b);
		s.getC(a, b);
		System.out.println("�������ܳ�Ϊ��"+s.getC(a, b));
		s.getA(a, b);
		System.out.println("���������Ϊ��"+s.getA(a, b));
	}

}
