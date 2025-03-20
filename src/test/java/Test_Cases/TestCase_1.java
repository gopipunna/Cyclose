package Test_Cases;



import org.testng.annotations.Test;

import BaseClass.Base_Class;
import Cyclos.Registration;

public class TestCase_1 extends Base_Class{
	Registration Rt;
	@Test
	public void RegistratonTesting() {
	Rt= new Registration(driver);
	Rt.Setname();
	Rt.SetLogin();
	Rt.SetEmail();
	Rt.SetGendre();
	Rt.SetBussiness();
	Rt.SetMobile();
	Rt.SetLandlne();
	Rt.Setaddress();
	Rt.Setaddresline();
	
	

}
}