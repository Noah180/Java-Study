/*
	ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ���ڴ���������Ҫ���ܣ����ܹ������£�
		���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
		��󽫵�һλ�����һλ���ֽ�������ע�����һ��С��8λ������
		Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ����
		
		1.����С��8λ������
		2.����������
		3.ÿλ���ּ�5������10ȡ����������
		4.��һλ�����һλ����
		5.��ӡ
*/


package practice;
import java.util.Scanner;
public class Pra3 {
	public static void main(String[] args) {
		//1.����С��8λ������
		Scanner input=new Scanner(System.in);
		System.out.println("���������ݵ�λ����");
		int n=input.nextInt();
		System.out.println("���������"+n+"λ����");
		int[] arr1=new int[n];
		for(int i=0;i<arr1.length;i++) {
			int m=input.nextInt();
			arr1[i]=m;
		}
		getNum(arr1);
		getJiami(arr1);
	}
	public static void getNum(int[] arr) {
		System.out.println("�����������Ϊ��");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
					
		}
		System.out.println();
	}
	//2.����������
	//3.ÿλ���ּ�5������10ȡ����������
	//4.��һλ�����һλ����
	public static void getJiami(int[] arr) {
		//����
		for(int i=0;i<(arr.length/2);i++) {
			int temp;
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];	
			arr[arr.length-1-i]=temp;
		}
		for(int r=0;r<arr.length;r++) {
			//System.out.print(arr[r]);
		}
		
		//System.out.println();
		//ÿλ���ּ�5������10ȡ����������
		for(int j=0;j<arr.length;j++) {
			
			arr[j]=(arr[j]+5)%10;
			//System.out.print(arr[j]);
		}
		//System.out.println();
		//��һλ�����һλ����
		int tmp;
		tmp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=tmp;
		System.out.println("���ܺ�Ľ��Ϊ��");
		for(int p=0;p<arr.length;p++) {
			System.out.print(arr[p]);
		}
	}
}
