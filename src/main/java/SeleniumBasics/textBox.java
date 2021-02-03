package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	 /*
	  * locators
	  * 1. tagname
	  * 2. id
	  * 3. name
	  * 4. classname
	  * 5. linktext
	  * 6. partiallink text
	  * 7. css selector
	  * 8. Xpath
	  */
	 //if (driver.findElement(By.id("email")).isDisplayed()&& driver.findElement(By.id("pass")).isDisplayed()) {
	 //driver.findElement(By.id("email")).sendKeys("shashidhararyan@gmail.com");
	 //System.out.println("email id enterred");
	 
	 
	 //driver.findElement(By.id("pass")).sendKeys("shashiSG");
	 //driver.findElement(By.name("pass")).sendKeys("shashiSG");
	 //driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("shashiSG"); - two same classnames present
	 //driver.findElement(By.cssSelector("input[id='pass']")); 
	/*syntax - tagName[atribute name='atribute value']
	 * syntax - tagname#id value
	 * synatx - tagname.class name
	 */
	 
	 //driver.findElement(By.cssSelector("input#pass")); 
	 //syntax for xpath - //tagname[@attributename='attribute value' and @attributename='attribute value']
	 //driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy' and @type='password']")).sendKeys("shashiSG");
	 //System.out.println("password enterred");
	 //}
	 //driver.findElement(By.id("u_0_b")).click();
	 
	 //xpath syntaxes
	  //xpath by attributes - tagnmae[@atribute name='attribute value']
	  
	 //driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	 //driver.findElement(By.xpath(""));
	 
	 //System.out.println("login button clicked");
	 
	 //Thread.sleep(1000);
	 //synatx for xpath text function - //tagname[text()='text value'] or //tagname[.='text value']
	 //driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	 //driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
	 //syntax xpath for contains function - //tagname[contains(@attribute name, 'attribute value')]
	 driver.findElement(By.xpath("//a[contains(.,'Forgotten password')]")).click();
	 
	 driver.quit();
		
				
	
		
	}

}
