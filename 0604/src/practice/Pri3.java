/*
	����һ��Ա���࣬�Լ�����������Ա����Ȼ�������Ա���������췽����getXxx()/setXxx()�������Լ�һ����ʾ���г�Ա��Ϣ�ķ�����
	������
*/

package practice;

import java.util.Scanner;

class Staff {
	//��Ա����
	private String name;
	private int age;
	private String sex;
	
	//���췽��
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
		System.out.println("����4��Ա����");
		
		Staff s1=new Staff();
		s1.setName("����");
		s1.setSex("Ů");
		s1.setAge(1);
		System.out.println(s1.getName()+"--"+s1.getSex()+"--"+s1.getAge());
		
		Staff s2=new Staff();
		s2.setName("���");
		s2.setSex("��");
		s2.setAge(2);
		System.out.println(s2.getName()+"--"+s2.getSex()+"--"+s2.getAge());
		
		Staff s3=new Staff();
		s3.setName("����ɭ");
		s3.setSex("��");
		s3.setAge(3);
		System.out.println(s3.getName()+"--"+s3.getSex()+"--"+s3.getAge());
		
		Staff s4=new Staff();
		s4.setName("С��");
		s4.setSex("Ů");
		s4.setAge(4);
		System.out.println(s4.getName()+"--"+s4.getSex()+"--"+s4.getAge());
		
		System.out.println("--------------------------");
		s1.show("wang","Ů",11);
		s2.show("li", "��", 22);
		s3.show("tian","Ů", 10);
		s4.show("yu", "Ů", 12);
		}
}


