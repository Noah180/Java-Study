/*
	���ʹ�ã�
	��һ��java�ļ���д�����ࣺһ�������࣬һ��������
	ע�⣺�ļ����ƺͲ���������һ�¡�
	���ʹ�ã�
		��������ʹ��
		
	��δ�������
		��ʽ�� ���� ������=new ����������
		
	���ʹ�ó�Ա������
		������.������
	���ʹ�ó�Ա������
		������.������
*/


package object_Orientation;

//ѧ����
class Student1 {
	//�������
	
	//����
	String name;
	//��
	int age;
	//��ַ
	String address;
	
	//���巽��
	//ѧϰ�ķ���
	public void study() {
		System.out.println("ѧ����ѧϰ");
	}
	
	//�Է��ķ���
	public void eat() {
		System.out.println("ѧϰ���ˣ�Ҫ�Է�");
	}
	
	//˯��
	public void sleep() {
		System.out.println("ѧϰ���ˣ�Ҫ˯��");
	}
	
}
//ѧ��������
class Text3{
	public static void main(String[] args) {
		//���� ������=new ����������
		Student1 s=new Student1();
		s.name="tian";
		s.age=1;
		s.address="beijing";
		//�����Ա����ֵ
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);
		
		//���÷���
		s.study();
		s.eat();
		s.sleep();
		
		
	}
}
