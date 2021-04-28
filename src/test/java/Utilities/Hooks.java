package Utilities;

import org.openqa.selenium.WebDriver;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {

	public static WebDriver driver;
	
	@Before
	public void before_scenario()
	{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\AnkitaChaudhari\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
	System.out.println("Success");
	driver = new ChromeDriver();
		}
	
	@After
	public void after_scenario()
	{
		System.out.println("After execution");
		driver.close();
		
	}
	
}
