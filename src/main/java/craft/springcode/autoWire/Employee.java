package craft.springcode.autoWire;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Hr {

	private int empId;
	private String empName;
	private String dep;
	private int salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dep=" + dep + ", salary=" + salary + "]";
	}
	public void hire() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee is hired");
	}
	public Employee(int empId, String empName, String dep, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dep = dep;
		this.salary = salary;
	}
	
	
	
}
