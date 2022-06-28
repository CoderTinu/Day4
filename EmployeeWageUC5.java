package Day4;

public class EmployeeWageUC5 {
	public static final int part_time =1;
	public static final int full_time =2;
	public static final int emp_rate_per_hr =20;
	public static final int working_days=2;

	public static void main(String[] args) {
		int emphrs=0,empWage=0,totalEmpWage=0;
		for(int day=0;day<working_days;day++) {
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch(empCheck) {
			case part_time:
				emphrs=4;
				break;
			case full_time:
				emphrs=8;
				break;
			default:
				emphrs=0;
			}
			empWage=emphrs*emp_rate_per_hr;
			totalEmpWage += empWage;
			System.out.println("Emp Wage:" +empWage);
		}
		System.out.println("Total Emp Wage:" +totalEmpWage);

	}

}
