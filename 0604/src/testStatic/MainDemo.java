/*
	main方法的格式讲解：
		public static void main(String[] args){...}
		
		public:公共的，访问权限是最大的。由于main方法是被jvm调用，所以权限要够大。
		static:静态的，不需要创建对象。通过类名就可以。方便jvm的调用。
		void:因为我们曾经说过，方法的返回值是返回给调用者，而main方法是被jvm调用。返回内容给jvm没有意义。
		main:是一个常见的入口。几乎所有语言都是以main作为入口。
		String[] args:字符串数组。
			这个东西早期是为了接收键盘录入的数据的。
			格式是：
				java MainDemo hello worid java
*/

package testStatic;



class MainDemo {
	public static void main(String[] args) {
		
		//System.out.println(args); //@1c2c22f3
		//System.out.println(args.length); //0
		//System.out.println(args[0]); //ArrayIndexOutOfBoundsException
		
		//接收数据后
		System.out.println(args); 
		System.out.println(args.length); 
		//System.out.println(args[0]); 
	}
}
