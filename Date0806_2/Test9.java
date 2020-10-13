package Date0806_2;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuilder類別，使用這個類別所產生的物件預設會有16個字元的長度，您也可以自行指定初始長度，
		//如果附加至物件的字元超出可容納的長度，則StringBuilder物件會自動增加長度。
		StringBuilder strBuilder = new StringBuilder("Knowledge is power!");
		System.out.println("內容: " + strBuilder);
		//length()可傳回目前物件中的字元長度，
		System.out.println("長度: " + strBuilder.length());
		//capacity()可傳回該物件目前可容納的字元容量
		System.out.println("容量: " + strBuilder.capacity());
	}

}
