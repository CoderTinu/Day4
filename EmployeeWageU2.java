package Day4;

public class EmployeeWageU2 {

	public static void main(String[] args) {
		int Full_time=1;
		int Emp_rate_per_hour=20;
		int emp_hr=0;//variable
		int emp_wage=0;//variable
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck==Full_time)
			emp_hr=8;
		else
			emp_hr=0;
		emp_wage = emp_hr * Emp_rate_per_hour;
		System.out.println("Emp wage: "+emp_wage);

	}

}
