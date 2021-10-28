package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	private static WebDriver chorome;

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jashwanth reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver chrome = new ChromeDriver();
	chrome.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	chrome.findElement(By.xpath("//input[@name='firstName']")).sendKeys("mounika");
	//chrome.findElement(By.name("lastName")).sendKeys("reddy");
	//chrome.findElement(By.name("Username")).sendKeys("mounikareddieee1234");
	//chrome.findElement(By.name("Passwd")).sendKeys("mounik@123");
	//chrome.findElement(By.name("ConfirmPasswd")).sendKeys("mounik@123");
	Thread.sleep(1000);
    //chrome.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    //Thread.sleep(1000);
   // chrome.findElement(By.name()
	
	
	
	
	
	
	
	
	
	

	
	Thread.sleep(10000);
		
    chrome.close();
    chrome.quit();
		
		
	}

}
