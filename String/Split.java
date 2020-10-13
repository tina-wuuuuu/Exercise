package String;

public class Split {
	// 字串分割成陣列
	// 方法宣告 String [] split (String regex)
	// regex:指定的字串分割符號
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "公司名稱：明日科技！公司所在地：台北市。公司電話：0222990314";
		String[] info = null;
		info = str.split("！|。");
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
		System.out.println();

		String str2 = "中壢火車站，中原夜市，中壢夜市，好咖";
		String[] info2 = null;
		info2 = str2.split("，");
		for (int i = 0; i < info2.length; i++) {
			System.out.println(info2[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println();

		
		
		// 方法宣告 String [] split(String regex,int limit)
		// limit:控制模式應用的長度
		String[] info3 = null;
		info3 = str2.split("，", 0);
		for (int i = 0; i < info3.length; i++) {
			System.out.println(info3[i]);
		}
		System.out.println();

		String[] info5 = null;
		info5 = str2.split("，", 1);
		for (int i = 0; i < info5.length; i++) {
			System.out.println(info5[i]);
		}
		System.out.println();

		String[] info4 = null;
		info4 = str2.split("，", 2);
		for (int i = 0; i < info4.length; i++) {
			System.out.println(info4[i]);
		}
		System.out.println();

		String[] info6 = null;
		info6 = str2.split("，", 3);
		for (int i = 0; i < info6.length; i++) {
			System.out.println(info6[i]);
		}
		System.out.println();

		String[] info7 = null;
		info7 = str2.split("，", 4);
		for (int i = 0; i < info7.length; i++) {
			System.out.println(info7[i]);
		}
	}

}
