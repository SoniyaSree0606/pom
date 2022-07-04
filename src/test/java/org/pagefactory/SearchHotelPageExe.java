package org.pagefactory;

import org.locators.SearchHotelPage;

public class SearchHotelPageExe extends LoginPageExe{
	public static void location() {
		valuefromExcel(new SearchHotelPage().getlocation(), 1, 5);
	}
	public static void hotels() {
		valuefromExcel(new SearchHotelPage().gethotels(), 1, 6);
	}
	public static void roomType() {
		valuefromExcel(new SearchHotelPage().getroomType(), 1, 7);
	}
	public static void numOfRoom() {
		valuefromExcel(new SearchHotelPage().getroomNum(), 1, 8);
	}
	public static void datePickIn() {
		clear(new SearchHotelPage().getDatePickIn());
		valuefromExcel(new SearchHotelPage().getDatePickIn(), 1, 9);
	}
	public static void datePickOut() {
		clear(new SearchHotelPage().getDatePickOut());
		valuefromExcel(new SearchHotelPage().getDatePickOut(), 1, 10);
	}
	public static void numOfAdults() {
		valuefromExcel(new SearchHotelPage().getAdultRoom(), 1, 11);
	}
	public static void searchHotelClick() {
		click(new SearchHotelPage().getSearchHotel());
	}

}
