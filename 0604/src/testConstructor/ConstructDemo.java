/*
	���췽����
		����������ݽ��г�ʼ��
		
	��ʽ��
		A:��������������ͬ
		B:û�з���ֵ���ͣ���void��û��
		C:û�о���ķ���ֵ
		
	���췽����ע�����
		A:�������û�и������췽����ϵͳ���Զ��ṩһ���޲ι��췽��
		B:��������˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽��
			ע�⣺���ʱ���������ʹ���޲ι��췽�����ͱ����Լ�������������Զ�Լ������޲ι��췽��
		
	����Ա������ֵ�����ַ�ʽ��
		A:setXxx();
		B:���췽��
*/

package testConstructor;

class Student22 {
	private String name; //null
	private int age; //0
	public Student22() {
		System.out.println("���ǹ��췽��");
	}
	
	//���췽�������ظ�ʽ
	public Student22(String name) {
		System.out.println("����һ����String���͵Ĺ��췽��");
		this.name=name;
	}
	
	public Student22(int age) {
		System.out.println("����һ����int���͵Ĺ��췽��");
		this.age=age;
	}
	
	public Student22(String name,int age) {
		System.out.println("����һ������������Ĺ��췽��");
		this.name=name;
		this.age=age;
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
}

class ConstructDemo {
	public static void main(String[] args) {
		//��������
		Student22 s=new Student22();
		s.show();
		System.out.println("-------------");
		System.out.println(s);//Student22@18e8568
		
		Student22 s2=new Student22("tian");
		s2.show();
		System.out.println("-------------");
		
		Student22 s3=new Student22(2);
		s3.show();
		System.out.println("-------------");
		
		Student22 s4=new Student22("tian",3);
		s4.show();
	}
}
