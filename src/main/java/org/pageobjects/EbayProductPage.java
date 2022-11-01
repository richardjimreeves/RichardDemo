package org.pageobjects;

import java.util.LinkedList;
import java.util.List;

import org.Utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayProductPage extends UtilityClass {
	public EbayProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gh-ac")
	private WebElement searchBox;

	@FindBy(id = "prcIsum")
	private WebElement productPrice;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;

	@FindBy(xpath = "//div[@class='s-item__title']")
	private List<WebElement> productNameList;

	@FindBy(xpath = "//span[@class='s-item__price']")
	private List<WebElement> productPriceList;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public List<WebElement> getProductNameList() {
		return productNameList;
	}

	public List<WebElement> getProductPriceList() {
		return productPriceList;
	}

	public WebElement getProductPrice() {
		return productPrice;
	}

	// ----------------------------------------------------------//

	public void searchProduct(String name) {
		sendKeys(getSearchBox(), name);
		click(getSearchButton());

	}

	public WebElement selectProduct() {
		WebElement pr = getProductNameList().get(1);
		click(pr);
		return pr;

	}

	public String getPrice() {
		List<String> li = new LinkedList<String>(driver.getWindowHandles());
		driver.switchTo().window(li.get(1));
		String name = getText(getProductPrice());
		return name;

	}

}
