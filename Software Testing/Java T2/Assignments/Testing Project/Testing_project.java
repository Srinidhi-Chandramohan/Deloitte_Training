package TrivagoLoginDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivago {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://access.trivago.com/oauth/en-IN/login");
		driver.findElement(By.id("check_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("login_email_submit")).click();
		driver.get("https://access.trivago.com/oauth/en-IN/login?step=login");
		driver.findElement(By.id("login_password")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("login_submit")).click();
	}
}
