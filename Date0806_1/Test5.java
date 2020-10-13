package Date0806_1;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		//arr2空間5
		int[] arr2 = new int[5];
		//System.arraycopy(來源, 起始索引, 目的, 起始索引, 複製長度);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		//列印arr2
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
	}

}
