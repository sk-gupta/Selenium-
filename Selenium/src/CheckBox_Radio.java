//package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Radio {

	public static void main(String[] args) throws InterruptedException {
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandeep\\Desktop\\desktop 20 feb\\Ecom-walmart\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		List <WebElement> option = driver.findElements(By.name("sex"));
		if (option.get(0).isSelected())
		{
			System.out.println("Male option is already selected, so we are selecting the Female");
			option.get(1).click();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("FeMale option is already selected, so we are selecting the Male");
			option.get(0).click();
			Thread.sleep(2000);
		}
		System.out.println("Time to quit");
		Thread.sleep(3000);
		List <WebElement> year_option = driver.findElements(By.name("exp"));
		year_option.get(2).click();
		
		Thread.sleep(3000);
		List<WebElement> testing_type = driver.findElements(By.name("profession"));
		
		for (WebElement e: testing_type)
		{
			if (e.getAttribute("value").equals("Automation Tester"))
			{
				e.click();
				System.out.println("clicking on Automation Tester");
				//break;
				Thread.sleep(2000);
			}
		
		}
		System.out.println("time to quit");
		driver.quit();
		
	}
	
}
