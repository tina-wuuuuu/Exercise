package Date0805_2;

public class Test4 {
//�E�E���k��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�k��i*j(1~9)
		for (int j = 1; j < 10; j++) {
			//����i*j(2~9)
			for (int i = 2; i < 10; i++) {
				//i���]���~��j�A����]���~���~��
				System.out.printf("%d*%d=%2d ", i, j, i * j);
			}
			System.out.println();
		}
	}

}
