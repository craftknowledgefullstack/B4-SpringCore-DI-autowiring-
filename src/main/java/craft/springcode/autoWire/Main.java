package craft.springcode.autoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(iocConfig.class);
		
		Salary salary= (Salary) applicationContext.getBean( Salary.class);
		
		salary.printStaus();
		
		
		
	}

}
