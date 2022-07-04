package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends SelectHotelPage{
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "first_name")
	private WebElement firstName;
	public WebElement getFirstName () {
		return firstName;
	}
	@FindBy(id = "last_name")
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}
	@FindBy(id = "address")
	private WebElement billingAddress;
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	@FindBy(id = "cc_num")
	private WebElement cardNum;
	public WebElement getCardNum() {
		return cardNum;
	}
	@FindBy(id = "cc_type")
	private WebElement cardType;
	public WebElement getCardType() {
		return cardType;
	}
	@FindBy(id = "cc_exp_month")
	private WebElement cardExpMonth;
	public WebElement getCardExpMonth() {
		return cardExpMonth;
	}
	@FindBy(id = "cc_exp_year")
	private WebElement cardExpYear;
	public WebElement getCardExpYear() {
		return cardExpYear;
	}
	@FindBy(id = "cc_cvv")
	private WebElement cardCVV;
	public WebElement getCardCVV() {
		return cardCVV;
	}
	@FindBy(id = "book_now")
	private WebElement bookNow;
	public WebElement getBookNow() {
		return bookNow;
	}
}
