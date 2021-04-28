package sdettraing;

import java.util.concurrent.TimeUnit;
import javax.management.RuntimeErrorException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import com.sun.org.apache.bcel.internal.generic.Select;

public class TrainingClass {

	public static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		
	//Invoking of Chrome Driver and opening of application on web
	System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.get("http://leaftaps.com/opentaps/control/main");
     
      Thread.sleep(100);
     //Performing login
 
     driver.findElement(By.id("username")).sendKeys("demosalesmanager");
     driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
     driver.findElement(By.className("decorativeSubmit")).click();
     driver.findElement(By.linkText("CRM/SFA")).click();
     driver.findElement(By.xpath("//a[text()='Leads']")).click();
     driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
    
   //Create Lead
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test12");
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FIRNSNAME");
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LASTNAME");
     
   //Selecting dropdown
      WebElement dropdwon = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
      Select SelectFromDropdwon = new Select(dropdwon); 
      SelectFromDropdwon.selectByVisibleText("Automobile");
      
      //click on create lead
      driver.findElement(By.name("submitButton")).click();
      
      //retriving id
      String LeadnameID = driver.findElement(By.id("viewLead_companyName_sp")).getText();
      //string 11549
      String LeadID =  LeadnameID.replaceAll("[^0-9]", "LeadnameID");
      
      
      //Click on find leds
      driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
      driver.findElement(By.xpath("//input[@class =' x-form-text x-form-field']")).sendKeys(LeadID);
      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
      
      //String expectedLeadID = driver.findElement(By.xpath("//table[[@class =' x-grid3-cell-inner x-grid3-col-partyId']")).click();
    
    
   
    
      
      
      
      
      
      
      
      
      
      
      
    }

}
