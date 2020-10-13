package Date0812;

import java.util.Scanner;

public class BankException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner scn = new Scanner(System.in);
			int saving = 5000;
			System.out.println("��s�ڪ��B�G"+saving);
			System.out.println("�п�J���ڪ��B�G");
			int cashout = scn.nextInt();
			scn.close();
			Bank bk = new Bank(cashout, saving);
			bk.NotEnough();
			bk.show();
		} catch (BankException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.showMessage();

		}

	}

	private static class BankException extends Exception {
		public String toString() {
			return "�o��BankException�ҥ~";
		}

		public String getMessage() {
			return "�s�ڤ��i�H���t��";
		}

		public void showMessage() {
			System.out.println("�o�ͷ���F�I");
		}
	}

	private static class Bank {
		int saving;
		int cashout;

		Bank(int cashout, int saving) {
			this.cashout = cashout;
			this.saving = saving;
		}

		void NotEnough() throws BankException {
			if (saving < cashout ) {
				throw new BankException();
			}
		}

		void show() {
			System.out.println("�b���s�ڡG" + saving);
			System.out.println("���ڪ��B�G" + cashout);
			System.out.println("�l�B�G" + (saving - cashout));
		}
	}
}
