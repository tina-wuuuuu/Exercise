package Date0805_2;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 迴圈的"第一個初始變數陳述句(i=0)"只會執行一次，
		//之後每次重新進行迴圈時，都會根據"判斷式(i<10)"來判斷是否執行下一個迴圈，
		//而每次執行完迴圈之後，都會執行"遞增式(i++)"一次。 
		for (int i = 0; i < 10; i++)
			System.out.print(" " + i);
	}

}
