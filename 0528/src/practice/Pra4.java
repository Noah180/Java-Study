/*
	某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，在传过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。请注意给定一个小于8位的整数
		然后，把加密后的结果在控制台打印出来
		
		1.输入小于8位的整数
		2.以数组形式输出
		2.将数据逆序
		3.每位数字加5，除以10取余代替该数字
		4.第一位和最后一位交换
		5.打印
*/


package practice;
import java.util.Scanner;

public class Pra4 {
public static void main(String[] args) {
	//1.输入小于8位的整数
	System.out.println("请输入一个小于8位的整数：");
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	//2.以数组形式输出
	
	
	//调用getNum方法
	String result=getNum(num);
	System.out.println("加密后的数据为："+result);
}
public static String getNum(int num) {
	
	int[] a=new int[8];
	int index=0;
	while(num>0) {
		a[index]=num%10;
		index++;
		num/=10;
	}
	//2.将数据逆序
	/*for(int i=0;i<(arr.length/2);i++) {
		int temp;
		temp=arr[i];
		arr[i]=arr[arr.length-1-i];
		arr[arr.length-1-i]=temp;
	}*/
	
	//3.每位数字加5，除以10取余代替该数字
	for(int j=0;j<index;j++) {
		a[j]=(a[j]+5)%10;
	}
	
	//4.第一位和最后一位交换
	int temp1;
	temp1=a[0];
	a[0]=a[index-1];
	a[index-1]=temp1;
	
	//5.把数组的元素拼接成一个字符串返回
	String s="";
	for(int x=0;x<index;x++) {
		s+=a[x];
	}
	
	return s;
}
}
