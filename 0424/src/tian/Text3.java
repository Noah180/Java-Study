//�����
// /��ʾ����ֻҪ����,5/3=1
// %��ʾȡ����,5%3=2
//���ʽ���ɱ������������������ɵ�ʽ�ӡ�int sum=a+b

//��ϵ�������boolean����

//�߼������
// &&  ����,��·��
//���ʽ1&&���ʽ2
//������ʽ1��ֵΪ�棬���ұ��ʽ2��ֵΪ�棬�������ʽ��ֵΪ��
//������ʽ1��ֵΪ�٣����ұ��ʽ2��ֵΪ�٣��������ʽ��ֵΪ��
// || ���ߣ���·��

//λ���� &��|
//&����ͬΪ1����ͬΪ0�� |����һ��1����1


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
