/*
	������Ҫ��������֪�塣
	
	this:�ǵ�ǰ��Ķ������á��򵥵ļǣ����ʹ���ǰ��Ķ���
	
		ע�⣺˭��������������÷����ڲ���this�ʹ���˭��
		
	this�ĳ�����
		����ֲ��������س�Ա����
		
	�ĸ���������Ǹ�������this�ʹ����Ǹ�����
*/

package object_O;

//����ѧ����
class Student11{
	//����
	private String name;
	//����
	private int age;
	
	//������ȡֵ
	public String getName(){
		return name;
	}
	//������ֵ
	public void setName(String name) { //name="tian"
		//name=name; //������ʹ�ù��򣺾ͽ�ԭ��
		//����ĵ���ֻ��ͨ��������
		//�������������ڣ���Ӧ�ô������Student11��һ������
		//this ����ǰ��Ķ���
		this.name=name;
	}
	//�����ȡֵ
	public int getAge() {
		return age;
	}
	//���丳ֵ
	public void setAge(int age) {
		this.age=age;
	}
}
class This {
	public static void main(String[] args) {
		//����ѧ������
		Student11 s=new Student11();
		
		//����Ա������ֵ
		s.setName("tian");
		s.setAge(1);
		//��ȡ����
		System.out.println(s.getName()+"---"+s.getAge());
		
		//�����ڶ�������
		Student11 s1=new Student11();
		
		s1.setName("tianna");
		s1.setAge(11);
		
		System.out.println(s1.getName()+"---"+s1.getAge());
		
	}
}
