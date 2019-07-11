/*
	起名字要做到见名知义。
	
	this:是当前类的对象引用。简单的记，它就代表当前类的对象。
	
		注意：谁调用这个方法，该方法内部的this就代表谁。
		
	this的场景：
		解决局部变量隐藏成员变量
		
	哪个对象调用那个方法，this就代表那个对象
*/

package object_O;

//定义学生类
class Student11{
	//姓名
	private String name;
	//年龄
	private int age;
	
	//姓名获取值
	public String getName(){
		return name;
	}
	//姓名赋值
	public void setName(String name) { //name="tian"
		//name=name; //变量的使用规则：就近原则
		//这里的调用只能通过对象名
		//这个对象如果存在，它应该代表的是Student11的一个对象
		//this 代表当前类的对象
		this.name=name;
	}
	//年龄获取值
	public int getAge() {
		return age;
	}
	//年龄赋值
	public void setAge(int age) {
		this.age=age;
	}
}
class This {
	public static void main(String[] args) {
		//创建学生对象
		Student11 s=new Student11();
		
		//给成员变量赋值
		s.setName("tian");
		s.setAge(1);
		//获取数据
		System.out.println(s.getName()+"---"+s.getAge());
		
		//创建第二个对象
		Student11 s1=new Student11();
		
		s1.setName("tianna");
		s1.setAge(11);
		
		System.out.println(s1.getName()+"---"+s1.getAge());
		
	}
}
