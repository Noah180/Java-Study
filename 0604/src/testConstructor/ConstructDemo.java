/*
	构造方法：
		给对象的数据进行初始化
		
	格式：
		A:方法名与类名相同
		B:没有返回值类型，连void都没有
		C:没有具体的返回值
		
	构造方法的注意事项：
		A:如果我们没有给出构造方法，系统将自动提供一个无参构造方法
		B:如果给出了构造方法，系统将不再提供默认的无参构造方法
			注意：这个时候，如果还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法
		
	给成员变量赋值有两种方式：
		A:setXxx();
		B:构造方法
*/

package testConstructor;

class Student22 {
	private String name; //null
	private int age; //0
	public Student22() {
		System.out.println("这是构造方法");
	}
	
	//构造方法的重载格式
	public Student22(String name) {
		System.out.println("这是一个带String类型的构造方法");
		this.name=name;
	}
	
	public Student22(int age) {
		System.out.println("这是一个带int类型的构造方法");
		this.age=age;
	}
	
	public Student22(String name,int age) {
		System.out.println("这是一个带多个参数的构造方法");
		this.name=name;
		this.age=age;
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
}

class ConstructDemo {
	public static void main(String[] args) {
		//创建对象
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
