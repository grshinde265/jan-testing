package TestNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

@Listeners(ListenersTestNg.class)
public class DataProviderDemo {
  @Test(dataProvider = "dp")
  public void f(Integer number, String s) {
	  System.out.println("The Thread ID for "+ number + " Is :  " + Thread.currentThread().getId());
  }

  @DataProvider(parallel = true)
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
      new Object[] { 4, "d" },
      new Object[] { 5, "e" },
      new Object[] { 6, "f" },
    };
  }
}
