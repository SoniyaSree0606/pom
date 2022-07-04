package org.pagefactory;

import org.locators.BookHotelPage;


public class BookHotelPageExe extends SelectHotelPageExe {
	public static void firstName() {
		valuefromExcel(new BookHotelPage().getFirstName(), 1, 12);
	}
	public static void lastName() {
		valuefromExcel(new BookHotelPage().getLastName(), 1, 13);
	}
	public static void billingAdd() {
		valuefromExcel(new BookHotelPage().getBillingAddress(), 1, 14);
	}
	public static void cardNum() {
		valuefromExcel(new BookHotelPage().getCardNum(), 1, 15);
	}
	public static void cardType() {
		valuefromExcel(new BookHotelPage().getCardType(), 1, 16);
	}
	public static void cardExpMonth() {
		valuefromExcel(new BookHotelPage().getCardExpMonth(), 1, 17);
	}
	public static void cardExpYear() {
		valuefromExcel(new BookHotelPage().getCardExpYear(), 1, 18);
	}
	public static void cardCVV() {
		valuefromExcel(new BookHotelPage().getCardCVV(), 1, 19);
	}
	public static void bookNowClick() {
		click(new BookHotelPage().getBookNow());
	}
}
