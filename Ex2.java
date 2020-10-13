package Date0702;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int BMI; double height; double weight;
		Scanner scn;
		try {
			scn = new Scanner(System.in);
			System.out.println("請輸入身高(cm):");
			height = scn.nextDouble()/100;
			System.out.println("請輸入體重(kg)");
			weight = scn.nextDouble();
			BMI = (int) (weight/ Math.pow(height, 2));
			System.out.println("BMI= "+BMI);
			scn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("格式錯誤");
		}
	}

}
