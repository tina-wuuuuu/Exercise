package Date0723;

public class Ex5 {
	// ��7���D:�]�p��Ӥ�k�����O�A�N�W�Ǫ���ư}�C�Ѥj��p�Ǧ^�A�t�@�Ӥ�k�N��Ѥp��j�C
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 5,2,3,21,17,1 };
		int B[];
		int C[];
		System.out.print("A�}�C�Ѥj�ƨ�p=");
		B = max(A);
		for (int x:B)
			System.out.print("\t" + x);
		System.out.println();
		System.out.print("A�}�C�Ѥp�ƨ�j=");
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
