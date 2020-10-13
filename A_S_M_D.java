package Date0729;

import java.util.Scanner;

public class Test2 {
//設計一個calculator類別，內含以下四個方法
	/*
	 * plus(加) substract(減) 均傳遞兩個引數，並避免有負值出現 devide(乘) multiply(除)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入數字");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		if (num1 < 0 || num2 < 0) {
			System.out.println("輸入錯誤，數值必須為正值");
		}
		calculator cal = new calculator();
		cal.plus(num1, num2);
		cal.substract(num1, num2);
		cal.devide(num1, num2);
		cal.multiply(num1, num2);
		scn.close();
	}
}

class calculator {
	void plus(int plus1, int plus2) {
		if (plus1 > 0 && plus2 > 0) {
			int sum = plus1 + plus2;
			System.out.println("兩數總和=" + sum);
		}
	}

	void substract(int sub1, int sub2) {
		if (sub1 > 0 && sub2 > 0) {
			if (sub1 > sub2) {
				int substract = sub1 - sub2;
			} else {
				int substract = sub2 - sub1;
				System.out.println("兩數相減=" + substract);
			}
		}

	}

	void devide(int dev1, int dev2) {
		if (dev1 > 0 && dev2 > 0) {
			int devide = dev1 * dev2;
			System.out.println("兩數相乘=" + devide);
		}
	}

	void multiply(int mul1, int mul2) {
		if (mul1 > 0 && mul2 > 0) {
			if(mul1 > mul2) {
			int multiply = mul1 / mul2;}
			else { int multiply = mul2/mul1;
			System.out.println("兩數相除=" + multiply);
			}
			}
	}
}