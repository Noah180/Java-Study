/*
	��׼����
	
	ѧ���ࣺ
		��Ա������
			name��age
		���췽����
			�޲Σ�����������
		��Ա������
			getXxx()/setXxx()
			show():�����������г�Ա����ֵ
			
	����Ա������ֵ��
		A:setXxx()����
		B:���췽��
	
	�����Ա����ֵ�ķ�ʽ��
		A:ͨ��getXxx()�ֱ��ȡȻ��ƴ��
		B:ͨ������show()�����㶨
*/

package practice;

class Student44 {
	private String name;
	private int age;
	
	public Student44() {
		System.out.println("����һ���޲ι��췽��");
	}
	
	public Student44(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("����һ�����ι��췽��");
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student44 s=new Student44();
		s.setName("tian");
		s.setAge(11);
		
		
		System.out.println(s.getName()+"---"+s.getAge());
		s.show();
		
		System.out.println("--------------------");
		
		Student44 s1=new Student44("tian",3);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		
		
	}
}
