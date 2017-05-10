//import java.awt.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic_prog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeepkumar.gupta\\workspace\\Ecom-walmart\\Support Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		//select Australia from drop-down using send-keys
		WebElement dropdown = driver.findElement(By.id("continents"));
		dropdown.sendKeys("Africa");
		
		//verify if the Australia selected, if yes, print a message and if not select it and display msg
		List<WebElement> dropdown_options = driver.findElements(By.xpath("//select[@id='continents']/option"));
		Select dropdown_1 = new Select(dropdown);
		
		int length = dropdown_options.size();
		
		//for (WebElement e: dropdown_options){
		//for (int i=0;i<=length;i++){	
		//if (dropdown_1.selectByVisibleText("Australia"));
		String str = "selenium";
		String str1 = "SeLenium";
		//System.out.println(str.toLowerCase().trim().inde
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}


