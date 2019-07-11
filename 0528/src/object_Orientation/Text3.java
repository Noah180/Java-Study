/*
	如何使用？
	在一个java文件中写两个类：一个基本类，一个测试类
	注意：文件名称和测试类名称一致。
	如何使用？
		创建对象使用
		
	如何创建对象：
		格式： 类名 对象名=new 类名（）；
		
	如何使用成员变量？
		对象名.变量名
	如何使用成员方法？
		对象名.方法名
*/


package object_Orientation;

//学生类
class Student1 {
	//定义变量
	
	//姓名
	String name;
	//年
	int age;
	//地址
	String address;
	
	//定义方法
	//学习的方法
	public void study() {
		System.out.println("学生爱学习");
	}
	
	//吃饭的方法
	public void eat() {
		System.out.println("学习饿了，要吃饭");
	}
	
	//睡觉
	public void sleep() {
		System.out.println("学习累了，要睡觉");
	}
	
}
//学生测试类
class Text3{
	public static void main(String[] args) {
		//类名 对象名=new 类名（）；
		Student1 s=new Student1();
		s.name="tian";
		s.age=1;
		s.address="beijing";
		//输出成员变量值
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);
		
		//调用方法
		s.study();
		s.eat();
		s.sleep();
		
		
	}
}
