package Date0806_1;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ϥ� = ���w�ɬO�N������w���}�C�W�٨ӰѦҡA�Ӥ��O�}�C�ƻs�A
		//�p�G�z�Q�N��Ӱ}�C���Ƚƻs���t�@�Ӱ}�C�Ӧp��@�O�H
		//�z�i�H�ϥΰj��A�N��Ӱ}�C�������Ȩ��X�@�M�A�ë��w���t�@�Ӱ}�C�۹��������ަ�m
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[5];
		//�Narr1���ޭȽƻs��arr2
		for (int i = 0; i < arr1.length; i++)
			arr2[i] = arr1[i];
		//�C�Larr2
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
	}

}
