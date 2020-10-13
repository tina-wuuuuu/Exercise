package Date0805_2;

public class Test4 {
//九九乘法表
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//右邊i*j(1~9)
		for (int j = 1; j < 10; j++) {
			//左邊i*j(2~9)
			for (int i = 2; i < 10; i++) {
				//i先跑完才換j，內圈跑完才換外圈
				System.out.printf("%d*%d=%2d ", i, j, i * j);
			}
			System.out.println();
		}
	}

}
