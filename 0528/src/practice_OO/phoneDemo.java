/*
	手机类的测试
*/

package practice_OO;

class Phone{
	//定义变量
	String color;
	String brand;
	int price;
	
	//定义方法
	public static void call() {
		System.out.println("手机可以打电话");
	}
	
	public static void play() {
		System.out.println("手机可以打游戏");
	}
	
	public static void watch() {
		System.out.println("手机可以看电影");
	}
}

public class phoneDemo {
	public static void main(String[] args) {
		//定义一个新类
		Phone p=new Phone();
		System.out.println(p.color);
		System.out.println(p.color);
		System.out.println(p.price);
		p.color="red";
		p.brand="iPhone 8";
		p.price=1000;
		System.out.println(p.color);
		System.out.println(p.color);
		System.out.println(p.price);
		
		//调用方法
		p.call();
		p.play();
		p.watch();
	}
	
	

}
