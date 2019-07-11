/*
	定义一个学生类：
		成员变量：name，age
		成员方法：show()方法
		
	我们在使用这个案例的过程中，发现了一个问题：
		通过对象去给成员变量赋值，可以赋值一些非法的数据。
		这是不合理的。
		应该是：在赋值之前，先对数据进行判断。
		判断到底在那里做比较合适？
			测试类一般只创建对象，调用方法。
			所以，判断应该在Student类中。
		在成员变量的位置可不可以进行数据判断？
			不可以，因为做数据校验，必须要依靠一些逻辑语句。
			逻辑语句时应该定义在方法中的，所以，我们最终决定在Student类中提供一个方法校验。
			
	private:私有的。
		可以修饰成员变量和成员方法。
		
		注意：被private修饰的成员只能在本类中访问。
		
	封装：是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。
*/

package object_O;

class Student3 {
	//姓名
	String name;
	private int age;
	
	//写一个方法对数据进行校验
	/*
		返回值类型：void
		参数列表：int a
	*/
	
	public void setAge(int a) {
		if(a<=0||a>120) {
			System.out.println("年龄错误");
		}else {
			age=a;
		}
	}
	
	//show()方法，显示所有成员变量值
	public void show() {
		System.out.println("姓名:"+name);
		System.out.println("年龄："+age);
	}
}
class Encapsulation {
	public static void main(String[] args) {
		//创建学生对象
		Student3 s=new Student3();
		s.show();
		System.out.println("------------------");
		
		//给成员变量赋值
		s.name="tian";
		//s.age=12;
		s.show();
		
		System.out.println("---------------");
		//s.age=-2; //数据不合理
		s.setAge(-2);
		s.show();
	}

}
