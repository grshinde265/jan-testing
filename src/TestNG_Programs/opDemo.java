package TestNG_Programs;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class opDemo {
	 @Test
	    @Parameters ("message")
	    public void OP( @Optional("Optional Parameter Selected") String message) {
	        System.out.println(message);
	    }
}
