package Date0814;

import java.text.NumberFormat;
import java.time.LocalDateTime;

public class Test4 {
//�Y�ȹB�q��
	//�C��u�@���i�W�L11HR,���8
	//�W�L11HR,�C�p�ɥ[�~200
	//�q���q2020/7/1��2020/7/31�@�r�p266�p��
	//�Y���~�|�U�A�Эp��q���~��
	//�|�U��d��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daywork_uplimit=11;
		int month_workoff=8;
		int basic_salary=40000;
		int month_work = 31-month_workoff;
		System.out.println("�W�Z�ѼơG"+month_work);
		int work_hour = 266;
		int pluswork_hour = work_hour-month_work*11;
		System.out.println("�[�Z�ɼơG"+pluswork_hour);
		int pluswork_hoursalary=200;
		int plushoursalary= pluswork_hour * pluswork_hoursalary;
		System.out.println("�[�Z�O�G"+plushoursalary);
		System.out.println("�q���~���G"+(basic_salary+plushoursalary));
	}

}
