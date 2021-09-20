package BasicJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Sai\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("jashwanthravuru@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("jashwanthyadav");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//*[@name='checkout']")).click();
		//billing address
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		
		driver.close();

	}

}
