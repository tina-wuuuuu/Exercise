package Date0814;

import java.text.NumberFormat;
import java.time.LocalDateTime;

public class Test4 {
//某客運司機
	//每日工作不可超過11HR,月休8
	//超過11HR,每小時加薪200
	//司機從2020/7/1至2020/7/31共駕駛266小時
	//若底薪四萬，請計算司機薪水
	//四萬兩千六
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daywork_uplimit=11;
		int month_workoff=8;
		int basic_salary=40000;
		int month_work = 31-month_workoff;
		System.out.println("上班天數："+month_work);
		int work_hour = 266;
		int pluswork_hour = work_hour-month_work*11;
		System.out.println("加班時數："+pluswork_hour);
		int pluswork_hoursalary=200;
		int plushoursalary= pluswork_hour * pluswork_hoursalary;
		System.out.println("加班費："+plushoursalary);
		System.out.println("司機薪水："+(basic_salary+plushoursalary));
	}

}
