package String;

public class CodePointAt {
	//��o���ަr�����{���I(�Ǧ^���w�Ȩó]�wint)
	//�Ǧ^���w���޳B���r��(Unicode�{���I)�A���ްѦ�char��(Unicode�{���椸)�A��d��0��
	//�ϥ�codePointAt��k��o�r��str���ެ�8���r���A�ñN���G�ȳ]�w��int�ܼ�i_str
	//int codePointAt(int index);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		int str = strCom.codePointAt(8);
		System.out.println(str);
		
	}
	

}
