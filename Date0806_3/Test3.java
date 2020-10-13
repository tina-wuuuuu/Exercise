package Date0806_3;

public class Test3 {
//獲得索引偏移後指定程式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball2 b2 = new Ball2();
		b2.setName("redball");
		b2.setRadius(2.0);
		System.out.println("圓半徑="+b2.getRadius());
		System.out.println("名稱="+b2.getName());
		System.out.println("圓面積="+b2.getVolumn());
	}

}

class Ball2 {

	private  double radius; // 半徑
	private  String name; // 名稱

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRadius() {
		return radius;
	}

	public String getName() {
		return name;
	}

	public double getVolumn() {
		return 4 / 3 * Math.PI * radius * radius * radius;

	}
}
