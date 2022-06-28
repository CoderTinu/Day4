package Day4;

public class EmployeeWageUC3 {

	public static void main(String[] args) {
		int part_time=1;
		int full_time=2;
		int emp_rate_per_hr=20;
		int emphr=0;
		int empWage=0;
		double empCheck =Math.floor(Math.random() * 10) % 3;
		if (empCheck == part_time)
			emphr=4;
		else if (empCheck == full_time)
			emphr=8;
		else
			emphr=0;
		empWage = emphr * emp_rate_per_hr;
		System.out.println("Emp Wage :" +empWage);

	}

}
