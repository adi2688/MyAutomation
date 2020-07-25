package stepDefination;

import io.cucumber.java.Before;

public class Hooks {
	@Before()
	public void behooks() {
		System.out.println("before hook");
	}

}
