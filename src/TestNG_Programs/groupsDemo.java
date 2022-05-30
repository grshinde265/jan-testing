package TestNG_Programs;

import org.testng.annotations.Test;

public class groupsDemo {

	@Test(groups = {"Two Wheeler"})
	public void Jupiter() {
		System.out.println("Jupiter belongs to Two Wheeler category");
	}
	@Test(groups = {"Two Wheeler"})
	public void Activa() {
		System.out.println("Activa belongs to Two Wheeler category");
	}
	@Test(groups = {"Two Wheeler"})
	public void Splender() {
		System.out.println("Splender belongs to Two Wheeler category");
	}
	@Test(groups = {"Four Wheeler"})
	public void Swift() {
		System.out.println("Swift belongs to Four Wheeler category");
	}
	@Test(groups = {"Four Wheeler"})
	public void Tiago() {
		System.out.println("Tiago belongs to Four Wheeler category");
	}
	@Test(groups = {"Four Wheeler"})
	public void Baleno() {
		System.out.println("Baleno belongs to Four Wheeler category");
	}
	@Test(groups = {"Three Wheeler"})
	public void BajajAuto() {
		System.out.println("BajajAuto belongs to Three Wheeler category");
	}
}
