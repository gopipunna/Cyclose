package Test_Cases;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import Cyclos_Page_ObjectModel.Registration;

public class TestCase_1 extends Base_Class{
	//JavascriptExecutor js;
	Registration Rt;
	@Test
	public void RegistratonTesting() throws InterruptedException, IOException {
	Rt= new Registration(driver);
	Rt.Setname();
	Rt.SetLogin();
	Rt.SetEmail();
	Rt.SetGendre();
	//Rt.Setrestarent();
	
	Rt.Setnext();
	//js.executeScript("window.scrollBy(0,500);","");
	//System.out.println(js.executeScript("return window.pageYOffset;"));
	
	
	Rt.SetPass();
	Rt.Setcompass();
	Rt.Setdemo();
	Thread.sleep(1000);
	Rt.SetSubmitButton();
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File target=new File("C:\\Users\\USER\\eclipse-workspace\\Cyclos\\ScreenShots\\cyclos.png");
	FileUtils.copyFile(src, target);
	
	

}
}