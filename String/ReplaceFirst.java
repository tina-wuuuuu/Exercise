package String;

public class ReplaceFirst {
	//������ܪk�����Ĥ@�Ӥ�諸�r��
	//String replaceFirst()String regex,String replacement)
	//regex:�ΨӤ�諸������ܪk
	//replacement:�ΨӴ����Ĥ@�Ӥ�ﶵ���r��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="���Ϯ��]�A���������A���]��";
		str = str.replaceFirst("���", "���c");
		System.out.println(str);
	}

}
