package craft.springcode.Main;

import org.springframework.stereotype.Component;

@Component
public class Employee  implements Hr{

	private int empid;
	private String empName;
	
	
	
	
	public int getEmpid() {
		return empid;
	}




	public void setEmpid(int empid) {
		this.empid = empid;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public void hire() {
		
		System.out.println("employee is hire");
		
	}




	public Employee(int empid, String empName) {
		
		System.out.println("object is created");
		this.empid = empid;
		this.empName = empName;
	}




	public Employee() {
		super();
		//TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}
	
	
}
