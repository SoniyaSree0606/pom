package org.pagefactory;

import org.locators.LoginPage;

public class LoginPageExe extends LoginPage {

	public static void username() {
		valuefromExcel(new LoginPage().getUsername(), 1, 0);

	}

	public static void password() {
		valuefromExcel(new LoginPage().getPassword(), 1, 1);
	}

	public static void login() {
		click(new LoginPage().getLogin());
	}

}
