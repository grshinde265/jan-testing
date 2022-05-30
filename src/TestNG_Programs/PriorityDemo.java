package TestNG_Programs;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityDemo {
  @Test(groups = {"demo1"})
  public void a() {
	  System.out.println("FIRST");
  }
  @Test(priority = 0, groups = {"demo2"})
  public void c() {
	  System.out.println("SECOND");
  }
  @Test(priority = 2,groups = {"demo3"})
  public void b() {
	  System.out.println("THIRD");
  }
  @Test(priority = 3,groups = {"demo4"})
  public void e() {
	  System.out.println("FOURTH");
  }
  @Test(priority = -1, groups = {"demo5"})
  public void d() {
	  System.out.println("FIFTH");
  }
  @Test(enabled = false)
  public void f()
  {
	  int a = 10;
	  int b = 20;
	  int c = 20;
	  int d= a+b;
	  Assert.assertEquals(c, d);
	   }
}
