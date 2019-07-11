/*
	定义一个员工类，自己分析出几个员工，然后给出成员变量，构造方法，getXxx()/setXxx()方法，以及一个显示所有成员信息的方法。
	并测试
*/

package practice;

import java.util.Scanner;

class Staff {
	//成员变量
	private String name;
	private int age;
	private String sex;
	
	//构造方法
	public Staff() {
		
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
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex=sex;
	}
	
	public void show(String name,String sex,int age) {
		System.out.println(name+"--"+sex+"--"+age);
	}
}

class Pri3 {
	public static void main(String[] args) {
		System.out.println("共有4名员工：");
		
		Staff s1=new Staff();
		s1.setName("田娜");
		s1.setSex("女");
		s1.setAge(1);
		System.out.println(s1.getName()+"--"+s1.getSex()+"--"+s1.getAge());
		
		Staff s2=new Staff();
		s2.setName("李华威");
		s2.setSex("男");
		s2.setAge(2);
		System.out.println(s2.getName()+"--"+s2.getSex()+"--"+s2.getAge());
		
		Staff s3=new Staff();
		s3.setName("王夫森");
		s3.setSex("男");
		s3.setAge(3);
		System.out.println(s3.getName()+"--"+s3.getSex()+"--"+s3.getAge());
		
		Staff s4=new Staff();
		s4.setName("小花");
		s4.setSex("女");
		s4.setAge(4);
		System.out.println(s4.getName()+"--"+s4.getSex()+"--"+s4.getAge());
		
		System.out.println("--------------------------");
		s1.show("wang","女",11);
		s2.show("li", "男", 22);
		s3.show("tian","女", 10);
		s4.show("yu", "女", 12);
		}
}


