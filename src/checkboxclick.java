import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxclick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Subhas%20bhosale/OneDrive/Desktop/selenium%20files/checkbox.html");
		for (int i = 0; i < 8; i++) {
			driver.findElement(By.xpath("(//input[@type='checkbox'])[i]")).click();	
		}
	}

}
//input[@type='checkbox'])[3]