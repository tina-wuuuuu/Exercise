package Date0708;

import java.util.Scanner;

public class Ex3 {
//�P�_���Z�Τ��ή�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score;
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���Z��");
		score=scn.nextDouble();
		if(score<0 || score >100) {
			System.out.println("��ƿ��~");	
		}
		else if (score>=60) {
			System.out.println("�ή�");
			}
		else if(score<60 ) {
			System.out.println("���ή�");
		}
		scn.close();
		
	}

}
