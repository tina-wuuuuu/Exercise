package Date0723;

public class Ex5 {
	// 第7習題:設計兩個方法的類別，將上傳的整數陣列由大到小傳回，另一個方法將其由小到大。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 5,2,3,21,17,1 };
		int B[];
		int C[];
		System.out.print("A陣列由大排到小=");
		B = max(A);
		for (int x:B)
			System.out.print("\t" + x);
		System.out.println();
		System.out.print("A陣列由小排到大=");
		C = min(A);
		for (int y:C)
		System.out.print("\t"+y);
	}

	public static int[] max(int A[]) {
		int tmp;
		for (int i =(A.length-1); i >=0 ;i++) {
			for (int j = 0; j < (A.length-1); j++) {
				if (A[j] < A[j + 1]) {
					tmp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = tmp;
				}
			}
		}
		return A;
	}
	public static int[] min(int A[]) {
		int tmp;
		for (int i = 0; i < (A.length-1); i++) {
			for (int j = 0; j < (A.length - 1); j++) {
				if (A[j] > A[j+1]) {
					tmp = A[j];
					A[j] = A[i];
					A[i] = tmp;
				}
			}
		}
		return A;
	}
}
