package Date0805_1;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		i = i + 1;
		System.out.println(i);
		i = i - 1;
		System.out.println(i+"\n");
		//�W�U�⦡�۵��A�U���i�H�Y�u�{��
		System.out.println(++i);//i=i+1
		System.out.println(--i+"\n");//i=i-1
		
		int number = 0;
		number = ++i; // �۷��i = i + 1; number = i;
		System.out.println(number);
		number = --i; // �۷��i = i - 1; number = i;
		System.out.println(number+"\n");
		//�W�U�⦡���P�A
		number = i++; // �۷��number = i; i = i + 1;
		System.out.println(number);
		number = i--; // �۷�� number = i; i = i - 1;
		System.out.println(number+"\n"); 
		
		//i = 5;
		//arr[--i %= 10] = 10;
		//i=i-1�Ai=4�A4%=10=4�Aarr[4]=10
		
		
		
	}

}
