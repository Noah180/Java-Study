//�ӿ���̨����ɼ�������ʾ�ȼ�
//90-100����
//70-89����
//60-70������
//0-59��������

package Practice;

import java.util.Scanner;

public class Pra4 {
	public static void main(String[] args) {
		System.out.println("������ɼ���");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if((a<0)||(a>100)) {
			System.out.println("����������������룡");
		}else if((a>=0)&&(a<60)) {
			System.out.println("������");
		}else if((a>=60)&&(a<70)) {
			System.out.println("����");
		}else if((a>=70)&&(a<90)) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
	}

}
