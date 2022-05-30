package TestNG_Programs;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dpdemo {
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3 , 5}, {5, 7, 9}, {5, 12, 17}, {15, 20, 36}, {10, 20, 30}};
	}
	
      @Test (dataProvider = "data-provider")
      public void myTest (int a, int b, int result) {
	     int sum = a + b;
	     Assert.assertEquals(result, sum);
      }
}
