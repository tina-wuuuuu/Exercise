package Date0723;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�Y�n�D1+2+3+...+1000���M�Хλ��j�覡�B��
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
