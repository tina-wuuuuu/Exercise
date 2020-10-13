package Date0723;

public class Ex1 {
	//設計計算矩形的面積、周長、對角線之方法。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = area(2.0, 5.0);
		System.out.println("Area=" + x);
		double l = lenth(2.0, 5.0);
		System.out.println("Lenth=" + l);
		double y = area(6.0, 5.0);
		System.out.println("Area=" + y);
	}

	public static double area(double a, double b) {
		return a * b;
	}

	public static double lenth(double a, double b) {
		double l = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return l;
	//對角線長度
	}

	public static double perimeter(double a, double b) {
		return a * 2 + b * 2;
	}
}
