package Date0805_2;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		back: {
			for (int i = 0; i < 10; i++) {
				if (i == 9) {
					// ��i=9�A����back�j��A�ҥH���|�C�L��test
					System.out.println("break");
					break back;
				}
			}
			System.out.println("test");
		}
		back1: for (int i = 0; i < 10; i++) {
			back2: for (int j = 0; j < 10; j++) {
				// ��j=9�A����back1�A���|�C�Ltest
				if (j == 9) {
					continue back1;
				}
			}
			System.out.println("test");
		}
		back1: for (int i = 0; i < 10; i++) {
			back2: for (int j = 0; j < 10; j++) {
				// ��j=9�A����back2�A�|�C�Ltest*10
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
