package Date0806_1;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ϥ� = ���w�ɬO�N������w���}�C�W�٨ӰѦ�
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 5, 6, 7 };
		int[] tmp;
//tmp�i�H�ѦҦ�5�Ӥ������@���}�C�A�]�i�H�ѦҦ�3�Ӥ������@���}�C�C
		tmp = arr1;
		for (int i = 0; i < tmp.length; i++)
			System.out.print(tmp[i] + " ");
		System.out.println();

		tmp = arr2;
		for (int i = 0; i < tmp.length; i++)
			System.out.print(tmp[i] + " ");
		System.out.println();
	}

}
