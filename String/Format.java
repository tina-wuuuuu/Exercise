package String;

import java.util.Date;
import java.util.Locale;

public class Format {
	// �榡�Ʀr��
	// ��k�ŧi String format(String format,Object...args);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = String.format("%d", 400 / 2);
		String str2 = String.format("%b", 3 > 5);
		System.out.println("�榡�Ƭ��Q�i����"+str1);
		System.out.println("�榡�Ƭ����L�ȫ��A"+str2);
		String str3 = String.format("%e", 15.000);
		String str4 = String.format("%x", 15);
		System.out.println("�榡�Ƭ��q����ǰO���ƪk��ܪ��Q�i��Ʀr"+str3);
		System.out.println("�榡�Ƭ��Q���i����"+str4);
		String str5 = String.format("%h", 15);
		System.out.println("�榡�Ƭ�����X"+str5);
		String str6 = String.format("%s", "abc");
		String str7 = String.format("%c", 'c');
		String str8 = String.format("%o", 20);
		System.out.println("�榡�Ƭ��r�ꫬ�A"+str6);
		System.out.println("�榡�Ƭ��r�����A"+str7);
		System.out.println("�榡�Ƭ��K�i����"+str8);
		String str9 = String.format("%a", 10.98);
		String str10 = String.format("%n",str7);
		String str11 = String.format("%%", 10);
		System.out.println("�榡�Ƭ��a���Ĭ��ƩM���ƪ��Q���i��B�I��"+str9);
		System.out.println("�榡�Ƭ��S�w���x������j�Ÿ�"+str10);
		System.out.println("�榡�Ƭ��r����%"+str11);
		//�z�L���w���S���ഫ�Ÿ��@���ѼơA�ӹ�{�����M�ɶ��r�ꪺ�榡��
		//��k�ŧi String format(Locale 1,String format,Object...args);
		//�N�ثe����H4��~���B������١B������Φ���X�C
		Date date = new Date();
		Locale form = Locale.TAIWAN;
		String year = String.format(form, "%tY", date);
		String month = String.format(form, "%tB", date);
		String day = String.format(form, "%td", date);
		//�j�p�g���
		String Day = String.format(form, "%tD", date);
		System.out.println("���~�O�G"+year);
		System.out.println("�{�b�O�G"+month);
		System.out.println("���ѬO:"+day);
		//�B�~���
		System.out.println(Day);
		//�N�ثe����H2��~���B���²�١B��������Φ���X
		String year_ex2 = String.format("%ty", date);//2��~��
		String month_ex2 = String.format("%tm", date);//���²��
		String day_ex2 = String.format("%tc", date);//��������M�ɶ��榡
		System.out.println("���~�O�G"+year_ex2+"�~");
		System.out.println("�{�b�O�G"+month_ex2);
		System.out.println("���ѬO:"+day_ex2);
	}

}
