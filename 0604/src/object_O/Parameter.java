/*
	��ʽ���������⣺
		�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
		�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
*/

package object_O;

//��ʽ�����ǻ�������
class Demo{
	public int sum(int a,int b) {
		return a+b;
	}
}

//��ʽ��������������
class Student{
	public void show() {
		System.out.println("�Ұ�ѧϰ");
	}
}

class StudentDemo{
	//���һ����������ʽ������һ�������ͣ��������ͣ���������ʵ��Ҫ���Ǹ���Ķ���
	
	public void method(Student s){  //���õ�ʱ�򣬰�main�����е�s�ĵ�ַ���ݵ������Student s=new Student();
		s.show();
	}
}

class Parameter {
	public static void main(String[] args) {
		//��ʽ�����ǻ������͵ĵ���
		Demo d=new Demo();
		int result=d.sum(20, 10);
		System.out.println(result);
		
		//��ʽ�������������͵ĵ���
		//������Ҫ����StudentDemo���е�method��������
		StudentDemo sd=new StudentDemo();
		//����ѧ������
		Student s=new Student();
		sd.method(s); //��s�ĵ�ַ����������
		
		
	}

}
