/*
	数组：
		数组是存储同一种数据类型的多个元素的集合，也可以看成是一个容器。
		数组既可以存储基本数据类型，也可以存储引用数据类型。
	
	定义格式：
		格式1：数据类型[] 数组名；
		格式2：数据类型 数组名[];
	举例：
		1：int[] a;定义一个int类型的数组a变量
		2：int a[];定义一个int类型的a数组变量
	
	注意：
		效果可以认为是一样的，都是定义一个int数组，但是念法上有些小区别，推荐使用第一种。
		
	对数组进行初始化：
		初始化：为数组开辟内存空间，并为每个数组赋予值
		方式：
		1：动态初始化
			初始化时只指定数组长度（元素个数），由系统为数组分配初始化值
			格式：
				数据类型[] 数组名=new 数据类型[数组长度]；
				
			用数组名和编号的配合可以获取数组中的指定编号的元素。这个编号的专业叫法：索引,从0开始
			通过数组名访问数据的格式是：数组名[索引];
			
		2：静态初始化
			为每一个数组元素给出初始化值，由系统决定长度
			格式：
				数据类型[] 数组名=new 数据类型[]{元素1，元素2，...}；
			简化格式：
				数据类型[] 数组名={元素1，元素2，...}；
			举例：
				int[] arr=new int[]{1,2,3};
			简化后：
				int[] arr={1,2,3};
				
		注意事项：
			不要同时动态和静态进行
			如下格式：
				int[] arr=new int[3]{1,2,3}; //错误
				
*/


package tian;

public class Text3 {
	public static void main(String[] args) {
		//定义一个数组,输出该数组的名称和数组元素值。
		//给数组元素赋值,再次输出
		int[] arr=new int[3];
		//输出数组名称
		System.out.println(arr);
		//输出数组元素值
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("--------------");
		//给数组元素赋值
		arr[0]=100;
		arr[2]=200;
		//输出数组名称
		System.out.println(arr);
		//输出数组元素值
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("-----------------");
		int[] arr1= {1,2,3};
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("--------------");
	}
}
