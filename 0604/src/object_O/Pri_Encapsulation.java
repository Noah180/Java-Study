/*
	封装和private的应用：
		A:把成员变量用private修饰
		B:提高对应的getXxx（）和setXxx（）方法
*/

package object_O;

//定义学生类
class Student4{
	//姓名
	private String name;
	//年龄
	private int age;
	
	//姓名获取值
	public String getName(){
		return name;
	}
	//姓名赋值
	public void setName(String n) {
		name=n;
	}
	//年龄获取值
	public int getAge() {
		return age;
	}
	//年龄赋值
	public void setAge(int a) {
		age=a;
	}
}
class Pri_Encapsulation {
	public static void main(String[] args) {
		//创建学生对象
		Student4 s=new Student4();
		
		//使用成员变量
		System.out.println(s.getName()+"-----"+s.getAge());
		
		//给成员变量赋值
		//通过方法赋值
		s.setName("tian");
		s.setAge(1);
		System.out.println(s.getName()+"-----"+s.getAge());
	}
}
