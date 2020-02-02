package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.SignUpPage;
import resources.base;

public class RegistrationPageTest extends base {
	WebDriver driver;

	private static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initilize() throws IOException {
		log.info("Driver is initialized:");

		driver = initializeDriver();

		driver.get(prop.getProperty("signupurl"));
	}

	@Test
	public void getRegister() {
		LandingPage l = new LandingPage(driver);

		log.info("click on register link");
		//l.getRegister().click();

		SignUpPage s = new SignUpPage(driver);

		log.info("enter name in firstname field");
		s.getFirstName().sendKeys(prop.getProperty("fname"));

		log.info("Enter email");
		s.getEmail().sendKeys(prop.getProperty("email"));

		log.info("Enter passowrd");
		s.enterPassword().sendKeys(prop.getProperty("password"));

		log.info("confirm password");
		s.conPassword().sendKeys(prop.getProperty("cpassword"));

		log.info("check the captcha bar");
		//s.checkCaptcha().click();

		log.info("accept promotional email box");
		s.clickPromotionemailbox().click();

		log.info("check terms box condition");
		s.clickTerms().click();

		log.info("click on signup button");
		//s.clickSignup().click(); //button is disabled

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}

}
