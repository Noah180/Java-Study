/*
	�����ɣ�
		��Ա����
		���췽��
		��Ա����
			���ݷ���ֵ��
				void����
				��void����
			������ʽ������
				�ղη���
				�ǿղη���
				
			
*/

package testConstructor;

class Student33 {
	public String getString() {
		return "hello";
	}
	
	public void show() {
		System.out.println("show");
	}
	
	public void method(String name) {
		System.out.println(name);
	}
	
	public String function(String s1,String s2) {
		return s1+s2;
	}
}

public class Text {
	public static void main(String[] args) {
		Student33 s=new Student33();
		
		//�����޲��޷���ֵ����
		s.show();
		
		System.out.println("-----------------");
		
		//�����޲��з���ֵ����
		String result=s.getString();
		System.out.println(result);
		
		System.out.println("-------------------");
		
		//���ô����޷���ֵ�ķ���
		s.method("tian");
		
		System.out.println("-------------------");
		
		//���ô��δ�����ֵ�ķ���
		String result2=s.function("hello", "world");
		System.out.println(result2);
	}
}
