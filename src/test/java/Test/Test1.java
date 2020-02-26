package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
    @Test
	public void  Testas() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32 (6)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.154/blm");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='login-email']")).sendKeys("fazil@srinsofttech.com");
		driver.findElement(By.id("login-password")).sendKeys("sst12345"); 
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(3000);
		
	}
	
	   
}
