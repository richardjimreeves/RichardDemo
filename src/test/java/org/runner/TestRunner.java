package org.runner;

import org.Utility.JVMReport;
import org.apache.commons.lang.math.JVMRandom;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", dryRun = false, glue = "org.stepdefnition", 
                 monochrome = true, tags = {"@gmail or @ebay" }, 
                 plugin = { "pretty","html:target", "json:target/report.json" })

public class TestRunner {
	@AfterClass
	public static void report() {
		 JVMReport.generateJVMReport("target//report.json");

	}
}