package Date0814;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test5 {
//某人2020/4/1 08:00開始上班17:00下班
	// 至2020/7/29 13:00離職
	// 每小時工資250
	// 未做滿90天，薪資打8折
	// 中午休息1小時，工資不計
	// 請計算某人薪水
	// 二十萬兩千
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime start1 = LocalDateTime.of(2020, 4, 1, 8, 0);
		LocalDateTime end1 = LocalDateTime.of(2020, 4, 1, 17, 0);
		Period period = Period.between(LocalDate.of(2020, 4, 1), LocalDate.of(2020, 7, 28));
		int workday = period.getMonths() * 30 + period.getDays();
		LocalDateTime start2 = LocalDateTime.of(2020, 7, 29, 8, 0);
		LocalDateTime end2 = LocalDateTime.of(2020, 7, 29, 13, 0);
		int hour_salary = 250;
		Duration dura1 = Duration.between(start1, end1);
		int daywork_hour = (int) dura1.toHours() - 1;
		System.out.println("正常一天工作時數：" + daywork_hour);
		Duration dura2 = Duration.between(start2, end2);
		int finallywork_hour = (int) dura2.toHours();
		System.out.println("最後一天工作時數：" + finallywork_hour);
		int totalwork_hour = workday * daywork_hour + finallywork_hour;
		System.out.println("總工作時數：" + totalwork_hour);
		int totalwork_day = workday + 1;
		System.out.println("總工作天數：" + totalwork_day);
		int totalsalary = totalwork_hour * hour_salary;
		if (totalwork_day < 90) {
			totalsalary = (int)((int)totalsalary * 0.8);
		}
		System.out.println("某人的薪水：" + totalsalary);

	}

}
