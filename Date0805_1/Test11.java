package Date0805_1;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		i = i + 1;
		System.out.println(i);
		i = i - 1;
		System.out.println(i+"\n");
		//上下兩式相等，下面可以縮短程式
		System.out.println(++i);//i=i+1
		System.out.println(--i+"\n");//i=i-1
		
		int number = 0;
		number = ++i; // 相當於i = i + 1; number = i;
		System.out.println(number);
		number = --i; // 相當於i = i - 1; number = i;
		System.out.println(number+"\n");
		//上下兩式不同，
		number = i++; // 相當於number = i; i = i + 1;
		System.out.println(number);
		number = i--; // 相當於 number = i; i = i - 1;
		System.out.println(number+"\n"); 
		
		//i = 5;
		//arr[--i %= 10] = 10;
		//i=i-1，i=4，4%=10=4，arr[4]=10
		
		
		
	}

}
