package Extent_reprt;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Generate_Report implements ITestListener{

	public ExtentSparkReporter rp; //(document name,report name,theme)
	public ExtentReports er; //(username,hostname,Os,browser,environment)
	public ExtentTest et; //(Pass,fail,shpped)
	
	//per-defined methods(onStart,onTestSuccess,onTestFailure,onTestSkipped,onFinish)
	
	public void onStart(ITestContext tr) {
		
		rp = new ExtentSparkReporter("C:\\Users\\USER\\eclipse-workspace\\Cyclos\\Cyclose_rpt\\Cyclos.html");
		
		rp.config().setDocumentTitle("Adactin-Report");
		rp.config().setReportName("Login-searchhotel test");
		rp.config().setTheme(Theme.STANDARD);
		
		
		er = new ExtentReports();
		er.attachReporter(rp);
		
		er.setSystemInfo("username", "anwesh");
		er.setSystemInfo("Hostname", "LocalHost");
		er.setSystemInfo("OS", "Window10");
		er.setSystemInfo("Browser", "chrome,Edge,Firefox");
		er.setSystemInfo("Environment", "QA");
		
	}	
		
	public void onTestSuccess(ITestResult tr) {
		et = er.createTest(tr.getName());
		et.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		
	}
	
	public void onTestFailure(ITestResult tr) {
		et = er.createTest(tr.getName());
		et.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
	}
	
	public void onTestSkipped(ITestResult tr) {
		et = er.createTest(tr.getName());
		et.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREY));
		
	}
	
	public void onFinish(ITestContext context) {
		er.flush();
	}
}

