package seleniumTests.QA.com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pageObjects.RegistrationPageObjects;
import util.Drivers;
import abstractPackage.RegistrationPageLogic;

public class RegistrationPageTests {
 protected RegistrationPageLogic RPL;
 protected RegistrationPageObjects RPO;
	@Before
	public void setUp() {
		RPL = new RegistrationPageLogic();
        Drivers.openSafariDriver();
		RPO = new RegistrationPageObjects();
		RPL.openPage(RPO.REGISTRATION_URL);

	}
	@Test
	public void trytoRegister(){
		RPL.register();
	}
	
	@After
	public void closeShop() {
		RPL.closeThisPage();
	}
}
