/*
	标准的手机类练习
	
	手机类：
		成员变量：brand，price，color
		构造方法：无参构造
		成员方法：getXxx()/setXxx()
*/

package practice;

class Phone1 {
	private String brand;
	private int price;
	private String color;
	
	public Phone1() {
	
	}
	
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

public class PhoneTest {
	public static void main(String[] args) {
		Phone1 p=new Phone1();
		p.setBrand("iphone");
		p.setPrice(4999);
		p.setColor("red");
		
		System.out.println(p.getBrand()+"---"+p.getPrice()+"---"+p.getColor());
	}

}
