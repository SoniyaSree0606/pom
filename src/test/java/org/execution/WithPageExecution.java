package org.execution;


import java.io.IOException;

import org.pagefactory.BookingConfirmationPageExe;

public class WithPageExecution extends BookingConfirmationPageExe{
	public static void loginPage() {
		username();
		password();
		login();
	}
	public static void searchHotelPage() {
		location();
		hotels();
		roomType();
		numOfRoom();
		datePickIn();
		datePickOut();
		numOfAdults();
		searchHotelClick();
	}
	public static void selctHotelPage() {
		buttonClick();
		selectHotelClick();
	}
	public static void bookHotelPage() {
		firstName();
		lastName();
		billingAdd();
		cardNum();
		cardType();
		cardExpMonth();
		cardExpYear();
		cardCVV();
		bookNowClick();
	}
	public static void orderNumber() throws IOException {
		bookOrderNum();
		
	}

	public static void main(String[] args) throws IOException {
		browserLauch();
		readProperty("url");
		loginPage();
		searchHotelPage();
		selctHotelPage();
		bookHotelPage();
		orderNumber();
			

	}

}
