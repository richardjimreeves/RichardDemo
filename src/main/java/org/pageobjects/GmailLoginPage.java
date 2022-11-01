package org.pageobjects;

import java.io.IOException;

import org.Utility.UtilityClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage extends UtilityClass {

	public GmailLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "identifierId")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement buttonNext;

	@FindBy(xpath = "//a[@class='gb_A gb_Ma gb_f']")
	private WebElement profileIcon;

	@FindBy(xpath = "//div[@class='Wdz6e ZnExKf']")
	private WebElement userMail;

	@FindBy(name = "account")
	private WebElement account;

	@FindBy(xpath = "//div[@jsname='B34EJ']/span")
	private WebElement errorMessage;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButtonNext() {
		return buttonNext;
	}

	public WebElement getProfileIcon() {
		return profileIcon;
	}

	public WebElement getUserMail() {
		return userMail;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	// --------------------------------------------------------------//

	public void enterUserName() throws IOException {
		jsSendKeys(getUsername(), getPropertyValue("username"));
		jsClick(getButtonNext());
	}

	public void enterPassword() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys(getPropertyValue("password"));
		jsClick(getButtonNext());
	}

	public void enterInvalidPassword() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys(getPropertyValue("invalidpass"));
		jsClick(getButtonNext());
	}

	public void clickProfileIcon() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		moveElement(getProfileIcon());
		click(getProfileIcon());
		switchToFrame(1);
	}

	public void verifyUserLogin() throws IOException {
		String mail = getText(getUserMail());
		Assert.assertTrue("Verify Succesful login", getText(getUserMail()).equals(getPropertyValue("username")));

	}

	public void verifyUserInvalidLogin() {
		String msg = getText(getErrorMessage());
		Assert.assertTrue("Verify Invalid login", msg.contains("Wrong password"));

	}

	public static void main(String[] args) throws IOException {
		System.out.println(getPropertyValue("username"));
	}

}
