package craft.springcode.autoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Salary {

	
	@Autowired
	Employee employee;
	
	
	@Autowired
	@Qualifier(value = "manager")
	Hr hr;
	
	
	
	void printStaus() {
		
		employee.setEmpId(1);
		employee.setEmpName("robel");
		employee.setDep("Java dev");
		employee.setSalary(112);
		System.out.println(employee);
		
		
		hr.hire();
	}
	
	
	
	
	
}
