package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class button {
	
	public void clickButton()
	{
		//WebDriverManager.chromedriver().setup();
		 //ChromeDriver driver = new ChromeDriver();
		 //driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("u_0_b")).click();
		generalDriverclass cls= new generalDriverclass();
	WebDriver driver=	cls.getDriver();
	driver.get("https://chromedriver.chromium.org/");
	//driver.findElement(By.id("u_0_b")).click();
		
	}
	

	public static void main(String[] args) {
		
		button btn=new button();
		btn.clickButton();

	}

}
