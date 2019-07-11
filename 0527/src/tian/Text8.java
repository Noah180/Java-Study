/*
	数组获取最值
	
	分析：
		1.定义一个数组，并对数组的元素进行静态初始化。
		2.从数组中找一个元素作为参照物（一般第一个），默认为最大值
		3.然后遍历其他的元素值，一次和参照物比较，大就留下，小就离开
		4.最后参照物里面保存的就是最大值
	
*/


package tian;

public class Text8 {
	public static void main(String[] args) {
		int[] arr= {12,22,45,23,2};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
