/*
	��װ��private��Ӧ�ã�
		A:�ѳ�Ա������private����
		B:��߶�Ӧ��getXxx������setXxx��������
*/

package object_O;

//����ѧ����
class Student4{
	//����
	private String name;
	//����
	private int age;
	
	//������ȡֵ
	public String getName(){
		return name;
	}
	//������ֵ
	public void setName(String n) {
		name=n;
	}
	//�����ȡֵ
	public int getAge() {
		return age;
	}
	//���丳ֵ
	public void setAge(int a) {
		age=a;
	}
}
class Pri_Encapsulation {
	public static void main(String[] args) {
		//����ѧ������
		Student4 s=new Student4();
		
		//ʹ�ó�Ա����
		System.out.println(s.getName()+"-----"+s.getAge());
		
		//����Ա������ֵ
		//ͨ��������ֵ
		s.setName("tian");
		s.setAge(1);
		System.out.println(s.getName()+"-----"+s.getAge());
	}
}
