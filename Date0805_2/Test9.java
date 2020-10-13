package Date0805_2;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		back: {
			for (int i = 0; i < 10; i++) {
				if (i == 9) {
					// 當i=9，結束back迴圈，所以不會列印到test
					System.out.println("break");
					break back;
				}
			}
			System.out.println("test");
		}
		back1: for (int i = 0; i < 10; i++) {
			back2: for (int j = 0; j < 10; j++) {
				// 當j=9，跳脫back1，不會列印test
				if (j == 9) {
					continue back1;
				}
			}
			System.out.println("test");
		}
		back1: for (int i = 0; i < 10; i++) {
			back2: for (int j = 0; j < 10; j++) {
				// 當j=9，跳脫back2，會列印test*10
				if (j == 9) {
					continue back2;
				}
			}
			System.out.print("test" + "\t");
		}
		System.out.println();
		Integer i = 10;
		System.out.println(i + 10);
		System.out.println(i++);
		System.out.println(i);
	}

}
