package Com.Ecommerce.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestNg {
	static ExtentReports extent;
	public static ExtentReports getReportobject() {
	
	String Timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	String Name="ExtentReport-"+Timestamp;
	String Path=System.getProperty("user.dir")+"/Reports/"+Name+" "+".html";
	ExtentHtmlReporter reporter=new ExtentHtmlReporter(Path);
	reporter.config().setReportName("Maven_automation_ExtentReport");
	reporter.config().setDocumentTitle("Maven automation Execution Result");
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("QA Automation Engineer","Pradnya Rikame");
	extent.setSystemInfo("Suite name","Regression");
	
	return extent;
	}

}
