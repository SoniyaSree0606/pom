package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends SearchHotelPage {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "radiobutton_0")
	private WebElement btnClick;
	public WebElement getButtonClick () {
		return btnClick;
	}
	@FindBy(id = "continue")
	private WebElement selectHotelClick;
	public WebElement getSelectHotelClick () {
		return selectHotelClick;
	}
}
