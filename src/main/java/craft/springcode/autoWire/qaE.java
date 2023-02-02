package craft.springcode.autoWire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "qa")

public class qaE implements Hr {

	public void hire() {
		// TODO Auto-generated method stub
		
		System.out.println("QAe IS hired");
	}

}
