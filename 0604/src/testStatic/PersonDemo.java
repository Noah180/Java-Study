/*
	����һ������
	
	���������䶼�Ǳ仯�ģ�����ѡ�ٵĶ����й��ˣ����ǵĹ���һ����
	һ���Ĺ�����ÿ�δ��������ڶ��ڴ涼Ҫ���������Ŀռ䡣�е��˷ѡ�
	
	��Զ�������й�ͬ�������ĳ�Ա������ֵ��ʱ��java�ṩ��һ���ؼ��������Σ�static
	
	static���ص㣺(���������γ�Ա���������������γ�Ա����)
		A:������ļ��ض�����
			����main������
		B:�����ڶ������
		C:��������ж�����
			������һ���༶��ѧ��Ӧ�ù���ͬһ���༶��š�
			����ص�Ҳ�ڸ�������ʲôʱ��ʹ�þ�̬��
				���ĳ����Ա�����Ǳ����ж�����ģ���ô����Ӧ�ö���Ϊ��̬�ġ�
			������
				��ˮ�����þ�̬���Σ�
				ˮ���������þ�̬���Σ�
		D:����ͨ����������
			��ʵ������Ҳ����ͨ�����������á�
			�Ƽ�ʹ����������
			
			��̬���ε�����һ���Ϊ��������صģ����Ա
*/

package testStatic;

class Person{
	String name;
	int age;
	//String country;
	static String country;
	
	public Person() {}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public Person(String name,int age,String country) {
		this.name=name;
		this.age=age;
		this.country=country;
	}
	
	public void show() {
		System.out.println("������"+name+"--"+"���䣺"+age+"--"+"������"+country);
	}
}

class PersonDemo {
	public static void main(String[] args) {
		//��������1
		Person p1=new Person("tian",1,"�й�");
		p1.show();
		
		//��������1
		Person p2=new Person("na",2);
		p2.show();
		
		//��������1
		Person p3=new Person("lala",3);
		p3.show();
		System.out.println("-----------------");
		p3.country="����";
		p3.show();
		
		p1.show();
		p2.show();
		System.out.println("----------------");
		
		System.out.println(Person.country);
		System.out.println(p1.country);
	}

}
