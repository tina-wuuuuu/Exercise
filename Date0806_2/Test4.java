package Date0806_2;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] filenames = { "caterpillar.jpg", "cater.gif", "bush.jpg", "wuwu.jpg", "clockman.gif" };
		System.out.print("過濾出jpg檔案: ");
		for (int i = 0; i < filenames.length; i++)
			//可以使用endsWith()方法來過濾檔案名稱
			if (filenames[i].endsWith("jpg"))
				System.out.print(filenames[i] + " ");
		System.out.println("");
	}

}
