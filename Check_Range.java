package Date0812;

import java.util.Scanner;

public class Test3 {
//�ۦ�w�q�@���ˬd�~�ꪺ�ҥ~
	// �Y�~�ꤶ��25000~50000�����A�h��ܩm�W���~��
	// �Y���b25000��50000�d��A�h�ۦ�ߥX�ҥ~����ܾA��T��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�m�W");
		String name = scn.next();
		System.out.println("�п�J�~��");
		int salary = scn.nextInt();
		Salary s = new Salary(name , salary);
		s.input();
		s.show();
		
		}
		catch(SalaryException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.showMessage();
		}
		
	}

}

class SalaryException extends Exception {
	public String toString() {
		return "�o��SalaryException�N�~";
	}

	public String getMessage() {
		return "�~�겧�`";
	}

	public void showMessage() {
		System.out.println("�o�ͷ���F�I");
	}
}

class Salary{
	int salary;
	String name;
	Salary(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	void input() throws SalaryException {
		if (salary < 25000 || salary > 50000) {
			throw new SalaryException();
		}

	}

	void show() {
		System.out.println("�z��J���m�W�G" + name);
		System.out.println("�~��G" + salary);

	}

}
