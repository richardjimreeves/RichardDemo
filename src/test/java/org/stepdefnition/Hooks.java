package org.stepdefnition;

import java.io.IOException;

import org.Utility.UtilityClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class Hooks extends UtilityClass {

	@Before
	public void beforeScenario() throws IOException {
		launchBrowser(getPropertyValue("browsername"));
		implicitWait(20);

	}

	@After
	public void afterScenario(Scenario sc) throws IOException {
		takesScreenShot(sc.getName());
		quit();
		
		
	}
}
