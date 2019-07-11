/*
	定义一个人类
	
	姓名和年龄都是变化的，但是选举的都是中国人，他们的国籍一样。
	一样的国籍，每次创建对象，在堆内存都要开辟这样的空间。有点浪费。
	
	针对多个对象有共同的这样的成员白能量值的时候，java提供了一个关键字来修饰：static
	
	static的特点：(它可以修饰成员变量，还可以修饰成员方法)
		A:随着类的加载而加载
			回想main方法。
		B:优先于对象存在
		C:被类的所有对象共享
			举例：一个班级的学生应该共用同一个班级编号。
			这个特点也在告诉我们什么时候使用静态。
				如果某个成员变量是被所有对象共享的，那么它就应该定义为静态的。
			举例：
				饮水机（用静态修饰）
				水杯（不能用静态修饰）
		D:可以通过类名调用
			其实它本身也可以通过对象名调用。
			推荐使用类名调用
			
			静态修饰的内容一般称为：与类相关的，类成员
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
		System.out.println("姓名："+name+"--"+"年龄："+age+"--"+"国籍："+country);
	}
}

class PersonDemo {
	public static void main(String[] args) {
		//创建对象1
		Person p1=new Person("tian",1,"中国");
		p1.show();
		
		//创建对象1
		Person p2=new Person("na",2);
		p2.show();
		
		//创建对象1
		Person p3=new Person("lala",3);
		p3.show();
		System.out.println("-----------------");
		p3.country="美国";
		p3.show();
		
		p1.show();
		p2.show();
		System.out.println("----------------");
		
		System.out.println(Person.country);
		System.out.println(p1.country);
	}

}
