/*
	类的组成：
		成员变量
		构造方法
		成员方法
			根据返回值：
				void类型
				非void类型
			根据形式参数：
				空参方法
				非空参方法
				
			
*/

package testConstructor;

class Student33 {
	public String getString() {
		return "hello";
	}
	
	public void show() {
		System.out.println("show");
	}
	
	public void method(String name) {
		System.out.println(name);
	}
	
	public String function(String s1,String s2) {
		return s1+s2;
	}
}

public class Text {
	public static void main(String[] args) {
		Student33 s=new Student33();
		
		//调用无参无返回值方法
		s.show();
		
		System.out.println("-----------------");
		
		//调用无参有返回值方法
		String result=s.getString();
		System.out.println(result);
		
		System.out.println("-------------------");
		
		//调用带参无返回值的方法
		s.method("tian");
		
		System.out.println("-------------------");
		
		//调用带参带返回值的方法
		String result2=s.function("hello", "world");
		System.out.println(result2);
	}
}
