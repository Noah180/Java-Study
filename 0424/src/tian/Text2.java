package tian;

import java.util.Scanner;

public class Text2 {
	public static void main(String[] args) {
		System.out.println("'");
		System.out.println("\"");
		//数据类型 变量名字=值
		int a=3,b=5;
		
		//数据类型是int，变量名是x，值是a+b的值
		int x=a+b;
		
		//数据类型是Scanner，变量名是input，值是Scanner(System.in)
		Scanner input=new Scanner(System.in);
		
		//数据类型是String，变量名是str，值是hello
		//String是字符串类型
		//string是引用类型
		//char是单个的字符，String是一串字符
		String str="hello";
		System.out.println(str);
		
		String str1="你好";
		System.out.println(str1);
		//基本的数据类型存储在栈空间，函数执行完毕就释放
		//引用类型使用new分配的堆空间
		//全局数据区通常存放常量，并且值不能被改变
		//
	}

}
