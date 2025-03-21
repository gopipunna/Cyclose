package Cyclos_Page_ObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Registration {
	
	JavascriptExecutor js;
	public static WebDriver driver; 
	public Registration (WebDriver driver) { 
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement Name;
	
	@FindBy(xpath = "//input[@id='id_2']")
	WebElement Loginame;
	
	@FindBy(xpath = "//input[@id='id_3']")
	WebElement Email;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[2]")
	WebElement gender;
	
	
	//@FindBy(id= "(//div[@class='d-flex label-value-value'])[6]") 
	//WebElement Bussiness;
	
	
	
	@FindBy(xpath = "//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
		WebElement Next;
	
	@FindBy(xpath = "//input[@class='form-control w-100 ng-pristine ng-invalid ng-touched']")
	WebElement Password;
	
	@FindBy(xpath = "(//input[@class='form-control w-100 ng-pristine ng-invalid ng-touched'])[2]")
	WebElement ComPassword;
	
	@FindBy (xpath="custom-control d-flex align-content-center p-0 custom-checkbox")
	WebElement Demo;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement submit;
	
	
	public void Setname() {
		Name.sendKeys("gopi");
	}
	public void SetLogin() {
		Loginame.sendKeys("gopipunna");
	}
	public void SetEmail() {
		Email.sendKeys("gopipunna8@gmail.com");
	}
	public void SetGendre() {
		gender.click();
		//js.executeScript("arguments[0].click();",Gender);
	}
	
	
	
	public void Setnext() {
		Next.click();
		
}
	public void SetPass() {
		//Password.sendKeys("gopi@123$.%");
		/*js.executeScript("arguments[0].scrollIntoView();", Password);
		System.out.println(js.executeScript("return window.pageYOffset;", ""));*/
		
		js.executeScript("arguments[0].setAttribute('value','anwesh26')", Password);
		//js.executeScript("arguments[0]value='gopi@123$.%';",Password);
	}
	public void Setcompass() {
		//ComPassword.sendKeys("gopi@123$.%");
		js.executeScript("arguments[0].setAttribute('value','anwesh26')", ComPassword);
		//js.executeScript("arguments[0]value='gopi@123$.%';",ComPassword);
}
	public void Setdemo() {
		Demo.click();
	
}
	
	public void SetSubmitButton() {
		submit.click();
	
}
}
