package Date0814;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
//輸入日期計算星期幾
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scn = new Scanner(System.in);
		
	
		final Scanner in = new Scanner(System.in);
        final String year = in.next();
        final String month = in.next();
        final String day = in.next();
 
        final LocalDate date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        System.out.println(date.getDayOfWeek().toString());
  
	}

}
