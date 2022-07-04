package org.pagefactory;


import org.locators.SelectHotelPage;

public class SelectHotelPageExe extends SearchHotelPageExe{
	public static void buttonClick() {
		click(new SelectHotelPage().getButtonClick());
	}
	public static void selectHotelClick() {
		click(new SelectHotelPage().getSelectHotelClick());
	}

}
