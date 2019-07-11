//1.打印如下图形
//*****
//*****
//*****

//2.打印如下图形
//*
//**
//***
//****
//*****

//3.打印九九乘法表

package practice;

public class Pra1 {
	public static void main(String[] args) {
		//1
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		//2
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		//3
		for(int c=1;c<=9;c++) {
			for(int d=1;d<=c;d++) {
				System.out.print(d+"x"+c+"="+d*c+"\t");
			}
			System.out.println();
		}
	}

}
