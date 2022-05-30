package TestNG_Programs;

import org.testng.annotations.DataProvider;

public class DP {
	@DataProvider(name="KiteTestData")
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "XA0634", "12345678765" },
	      new Object[] { "XA0635", "234567654" },
	      new Object[] { "XA0636", "12345678765" },
	      
	    };
	  }
}
