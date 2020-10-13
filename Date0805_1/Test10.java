package Date0805_1;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 三段程式分別會輸出true、false與true三種狀況。
		int number = 75;
		System.out.println((number > 70 && number < 80));
		System.out.println((number > 80 || number < 75));
		System.out.println(!(number > 80 || number < 75)+"\n");

		// 看「位元運算子」（Bitwise operator），在 數位設計上有AND、OR、NOT、XOR與補數等運算，
		// 在Java中提供這些運算的就是位元運算子，
		// 它們的對應分別是 AND （&）、OR（|）、XOR（^）與補數（~）。
		System.out.println("AND運算：");
		System.out.println("0 AND 0\t\t" + (0 & 0));
		System.out.println("0 AND 1\t\t" + (0 & 1));
		System.out.println("1 AND 0\t\t" + (1 & 0));
		System.out.println("1 AND 1\t\t" + (1 & 1));
		System.out.println("\nOR運算：");
		System.out.println("0 OR 0\t\t" + (0 | 0));
		System.out.println("0 OR 1\t\t" + (0 | 1));
		System.out.println("1 OR 0\t\t" + (1 | 0));
		System.out.println("1 OR 1\t\t" + (1 | 1));
		System.out.println("\nXOR運算：");
		System.out.println("0 XOR 0\t\t" + (0 ^ 0));
		System.out.println("0 XOR 1\t\t" + (0 ^ 1));
		System.out.println("1 XOR 0\t\t" + (1 ^ 0));
		System.out.println("1 XOR 1\t\t" + (1 ^ 1)+"\n");

		// XOR的運算較不常見，這邊舉個簡單的XOR字元加密例子，先看看程式：
		char ch = 'A';
		System.out.println("before encoding：" + ch);
		// 簡單XOR字元加密的動作
		ch = (char) (ch ^ 0x7);
		System.out.println("after encoding：" + ch);
		// 簡單的XOR字元加密，要解密也只要再進行相同的位元反轉就可以了。
		ch = (char) (ch ^ 0x7);
		System.out.println("decoding：" + ch+"\n");

		//在位元運算上，Java還有左移（<<）與右移（>>）兩個運算子，
		//左移運算子會將所有的位元往左移指定的位數，
		//左邊被擠出去的位元會被丟棄，而右邊會補上0；
		
		//右移運算則是相反，會將所有的位元往右移指定的位數，
		//右邊被擠出去的位元會被丟棄，至於左邊位元補0或補1則視最左邊原來的位元而定，
		//如果原來是0就補0，是1就補1，您還可以使用>>>運算子，
		//這個運算子在右移後一行在最左邊補上0。
		number = 1;
		System.out.println("2的0次: " + number);
		number = number << 1;
		System.out.println("2的1次: " + number);
		number = number << 1;
		System.out.println("2的2次: " + number);
		number = number << 1;
		System.out.println("2的3次：" + number);

	}

}
