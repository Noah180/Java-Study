//�ӿ���̨������ݡ��·ݣ���ӡ���·ݵ�����

package Practice;

import java.util.Scanner;

public class Pra5 {
	public static void main(String[] args) {
//		1.�ӿ���̨�������
		System.out.println("��������ݣ�");
		Scanner input=new Scanner(System.in);
		int Y=input.nextInt();
		if((Y<1000)||(Y>9999)) {
			System.out.println("�������");
			System.exit(0);
		}
//		2.�ӿ���̨�����·�
		System.out.println("�������·ݣ�");
		int M=input.nextInt();
		if((M<1)||(M>12)) {
			System.out.println("�������");
			System.exit(0);
		}
		
//		3.��switch�жϣ�����Ƕ��·ݣ���Ҫ�ȼ��������Ƿ�Ϊ����
		switch(M) {
		//case����������ͬ��case���Ժϲ�
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("�������31�졣");
			break;
		case 2:
			boolean ret=((Y%4==0)&&(Y%100!=0))||(Y%400==0);
			if(ret) {
				System.out.println("�������29�졣");
			}else {
				System.out.println("�������28�졣");
			}
			break;			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("�������30�졣");
			break;
			//default����ʡ��
		/*default:
			System.out.println("�������");
			System.exit(0);
			break;*/
		}
	}

}
