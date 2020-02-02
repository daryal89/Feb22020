package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

	public WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	By fname = By.id("user_name");
	By email = By.id("user_email");
	By password = By.id("user_password");
	By confirmpassword = By.id("user_password_confirmation");
	By captcha = By.cssSelector("[class='recaptcha-checkbox-border']");
	By pemail = By.id("user_unsubscribe_from_marketing_emails");
	By terms = By.id("user_agreed_to_terms");
	By signup = By.xpath("//input[@type='submit']");

	public WebElement getFirstName() {
		return driver.findElement(fname);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement conPassword() {
		return driver.findElement(confirmpassword);
	}

	public WebElement checkCaptcha() {
		return driver.findElement(captcha);
	}

	public WebElement clickPromotionemailbox() {
		return driver.findElement(pemail);
	}
	public WebElement clickTerms() {
		return driver.findElement(terms);
	}
	public WebElement clickSignup() {
		return driver.findElement(signup);
	}

}
