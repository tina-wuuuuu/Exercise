package Package;

public class BitCount {
	//獲得二進位補數中1的數量
	// int bitCount(int i);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			int count = Integer.bitCount(i);
			System.out.println(count);
		}
	}

}
