package Package;

public class HighestOneBit {
	//獲得整數二進位最高位元1的索引
	//int highestOneBit(int i );
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			int j = Integer.highestOneBit(i);
			System.out.println(j);
		}
	}

}
