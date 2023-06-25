package Interview_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("hi");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='Alh6id']//li//div[@class='pcTkSc']//div[@class='wM6W7d']"));
	
	for (int i = 0; i < list.size(); i++)
	{
		WebElement ele = list.get(i);       //single element
		String s = ele.getText();
		System.out.println(s);
		if (s.equals("Hidden Love")) 
		{	
			list.get(i).click();
			break;
		}
	}
	Thread.sleep(3000);
	driver.quit();
}
}
