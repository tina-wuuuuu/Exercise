package Date0806_2;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "字串的使用";
		System.out.println(text);
		String msg = "哈囉！";
		// 字串的串接在Java中可以直接使用 + 運算子，+ 本來是加法運算子，
		// 而它被重載（Override）為可以直接用於字串的串接
		msg = msg + "Java Programming！";
		System.out.println(msg);
		// -----
		System.out.println();
		// -----
		String text2 = "hello";
		System.out.println("字串內容: " + text2);
		System.out.println("字串長度: " + text2.length());
		System.out.println("等於hello? " + text2.equals("hello"));
		System.out.println("轉為大寫: " + text2.toUpperCase());
		System.out.println("轉為小寫: " + text2.toLowerCase());
		// -----
		System.out.println();
		// -----
		// Byte.parseByte(字串) 將字串剖析為位元
		// Short.parseShort(字串) 將字串剖析為short整數
		// Integer.parseInt(字串) 將字串剖析為integer整數
		// Long.parseLong(字串) 將字串剖析為long整數
		// Float.parseFloat(字串) 將字串剖析為float浮點數
		// Double.parseDouble(字串)將字串剖析為double浮點數
		// char charAt(int index) 傳回指定索引處的字元
		// int indexOf(int ch) 傳回指定字元第一個找到的索引位置
		// int indexOf(String str) 傳回指定字串第一個找到的索引位置
		// int lastIndexOf(int ch) 傳回指定字元最後一個找到的索引位置
		// String substring(int beginIndex) 取出指定索引處至字串尾端的子字串
		// String substring(int beginIndex, intendIndex)取出指定索引範圍子字串
		// char[] toCharArray() 將字串轉換為字元Array
		String text3 = "Your left brain has nothing right.\n" + "Your right brain has nothing left.\n";
		System.out.println("字串內容: ");
		// 列印出字串內容
		for (int i = 0; i < text3.length(); i++)
			System.out.print(text3.charAt(i));
		// 用indexof傳回第一個left的索引值
		System.out.println("\n第一個left: " + text3.indexOf("left"));
		// 用lastIndexof傳回最後一個left的索引值
		System.out.print("最後一個left: " + text3.lastIndexOf("left"));
		// 將字串轉回字元
		char[] charArr = text3.toCharArray();
		System.out.println("\n字元Array內容: ");
		// 列印字元
		for (int i = 0; i < charArr.length; i++)
			System.out.print(charArr[i]);
		// ----
		// 使用字元陣列name，建構出一個內容為"caterpillar"的字串。
		char[] name = { 'c', 'a', 't', 'e', 'r', 'p', 'i', 'l', 'l', 'a', 'r' };
		String str = new String(name);
		System.out.println(str);

	}

}
