package Date0806_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phones1 = "Justin's phone number: 0939-100391\n" + "momor's phone number: 0939-666888\n";
		//�o�ӵ{���|�M�������X��0939�}�Y�����X�A���]�z�����X�ӷ����u�@�ӡ]�pphones1�Bphones2�^�A
		//�ڭ̥i�H�sĶ�n���h��ܦ��öǦ^�@�� Pattern����A����N�i�H���ШϥΥ�
		Pattern pattern = Pattern.compile(".*0939-\\d{6}");

		Matcher matcher = pattern.matcher(phones1);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

		String phones2 = "caterpillar's phone number: 0952-600391\n" + "bush's phone number: 0939-550391";

		matcher = pattern.matcher(phones2);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
