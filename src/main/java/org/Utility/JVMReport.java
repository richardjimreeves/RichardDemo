package org.Utility;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String json) {
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\JVMReports");
		Configuration con = new Configuration(loc, "Facebook");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "100");
		con.addClassifications("OS Name", "Windows 11");
		con.addClassifications("Sprint", "25");
		con.addClassifications("Environment", "QA");

		List<String> jsonFiles = new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r = new ReportBuilder(jsonFiles, con);
		r.generateReports(); 

	}

}
