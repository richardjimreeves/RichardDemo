package org.Utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {

	public static WebDriver driver;

	public static WebDriver ChromeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public void launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--incognito");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(op);

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.err.println("Invalid Browser name");
			throw new WebDriverException();
		}
	}

	public static void UrlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void back() {
		driver.navigate().back();
	}

	public static String getText(WebElement e) {
		return e.getText();
	}

	public static void jsSendKeys(WebElement e, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", e);

	}

	public static void sendKeys(WebElement e, String data) {
		try {
			e.clear();
			e.sendKeys(data);

		} catch (ElementNotInteractableException m) {
			jsSendKeys(e, data);
		}
	}

	public static void SelectByIndex(WebElement i, int index) {
		Select s = new Select(i);
		s.selectByIndex(index);

	}

	public static void implicitWait(long se) {
		driver.manage().timeouts().implicitlyWait(se, TimeUnit.SECONDS);

	}

	public static void moveElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();

	}

	public static void switchToFrame(WebElement name) {
		driver.switchTo().frame(name);

	}
	
	public static void switchToFrame(int name) {
		driver.switchTo().frame(name);

	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void quit() {
		driver.quit();
	}

	public static void takesScreenShot(String image) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File ff = tk.getScreenshotAs(OutputType.FILE);
		File src = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\ScreenShots\\" + image + ".png");
		FileUtils.copyFile(ff, src);

	}

	public static void jsClick(WebElement e) {
		JavascriptExecutor jd = (JavascriptExecutor) driver;
		jd.executeScript("arguments[0].click()", e);

	}

	public static void jsScrollDown(String dr, WebElement e) {
		JavascriptExecutor jd = (JavascriptExecutor) driver;
		if (dr.equals("up")) {
			jd.executeScript("arguments[0].scrollIntoView(false)", e);
		} else if (dr.equals("down")) {
			jd.executeScript("arguments[0].scrollIntoView(true)", e);
		}

	}

	public static String getPropertyValue(String key) throws IOException {
		Properties p = new Properties();
		FileReader r = new FileReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigurationFiles\\config.properties");
		p.load(r);
		return p.get(key).toString();
	}

	public static void main(String[] args) throws IOException {
		System.out.println(getPropertyValue("password"));
	}
}
