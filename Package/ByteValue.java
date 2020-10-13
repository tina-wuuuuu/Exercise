package Package;

public class ByteValue {
	//獲得Byte型態的值
	//byte byteValue();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer bytes = new Integer("125");
		int str = bytes.byteValue();
		System.out.println(str);
		Integer bytes1 = new Integer("125");
		int str2 = bytes.compareTo(bytes1);
		System.out.println(str2);
	}

}
