package Date0805_2;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 90, 85, 55, 94, 77 };
		// �Q��for�j��C�L�}�C��
		for (int i = 0; i < score.length; i++)
			System.out.print(score[i] + " ");
		System.out.println();
		System.out.println();
		// ��arr�t�m10�Ӿ�ƪ��}�C�����A���ެ�0��9�A��l�ȹw�]��0
		int arr[] = new int[10];
		System.out.print("Array��: ");
		// �C�L�}�C
		for (int i = 0; i < arr.length; i++) {
			// ��ܬҬ�0
			System.out.print(arr[i] + " ");
			// arr[10]=0~9�}�C
			arr[i] = i;
		}
		System.out.print("\n\nArray��: ");
		// �C�L�}�C
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
