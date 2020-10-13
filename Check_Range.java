package Date0812;

import java.util.Scanner;

public class Test3 {
//自行定義一個檢查薪資的例外
	// 若薪資介於25000~50000之間，則顯示姓名及薪資
	// 若不在25000及50000範圍，則自行拋出例外並顯示適當訊息
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{Scanner scn = new Scanner(System.in);
		System.out.println("請輸入姓名");
		String name = scn.next();
		System.out.println("請輸入薪資");
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
		return "發生SalaryException意外";
	}

	public String getMessage() {
		return "薪資異常";
	}

	public void showMessage() {
		System.out.println("發生當機了！");
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
		System.out.println("您輸入的姓名：" + name);
		System.out.println("薪資：" + salary);

	}

}
