package Package;

public class LowestOneBit {
	//獲得整數二進位最低位元1的索引
	// int lowestOneBit();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			int j = Integer.lowestOneBit(i);
			System.out.println(j);
		}
	}

}
