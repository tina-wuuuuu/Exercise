package Date0806_3;

public class Test1 {
//使用"class"關鍵字來書寫類別（規格書），
//使用類別來定義一個物件（object）時，
//考慮物件可能擁有的「屬性」（Property，在Java中則是用Field）與「方法」（Method）。
//屬性是參與物件內部運算的資料成員，而方法則是物件與外界互動的動態操作。 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball b1 = new Ball(18.4, "red ball");
		 System.out.println("名稱: " + b1.getName());
		 System.out.println("半徑: " + b1.getRadius()); 

	}
	//"class"是Java中用來定義類別的關鍵字，Ball是您所取的類別名稱
	public static class Ball {
		//的radius、name成員是運算參與資料（Field）成員
		private double radius; // 半徑
		private String name; // 名稱

		// 無參數建構方法
		public Ball() {
			this(0.0, "no name");
		}
		//在類別中的運算參與資料（Field）及互動方法（Method），
		//我們統稱其為 類別成員（Class member）。
		//-----
		//類別名稱同名的方法稱之為 建構方法 Cconstructor），也有人稱之為「建構子」，
		//它沒有傳回值。顧名思義，
		//建構元的作用是讓您建構物件可以設定一些必要的建構資訊，
		//它可以被重載（Overload），以滿足物件生成時不同的設定條件。
		public Ball(double radius, String name) {
			this.radius = radius;
			this.name = name;
		}
		//getRadius()與getName()是互動方法（Method）成員
		//public公開成員 private私有成員
		public double getRadius() {
			return radius;
		}
		//getRadius()與getName()是互動方法（Method）成員
		public String getName() {
			return name;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
