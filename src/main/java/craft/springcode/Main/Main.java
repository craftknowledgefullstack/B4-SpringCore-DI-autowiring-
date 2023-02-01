package craft.springcode.Main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  
		
		
//		Employee emp=new Employee();
//		
//		emp.setEmpid(1);
//		emp.setEmpName("robel");
//		
//		
//		System.out.println(emp);
//	
//		Employee emp2= new Employee("sds", 2323);
//		
//		System.out.println(emp2);
		
		// 1.  ApplicationContext
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("springIOC.xml");
		
		Employee employee= (Employee) applicationContext.getBean("emp");
		
		System.out.println(employee);
		
		Employee employee2= (Employee) applicationContext.getBean("emp");
		
		System.out.println(employee);
		
		Employee employee3= (Employee) applicationContext.getBean("emp");
		System.out.println(employee);
	
		Employee employee4= (Employee) applicationContext.getBean("emp");
		System.out.println(employee);
	
		
		// 2. BeanFactory
		
//		BeanFactory beanFactory= new XmlBeanFactory("springIOC.xml");
//	
//		Programmer employee= (Programmer) beanFactory.getBean("emp");
//		employee.hire();
		
		
		
		
		
	}

}
