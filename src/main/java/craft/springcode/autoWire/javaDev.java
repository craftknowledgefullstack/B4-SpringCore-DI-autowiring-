package craft.springcode.autoWire;

import org.springframework.stereotype.Component;

@Component(value = "javadev")
public class javaDev  implements Hr{

	public void hire() {
		// TODO Auto-generated method stub
	
		System.out.println("Java dev is hired");
	}

	
}
