package String;

public class Compare_to {
	//�����Ӧr��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		String strCom2 = "I LIKE PHP";
		int str = strCom.compareTo(strCom2);
		System.out.println(str);
		//�ѩ�str1.str2�q�Ĥ��Ӧr���}�l���P�A�r��P�ƧǦbJ����(-6)�A�ҥH�r��Ǧ^��-6
		String strCom3 = "I LIKE JAVA";
		String strCom4 = "I LIKE php";
		int str2 = strCom3.compareTo(strCom4);
		System.out.println(str2);
		//�j�p�g�t-32�b�[�A�r��p�ƧǦbj���᪺-6=-38
	}

}
