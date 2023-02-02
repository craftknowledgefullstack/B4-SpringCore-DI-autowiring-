package craft.springcode.autoWire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "manager")

public class Manager implements Hr {

	public void hire() {
		// TODO Auto-generated method stub
		
		System.out.println("Manager is hired");
	}

	
	
}
