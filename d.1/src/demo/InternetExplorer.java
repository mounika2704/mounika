package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\jashwanth reddy\\Downloads\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        wwebdriverma
        
        //driver.get("https://demoqa.com/forms");
         
        
        driver.close();
        driver.quit();
	}
 
}
