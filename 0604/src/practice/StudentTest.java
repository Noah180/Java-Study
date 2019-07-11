/*
	标准代码
	
	学生类：
		成员变量：
			name，age
		构造方法：
			无参，带两个参数
		成员方法：
			getXxx()/setXxx()
			show():输出该类的所有成员变量值
			
	给成员变量赋值：
		A:setXxx()方法
		B:构造方法
	
	输出成员变量值的方式：
		A:通过getXxx()分别获取然后拼接
		B:通过调用show()方法搞定
*/

package practice;

class Student44 {
	private String name;
	private int age;
	
	public Student44() {
		System.out.println("这是一个无参构造方法");
	}
	
	public Student44(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("这是一个两参构造方法");
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
