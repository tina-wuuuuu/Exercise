package Date0806_1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] tmp1;
		int[] tmp2;
		//�ϥ� = ���w�ɬO�N������w���}�C�W�٨ӰѦ�
		tmp1 = arr1;
		tmp2 = arr1;
		//�C�L�Xtmp1
		for (int i = 0; i < tmp1.length; i++)
			System.out.print(tmp1[i] + " ");
		System.out.println();
		//�C�L�Xtmp2
		for (int i = 0; i < tmp2.length; i++)
			System.out.print(tmp2[i] + " ");
		System.out.println();
		//�Ntmp1[2]����3����9
		tmp1[2] = 9;
		for (int i = 0; i < tmp1.length; i++)
			System.out.print(tmp1[i] + " ");
		System.out.println();
		//���T�ӰѦҦW�ٰѦҦܦP�@�Ӱ}�C����A�]�N�Oarr1�Btmp1�Ptmp2�A
		//�ҥH�z���Ӥ]���D�Aarr1����2���Ȧb�{�������ҰѦҨ쪺�Ȥ]���ܤF�C 
		for (int i = 0; i < tmp2.length; i++)
			System.out.print(tmp2[i] + " ");
		System.out.println();
	}

}
