/*
	ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ���ڴ���������Ҫ���ܣ����ܹ������£�
		���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
		��󽫵�һλ�����һλ���ֽ�������ע�����һ��С��8λ������
		Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ����
		
		1.����С��8λ������
		2.��������ʽ���
		2.����������
		3.ÿλ���ּ�5������10ȡ����������
		4.��һλ�����һλ����
		5.��ӡ
*/


package practice;
import java.util.Scanner;

public class Pra4 {
public static void main(String[] args) {
	//1.����С��8λ������
	System.out.println("������һ��С��8λ��������");
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	//2.��������ʽ���
	
	
	//����getNum����
	String result=getNum(num);
	System.out.println("���ܺ������Ϊ��"+result);
}
public static String getNum(int num) {
	
	int[] a=new int[8];
	int index=0;
	while(num>0) {
		a[index]=num%10;
		index++;
		num/=10;
	}
	//2.����������
	/*for(int i=0;i<(arr.length/2);i++) {
		int temp;
		temp=arr[i];
		arr[i]=arr[arr.length-1-i];
		arr[arr.length-1-i]=temp;
	}*/
	
	//3.ÿλ���ּ�5������10ȡ����������
	for(int j=0;j<index;j++) {
		a[j]=(a[j]+5)%10;
	}
	
	//4.��һλ�����һλ����
	int temp1;
	temp1=a[0];
	a[0]=a[index-1];
	a[index-1]=temp1;
	
	//5.�������Ԫ��ƴ�ӳ�һ���ַ�������
	String s="";
	for(int x=0;x<index;x++) {
		s+=a[x];
	}
	
	return s;
}
}
