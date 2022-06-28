package Day4;

public class EmployeeWageUC6 {

	
		public static final int part_time =1;
		public static final int full_time =2;
		public static final int emp_rate_per_hr =20;
		public static final int working_days=2;
		public static final int max_hr_in_month=10;
		
		public static void main(String[] args) {
			int emphrs=0,totalEmp_hr=0,totalWorking_Days=0;
			while(totalEmp_hr<=max_hr_in_month && totalWorking_Days < working_days) {
				totalWorking_Days++;
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
				totalEmp_hr += emphrs;
				System.out.println("Days:" + working_days + "working hours:" +emphrs);
			}
			int totalEmployeeWage = totalEmp_hr * emp_rate_per_hr;
			System.out.println("Total Emp Wage:" +totalEmployeeWage);

		}

	}


