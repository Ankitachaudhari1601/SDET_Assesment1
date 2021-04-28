
package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utilities.Hooks;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class StepDefination {

WebDriver driver = Hooks.driver;

@Given("^User should be navigated to the ELEARNING UPSKILL URL$")
public void user_should_be_navigated_to_the_ELEARNING_UPSKILL_URL() throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://elearningm1.upskills.in/");
	Thread.sleep(100); 
	System.out.println("User is successfully navigated to ELEARNING UPSKILL screen");
	
  
}

@When("^Click on Sign Up Button$")
public void click_on_Sign_Up_Button() throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a")).click();
	System.out.println("User is successfully navigated to Registration screen");
  
}

@When("^Enter all mandatory field$")
public void enter_all_mandatory_field() throws Throwable
{
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("registration_firstname")).sendKeys("Ankita");
	driver.findElement(By.id("registration_lastname")).sendKeys("Chaudhari");
	driver.findElement(By.id("registration_email")).sendKeys("chaudhariankit5454@gmail.com");
	driver.findElement(By.id("username")).sendKeys("Ankitachaudhari5454");
	driver.findElement(By.id("pass1")).sendKeys("Password@5454");
	driver.findElement(By.id("pass2")).sendKeys("Password@5454");
	driver.findElement(By.id("registration_phone")).sendKeys("1234567890");
	driver.findElement(By.id("registration_official_code")).sendKeys("412216");
	driver.findElement(By.name("extra_skype")).sendKeys("Ankita_Chaudari");
	driver.findElement(By.name("extra_linkedin_url")).sendKeys("https://ankita.chaudhari.linkedIn.com");
    Thread.sleep(1000);
   
}

@When("^Click on Register Button$")
public void click_on_Register_Button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("registration_submit")).click();
	System.out.println("Successfuly completed the regitration process");
  
}

@Then("^registration should be successful$")
public void registration_should_be_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Successfuly completed the regitration process");
}










/*********************************Scenrio_2_Login and compose Mail*************************************/









@When("^Completed the registration process$")
public void completed_the_registration_process() throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://elearningm1.upskills.in/");
	Thread.sleep(100); 
	System.out.println("User is successfully navigated to ELEARNING UPSKILL screen");
	
   
}

@When("^enter any value \"([^\"]*)\" in Username field$")
public void enter_any_value_in_Username_field(String arg1) throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("login")).sendKeys("Ankitachaudhari5454Ankitachaudhari5454");
   
}

@When("^enter any value \"([^\"]*)\" in Pass field$")
public void enter_any_value_in_Pass_field(String arg1) throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.id("password")).sendKeys("Password@5454");
}

@When("^click on Login Button$")
public void click_on_Login_Button() throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("form-login_submitAuth")).click();
}

@When("^Click on  Compose hyperlink icon$")
public void click_on_Compose_hyperlink_icon() throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
	WebElement p=driver.findElement(By.partialLinkText("Compose"));
    p.click();
    System.out.println("Page title after link click : " +   driver.getTitle());
  


}

@When("^enter any value \"([^\"]*)\" in Sent to field$")
public void enter_any_value_in_Sent_to_field(String arg1) throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
	 
	Actions act = new Actions(driver);
	
	driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("naveen");
    Thread.sleep(2000);
    
    
    driver.findElement(By.xpath("//li[contains(text(),'naveen naveen')]"));
    Thread.sleep(1000);    
    
   
	act.sendKeys(Keys.RETURN).perform();
    Thread.sleep(3000);
    
	driver.findElement(By.id("compose_message_title")).sendKeys("Testing for Sending message");
	Thread.sleep(3000);
	
	
	driver.findElement(By.cssSelector(".cke_wysiwyg_frame"));
	driver.switchTo().frame(0);
	waitForElementToBeLoad("//body");
	driver.findElement(By.xpath("//body")).click();
	waitForElementToBeLoad("//body/p");
	driver.findElement(By.xpath("//body/p")).sendKeys("Hello Mr.Navven \n This is for testing \n From, \n Ankita");
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	Thread.sleep(3000);

   
}

private void waitForElementToBeLoad(String string) {
	// TODO Auto-generated method stub
	
}

@Then("^click on \"([^\"]*)\" icon$")
public void click_on_icon(String arg1) throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
	// driver.findElement(By.id("compose_message_compose")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class=' btn btn-primary ']")).click();
	driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed();
	   

}

	

}




