/*
	��ϰ������ֻ�д��һ����׼�࣬Ȼ�󴴽�������Թ��ܡ�
	
	�ֻ��ࣺ
		��Ա������
			Ʒ�ƣ�String brand��
			�۸�int price��
			��ɫ��String color��
		��Ա������
			���ÿһ����Ա����������Ӧ��getXxx()/setXxx()������
		�������ԣ�
			����һ��������ͨ��getXxx()���������Ա������ֵ����һ�εĽ���ǣ�null---0---null
			Ȼ��ͨ��setXxx()��������Ա������ֵ���ٴ�����������һ�εĽ���ǣ�����---2999---������
*/

package practice;

class Phone {
	private String brand;
	private int price;
	private String color;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
}

class PhoneText {
	public static void main(String[] args) {
		Phone p=new Phone();
		System.out.println(p.getBrand()+"---"+p.getPrice()+"---"+p.getColor());
		System.out.println("------------------------------");
		p.setBrand("����");
		p.setPrice(2999);
		p.setColor("������");
		System.out.println(p.getBrand()+"---"+p.getPrice()+"---"+p.getColor());
	}
}
