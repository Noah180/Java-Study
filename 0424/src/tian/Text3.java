//运算符
// /表示除，只要整数,5/3=1
// %表示取余数,5%3=2
//表达式是由变量、常量和运算符组成的式子。int sum=a+b

//关系运算符：boolean类型

//逻辑运算符
// &&  并且,短路与
//表达式1&&表达式2
//如果表达式1的值为真，并且表达式2的值为真，整个表达式的值为真
//如果表达式1的值为假，并且表达式2的值为假，整个表达式的值为假
// || 或者，短路或

//位运算 &、|
//&：相同为1，不同为0； |：有一个1就是1


package tian;

public class Text3 {
	public static void main(String[] args) {
		int x=5,y=3;
		int sum=x+y;
		int sub=x-y;
		int plus=x*y;
		int div=x/y;
		int di2=x%y;
		boolean i=x>y;
		boolean i1=(x>y)&&(x>0);
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(plus);
		System.out.println(div);
		System.out.println(di2);
		System.out.println(i);
		System.out.println(i1);
	}

}
