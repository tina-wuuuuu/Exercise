package Date0805_2;

public class Test5 {
//九九乘法表，用一個for迴圈跑完
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i=2j=1，初始變數陳述句
		//i先跑跑完(2~9)才換下一個j(1>2>3>...>9)
		for (int i = 2, j = 1;
				//j<10右邊，從1跑到10，判斷式如果j=10就停止迴圈
				j < 10; 
				//如果遇到i=9左邊，j就=j+1遞增進位，如果i不等於9則i繼續遞增
				i = (i == 9) ?((++j / j) + 1) : (i + 1)) {
				//列印出i*j，遇到i=9換行
			System.out.printf("%d*%d=%2d%c", i, j, i * j, (i == 9 ? '\n' : ' '));
		}
	}

}
