/*
	����һ��ѧ���ࣺ
		��Ա������name��age
		��Ա������show()����
		
	������ʹ����������Ĺ����У�������һ�����⣺
		ͨ������ȥ����Ա������ֵ�����Ը�ֵһЩ�Ƿ������ݡ�
		���ǲ�����ġ�
		Ӧ���ǣ��ڸ�ֵ֮ǰ���ȶ����ݽ����жϡ�
		�жϵ������������ȽϺ��ʣ�
			������һ��ֻ�������󣬵��÷�����
			���ԣ��ж�Ӧ����Student���С�
		�ڳ�Ա������λ�ÿɲ����Խ��������жϣ�
			�����ԣ���Ϊ������У�飬����Ҫ����һЩ�߼���䡣
			�߼����ʱӦ�ö����ڷ����еģ����ԣ��������վ�����Student�����ṩһ������У�顣
			
	private:˽�еġ�
		�������γ�Ա�����ͳ�Ա������
		
		ע�⣺��private���εĳ�Աֻ���ڱ����з��ʡ�
		
	��װ����ָ���ض�������Ժ�ʵ��ϸ�ڣ��������ṩ�������ʷ�ʽ��
*/

package object_O;

class Student3 {
	//����
	String name;
	private int age;
	
	//дһ�����������ݽ���У��
	/*
		����ֵ���ͣ�void
		�����б�int a
	*/
	
	public void setAge(int a) {
		if(a<=0||a>120) {
			System.out.println("�������");
		}else {
			age=a;
		}
	}
	
	//show()��������ʾ���г�Ա����ֵ
	public void show() {
		System.out.println("����:"+name);
		System.out.println("���䣺"+age);
	}
}
class Encapsulation {
	public static void main(String[] args) {
		//����ѧ������
		Student3 s=new Student3();
		s.show();
		System.out.println("------------------");
		
		//����Ա������ֵ
		s.name="tian";
		//s.age=12;
		s.show();
		
		System.out.println("---------------");
		//s.age=-2; //���ݲ�����
		s.setAge(-2);
		s.show();
	}

}
