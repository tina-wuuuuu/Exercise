package Date0805_2;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			// ��i=5�ɡA�����j��
			if (i == 5)
				break;
			System.out.print("i = " + i+"\t");
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			//��i=5�A����j����~��(pass5)
			if (i == 5)
				continue;

			System.out.print("i = " + i+"\t");
		}
	}

}
