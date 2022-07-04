package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends LoginPage {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "location")
	private WebElement location;
	public WebElement getlocation () {
		return location;
	}
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	public WebElement gethotels() {
		return hotels;
	}
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	public WebElement getroomType() {
		return roomType;
	}
	@FindBy(id = "room_nos")
	private WebElement roomNum;
	
	public WebElement getroomNum() {
		return roomNum;
	}
	@FindBy(id = "datepick_in")
	private WebElement datePickIn;
	
	public WebElement getDatePickIn() {
		return datePickIn;
	}
	@FindBy(id = "datepick_out")
	private WebElement datePickOut;
	
	public WebElement getDatePickOut() {
		return datePickOut;
	}
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	 @FindBy(id = "Submit") 
	  private  WebElement searchHotel; 
	  public WebElement getSearchHotel() { 
		  return searchHotel; 
		  }
	

}
