package Cyclos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	//Select sc;
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
	
	@FindBy(xpath = "(//input[@name='gender'])[2]")
	WebElement Gender;  
	
	@FindBy (xpath="business_type_restaurants")
	WebElement buciness;
	//@FindBy(id= "(//div[@id='dropdown-menu-business_type'])[1]")
	//WebElement Bussiness;
	
	@FindBy(xpath = "//input[@id='id_4']")
	WebElement Mobile_no;

	@FindBy(xpath = "//input[@id='id_5']")
	WebElement landline_no;

	@FindBy(xpath = "//input[@id='id_6']")
	WebElement Address;
	
	@FindBy(xpath = "//input[@id='addressLine1']")
	WebElement Addressline;
	
	@FindBy(xpath = "//input[@id='zip']")
	WebElement zipcode;
	
	//@FindBy(xpath = "")
	//WebElement ;
	
	
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
		//Gender.click();
		js.executeScript("arguments[0].click();",Gender);
	}
	public void SetBussiness() {
		buciness.click();
	}
	/*List<WebElement> ele=driver.findElements(By.xpath("(//div[@id='dropdown-menu-business_type'])[1]"));
	
		int size=ele.size();
		System.out.println(size);
	
		for(int i=0;i<size;i++) {
			String value=ele.get(i).getText();
			System.out.println(value);
			if(value.equals("Clothing")) {
			ele.get(i).click();
			}
			}
}*/
	public void SetMobile() {
		Mobile_no.sendKeys("6302063675");
	}
	public void SetLandlne() {
		landline_no.sendKeys("1234");
	}
	public void Setaddress() {
		Address.click();
	}
	public void Setaddresline() {
		Addressline.sendKeys("Secundrabad");
	}
}
