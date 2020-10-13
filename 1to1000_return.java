package Date0723;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//若要求1+2+3+...+1000的和請用遞迴方式運算
	int n=1000;
	int N=count(n);
		System.out.println("1+2+3+...+1000="+N);
	}
	public static int count(int n) {
		if (n > 0)
			return n + count(n - 1);
		else {
			return 0;
		}
	}
}
