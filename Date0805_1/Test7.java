package Date0805_1;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 在宣告變數之後，直接呼叫變數名稱來取得其所儲存的值
		int ageForStudent = 5;
		double scoreForStudent = 80.0;
		char levelForStudent = 'B';
		System.out.println("年級\t 得分\t 等級");
		System.out.printf("%4d\t %4.1f\t %4c", ageForStudent, scoreForStudent, levelForStudent);
		
		//這一段程式碼中的maxNum變數使用final來限定，所以它在指定為10之後，
		//就不可以再指定值給它，所以第二次指定會被編譯器指出錯誤
		//final int maxNum = 10;
		//maxNum = 20; //錯誤

	}

}
