/*
	�ֻ���Ĳ���
*/

package practice_OO;

class Phone{
	//�������
	String color;
	String brand;
	int price;
	
	//���巽��
	public static void call() {
		System.out.println("�ֻ����Դ�绰");
	}
	
	public static void play() {
		System.out.println("�ֻ����Դ���Ϸ");
	}
	
	public static void watch() {
		System.out.println("�ֻ����Կ���Ӱ");
	}
}

public class phoneDemo {
	public static void main(String[] args) {
		//����һ������
		Phone p=new Phone();
		System.out.println(p.color);
		System.out.println(p.color);
		System.out.println(p.price);
		p.color="red";
		p.brand="iPhone 8";
		p.price=1000;
		System.out.println(p.color);
		System.out.println(p.color);
		System.out.println(p.price);
		
		//���÷���
		p.call();
		p.play();
		p.watch();
	}
	
	

}
