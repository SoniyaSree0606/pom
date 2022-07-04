package org.pagefactory;

import java.io.IOException;

import org.locators.BookingConfirmationPage;

public class BookingConfirmationPageExe extends BookHotelPageExe{
	public static void bookOrderNum() throws IOException {
		getOrderValue(new BookingConfirmationPage().getOrderNum(), 3, 4);
		
	}

}
