package String;

public class Replace {
	// �����r���ǦC
	// ��k�ŧiString replace(char oldChar,char newChar)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "���Ϯ��]";
		System.out.println("��r��=" + str);
		str = str.replace("���", "���c");
		System.out.println("������r��=" + str);
		System.out.println();
		//��k�ŧiString replace(CharSequence target,CharSequence replacement)
		String str2="nnn";
		str2 = str2.replace("nn", "m");
		System.out.println(str2);
	}

}
