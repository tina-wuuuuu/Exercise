package Date0806_2;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOfReaded1 = "cater 64/5/26 0939002302 5433343";
		// split()依您所設定的分隔設定，將字串分為數個子字串並以String陣列傳回
		String[] tokens = strOfReaded1.split("\t");
		for (String token : tokens) {
			System.out.print(token + "\t");
		}
		System.out.println();
		// ----
		String strOfReaded2 = "cater,64/5/26,0939002302,5433343";
		//假設您的文字檔案內容每筆資料是以','分隔
		tokens = strOfReaded2.split(",");
		for (String token : tokens) {
			System.out.print(token + "\t");
		}
		System.out.println();
	}

}
