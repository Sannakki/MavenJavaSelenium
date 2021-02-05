package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class radioButton {

	public static void main(String[] args) throws InterruptedException  {
		
		generalDriverclass drv=new generalDriverclass();
		
		WebDriver dr=drv.getDriver();
		
		dr.get("https://www.facebook.com/");
		dr.findElement(By.id("u_0_2")).click();
		Thread.sleep(1000);
		
		//List <WebElement> lt=dr.findElements(By.cssSelector("label._58mt"));
		//WebDriverWait wait = new WebDriverWait(dr,1000);
		//wait.until(ExpectedConditions.visibilityOfAllElements(dr.findElements(By.cssSelector("label._58mt"))));
		List <WebElement> lt=dr.findElements(By.cssSelector("label._58mt"));
		//List <WebElement> lt=dr.findElements(By.xpath("(//span[@class='_5k_2 _5dba']//label[1])"));
		
		//System.out.println(lt);
		//dr.findElement(By.xpath("//label[@class='_58mt']")).getText();
		
		
	for (WebElement c:lt)
	{
		
		String gender=c.getText();
//		if(gender.) {
//			
//		c.click();
//		}
		//String genders =  c.getAttribute("inner text");
		
        System.out.println(gender);
		//System.out.print(genders);
	}
//dr.quit();
	}

}
