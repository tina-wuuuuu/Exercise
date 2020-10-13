package Date0806_1;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		int[] tmp = arr1;
		//不可以用==來比較兩個陣列的元素值是否相等，
		//==使用於物件比對時，是用來比對兩個物件名稱是否參考至同一個物件
		System.out.println(arr1 == tmp);
		System.out.println(arr2 == tmp);
	}

}
