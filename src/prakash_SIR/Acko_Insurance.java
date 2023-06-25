package prakash_SIR;

import java.awt.desktop.QuitEvent;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Acko_Insurance {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for (int i = 0; i < 3; i++) {
			js.executeScript("scrollBy(0,9999)");		
		}
		//controller is in main page itself clicking 4 times 
		driver.findElement(By.xpath("//button[contains(text(),'Open New Window')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Open New Window')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Open New Window')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Open New Window')]")).click();
		Set<String> pids = driver.getWindowHandles();
		int count=0;
		for(String s:pids) //controller is shifting 1 tab to another
		{
			count++;
//			WebDriver a = driver.switchTo().window(s);	
			if(count==2) {
				driver.manage().window().maximize();
			}
			if(count==4) 
			{
//				driver.switchTo().window(s);
//				System.out.println(count==4);
//				String	z=driver.findElement(By.xpath("//h1[contains(text(),'Basic Controls') and @class='post-title entry-title']")).getText();
//				System.out.println(z);
			}
		}
		for(int i=0;i<3;i++) {
			if(i==2) {
				String	z=driver.findElement(By.xpath("//h1[contains(text(),'Basic Controls') and @class='post-title entry-title']")).getText();
				System.out.println(z);
			}
			else {
				driver.switchTo().defaultContent();
			}
		}

	}
}
