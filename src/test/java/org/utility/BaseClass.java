package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static String val;
	static FileInputStream fis;
	static FileOutputStream fos;
	public static String value = null;
	static File xcelFile = new File(
			"C:\\Users\\soni\\eclipse-workspace\\PomWithPageFactory\\src\\test\\resources\\testData\\TestData.xlsx");
	static File propFile = new File(
			"C:\\Users\\soni\\eclipse-workspace\\PomWithPageFactory\\src\\test\\resources\\testData\\credentials.properties");
	static FileReader fr;
	static FileWriter write;
	static Properties prop;
	static Sheet sheet;

	public static void browserLauch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public static void getUrl(String val) {
		driver.get(val);

	}

	public static void readProperty(String value) {
		try {
			fr = new FileReader(propFile);
			prop = new Properties();
			prop.load(fr);
			val = prop.getProperty(value);
			getUrl(val);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static WebElement findEleById(String id) {
		return driver.findElement(By.id(id));

	}

	public static WebElement findEleByName(String name) {
		return driver.findElement(By.id(name));

	}

	public static WebElement findEleByXpath(String xpath) {
		return driver.findElement(By.id(xpath));

	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void valuefromExcel(WebElement element, int rowNum, int colNum) {

		try {
			fis = new FileInputStream(xcelFile);
			Workbook wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("Soniya");
			val = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			element.sendKeys(val);
			wb.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void getOrderValue(WebElement element, int row, int col) throws IOException {
		String orderVal = element.getAttribute("value");

		fis = new FileInputStream(xcelFile);
		Workbook wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Soniya");
		Row row1 = sheet.createRow(row);
		Cell column = row1.createCell(col);
		column.setCellValue(orderVal);
		fos = new FileOutputStream(xcelFile);
		wb.write(fos);
		wb.close();
	}
}
