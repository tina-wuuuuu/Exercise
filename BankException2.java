package Date0812;

import java.util.Scanner;

public class BankException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner scn = new Scanner(System.in);
			int saving = 5000;
			System.out.println("原存款金額："+saving);
			System.out.println("請輸入提款金額：");
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
			return "發生BankException例外";
		}

		public String getMessage() {
			return "存款不可以為負數";
		}

		public void showMessage() {
			System.out.println("發生當機了！");
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
			System.out.println("帳戶原存款：" + saving);
			System.out.println("提款金額：" + cashout);
			System.out.println("餘額：" + (saving - cashout));
		}
	}
}
