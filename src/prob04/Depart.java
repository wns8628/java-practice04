package prob04;

public class Depart extends Employee {	
	
	private String Department;
	
	public Depart(String name, int salary, String Department ) {
		this.setName(name);
		this.setSalary(salary);
		this.Department = Department;
	}
	
	public void getInformation() {
		System.out.println( "이름: " + this.getName() + 
					        " 연봉: " + this.getSalary() +
					        " 부서: " + this.Department
					);
	}
}
