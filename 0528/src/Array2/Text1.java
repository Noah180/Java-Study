/*
	��ά���飺����Ԫ��Ϊһά��������顣
	
	��ʽ1��
		��������[][] ������=new ��������[m][n];
		
		m����ʾ�����ά�����ж��ٸ�һά����
		n����ʾÿһ��һά�����Ԫ���ж��ٸ�
		
	��ʽ2��
		��������[][] ������=new ��������[m][];
		
		m:��ʾ�����ά�����ж��ٸ�һά���顣
		����û�и��������Զ�̬�ĸ����仯������
		
	��ʽ3��
		��������[][] ������=new ��������[][]{{Ԫ��...},{Ԫ��...}..{Ԫ��...}};
		�򻯸�ʽ��
			��������[][] ������={{Ԫ��...},{Ԫ��...}..{Ԫ��...}};
		
	ע�⣺
		1.���¸�ʽҲ���Ա�ʾ��ά����
			�������� ������[][]=new ��������[m][n];
			��������[] ������[]=new��������[m][n];
		2.ע�����涨�������
			int x��y;
			int[] x,y[];
			
*/

package Array2;

public class Text1 {
	public static void main(String[] args) {
		//��ʽ1
		int[][] arr=new int[3][2];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println("-------------------");
		//��ʽ2
		int[][] arr2=new int[3][];
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		arr2[0]=new int[3];
		arr2[1]=new int[2];
		arr2[2]=new int[1];
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println(arr2[0][0]);
		System.out.println(arr2[0][1]);
		System.out.println(arr2[0][2]);
		System.out.println("-------------------");
		//��ʽ3
		int[][] arr3= {{1,1,2},{2,3,4},{1}};
		System.out.println(arr3);
		System.out.println(arr3[0][0]);
		System.out.println(arr3[1][1]);
		System.out.println(arr3[0][2]);
	}
}
