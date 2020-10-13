package Date0708;

import java.util.Scanner;

public class Ex3 {
//判斷成績及不及格
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score;
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入成績值");
		score=scn.nextDouble();
		if(score<0 || score >100) {
			System.out.println("資料錯誤");	
		}
		else if (score>=60) {
			System.out.println("及格");
			}
		else if(score<60 ) {
			System.out.println("不及格");
		}
		scn.close();
		
	}

}
