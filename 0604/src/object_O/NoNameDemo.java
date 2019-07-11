/*
	匿名对象：就是没有名字的对象
		
	匿名对象的应用场景：
		A:调用方法，仅仅只调用一次的时候。
			调用多次的时候不适合。
			那么，这种匿名调用有什么好处吗？
				匿名对象调用完毕就是垃圾，可以被垃圾回收器回收。
		B:匿名对象可以作为实际参数传递。
*/

package object_O;

class Student2 {
	public void show() {
		System.out.println("我不爱学习");
	}
}

class StudentDemo1 {
	public void method(Student2 s) {
		s.show();
	}
}

class NoNameDemo {
	public static void main(String[] args) {
		//带名字的调用
		Student2 s=new Student2();
		s.show();
		System.out.println("------------------");
		
		//匿名对象
		new Student2().show();
		
		//匿名对象作为实际参数传递
		StudentDemo1 sd=new StudentDemo1();
		Student2 s1=new Student2();
		sd.method(s1); //这里的s1是一个实际参数
		
		//匿名对象
		sd.method(new Student2());
	}
}
