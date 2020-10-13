package Date0806_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phones1 = "Justin's phone number: 0939-100391\n" + "momor's phone number: 0939-666888\n";
		//這個程式會尋找手機號碼為0939開頭的號碼，假設您的號碼來源不只一個（如phones1、phones2），
		//我們可以編譯好正則表示式並傳回一個 Pattern物件，之後就可以重覆使用它
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
