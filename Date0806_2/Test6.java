package Date0806_2;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOfReaded1 = "cater 64/5/26 0939002302 5433343";
		// split()�̱z�ҳ]�w�����j�]�w�A�N�r������ƭӤl�r��åHString�}�C�Ǧ^
		String[] tokens = strOfReaded1.split("\t");
		for (String token : tokens) {
			System.out.print(token + "\t");
		}
		System.out.println();
		// ----
		String strOfReaded2 = "cater,64/5/26,0939002302,5433343";
		//���]�z����r�ɮפ��e�C����ƬO�H','���j
		tokens = strOfReaded2.split(",");
		for (String token : tokens) {
			System.out.print(token + "\t");
		}
		System.out.println();
	}

}
