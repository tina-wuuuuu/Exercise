package Date0806_1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ŧiarr���G���}�C(��C�T��)
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		// �C�L�}�C
		// �}�C�W�٪����[�Wlength�A�ҫ����O���X�C�]Row�^�A
		// �Өϥί��ޥ[�Wlength�A�����O�ӦC�Ҿ֦��������A�]�N�O��]Column�^�ƥءA
		// arr.length����=2 arr[0] arr[1]
		for (int i = 0; i < arr.length; i++) {
			// arr[0].length����=3 arr[0][0] arr[0][1] arr[0][2]
			for (int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		System.out.println();

		// �ŧiarr1=�T���}�C int [][][]arr1= new int [2][2][3]
		// �T���}�C�O2x2x3�A�Q���⭱2x3�G���}�C���|�b�@�_
		int[][][] arr1 = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 10, 11, 12 } } };
		// arr����=2
		for (int i = 0; i < arr1.length; i++) {
			// arr[0]����=3
			for (int j = 0; j < arr1[0].length; j++) {
				//�T��arr[i][j]����
				for (int k = 0; k < arr1[i][j].length; k++) {
					System.out.print(arr1[i][j][k] + " ");
			}
			System.out.println();
		}
	}
}
}
		
