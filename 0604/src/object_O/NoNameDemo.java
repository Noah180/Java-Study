/*
	�������󣺾���û�����ֵĶ���
		
	���������Ӧ�ó�����
		A:���÷���������ֻ����һ�ε�ʱ��
			���ö�ε�ʱ���ʺϡ�
			��ô����������������ʲô�ô���
				�������������Ͼ������������Ա��������������ա�
		B:�������������Ϊʵ�ʲ������ݡ�
*/

package object_O;

class Student2 {
	public void show() {
		System.out.println("�Ҳ���ѧϰ");
	}
}

class StudentDemo1 {
	public void method(Student2 s) {
		s.show();
	}
}

class NoNameDemo {
	public static void main(String[] args) {
		//�����ֵĵ���
		Student2 s=new Student2();
		s.show();
		System.out.println("------------------");
		
		//��������
		new Student2().show();
		
		//����������Ϊʵ�ʲ�������
		StudentDemo1 sd=new StudentDemo1();
		Student2 s1=new Student2();
		sd.method(s1); //�����s1��һ��ʵ�ʲ���
		
		//��������
		sd.method(new Student2());
	}
}
