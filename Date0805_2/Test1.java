package Date0805_2;

import java.util.Scanner;

public class Test1 {
//耞厩ネだ计蝶单
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("块だ计");

		int score = scanner.nextInt();
		//狦だ计单90眔Aぃ才铬else if
		if (score >= 90)
			System.out.println("眔A");
		//狦だ计单80眔Bぃ才铬else if
		else if (score >= 80 && score < 90)
			System.out.println("眔B");
		else if (score >= 70 && score < 80)
			System.out.println("眔C");
		else if (score >= 60 && score < 70)
			System.out.println("眔D");
		//if else if禲Ч常ぃ才程禲else眔E
		else
			System.out.println("眔E(ぃの)");
		scanner.close();
	}

}
