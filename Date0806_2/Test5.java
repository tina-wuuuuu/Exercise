package Date0806_2;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 原來的字串物件若沒有其它名稱來參考它，
		// 就會在適當的時機被Java的「垃圾回收」（Garbage collection）機制回收
		String str = "just";
		// 它們兩個是不同的字串物件，
		// 並不是在 "just"字串後加上"in"字串，
		// 而是讓str名稱參考至新的字串物件
		str = "justin";
		// ----
		String str11 = "flyweight";
		String str22 = "flyweight";
		// 實際上是指向同一個字串物件
		System.out.println(str11 == str22);
		// ----
		System.out.println();
		// ----
		String str1 = "fly";
		String str2 = "weight";
		String str3 = "flyweight";
		String str4;
		str4 = str1 + str2;
		// 比較str3與str4物件是否為同一物件時，結果會是false
		System.out.println(str3 == str4);
		// intern()方法會先檢查 String Pool中是否存在字元部份相同的字串物件，
		// 如果有的話就傳回，由於程式中之前已經有"flyweight"字串物件，
		// intern()在String Pool中發現了它，所以直接傳回
		str4 = (str1 + str2).intern();
		System.out.println(str3 == str4);
		// ----
		System.out.println();
		// ----
		String str111 = new String("caterpillar");
		String str222 = new String("caterpillar");
		//== 運算在Java中被用來比較兩個名稱是否參考至同一物件
		//結果會是false
		System.out.println(str111 == str222);
		//如果要比較兩個（字串）物件是否相同，要使用equals()方法
		String str1111 = new String("caterpillar");
		String str2222 = new String("caterpillar");
		System.out.println(str1111.equals(str2222));
	}

}
