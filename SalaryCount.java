package Date0814;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test5 {
//�Y�H2020/4/1 08:00�}�l�W�Z17:00�U�Z
	// ��2020/7/29 13:00��¾
	// �C�p�ɤu��250
	// ������90�ѡA�~�ꥴ8��
	// ���ȥ�1�p�ɡA�u�ꤣ�p
	// �Эp��Y�H�~��
	// �G�Q�U��d
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
		System.out.println("���`�@�Ѥu�@�ɼơG" + daywork_hour);
		Duration dura2 = Duration.between(start2, end2);
		int finallywork_hour = (int) dura2.toHours();
		System.out.println("�̫�@�Ѥu�@�ɼơG" + finallywork_hour);
		int totalwork_hour = workday * daywork_hour + finallywork_hour;
		System.out.println("�`�u�@�ɼơG" + totalwork_hour);
		int totalwork_day = workday + 1;
		System.out.println("�`�u�@�ѼơG" + totalwork_day);
		int totalsalary = totalwork_hour * hour_salary;
		if (totalwork_day < 90) {
			totalsalary = (int)((int)totalsalary * 0.8);
		}
		System.out.println("�Y�H���~���G" + totalsalary);

	}

}
