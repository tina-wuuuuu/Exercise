package Date0806_1;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		int[] tmp = arr1;
		//���i�H��==�Ӥ����Ӱ}�C�������ȬO�_�۵��A
		//==�ϥΩ󪫥���ɡA�O�ΨӤ���Ӫ���W�٬O�_�ѦҦܦP�@�Ӫ���
		System.out.println(arr1 == tmp);
		System.out.println(arr2 == tmp);
	}

}
