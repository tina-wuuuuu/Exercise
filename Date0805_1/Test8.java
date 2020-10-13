package Date0805_1;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//先乘除後加減 答案=7
		System.out.println(1 + 2 * 3);
		//先(int)3/4=0 1+2+0 答案=3
		System.out.println(1+2+3 / 4);
		//(int)6/4 答案=1
		System.out.println((1+2+3) / 4);
		//(double) 6/3 答案=1.5
		System.out.println((double)(1+2+3) / 4+"\n");
		//(int) 10/3 答案=3
		int testNumber = 10;
		System.out.println(testNumber / 3); 
		//如果運算式中有一個浮點數，則程式就會先轉換使用浮點數來運算
		System.out.println(testNumber / 3.0);
		//「限定型態轉換」，使用double告訴程式先將testNumber的值轉換為double，
		//然後再進行除法運算，所以結果會是正確的3.3333
		System.out.println((double) testNumber / 3+"\n");
		
		//testInteger不能等於testDouble
		//將精確度大的指定給精確度小的變數時，由於在精確度上會有遺失的現象，
		//編譯器會認定這是一個錯誤
		//int testInteger = 0;
		//double testDouble = 3.14;
		//testInteger = testDouble;
		//System.out.println(testInteger); 
		//如果您確定這是您要的結果，您必須明確加上轉換的限定字：testInteger = (int) testDouble;
		
		int count=0;
		//%運算子是餘除運算子，它計算除法後的餘數，一個使用的例子是數字循環，
		//假設有一個立方體要進行360度旋轉，每次在角度上加1，
		//而360度後必須復歸為0，然後重新計數，這時您可以這麼撰寫： 
		count = (count + 1) % 360;
		
		
	}

}
