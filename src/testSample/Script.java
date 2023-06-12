package testSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\Daya\\driverFiles\\chromedriver.exe");
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().deleteAllCookies();
		String title=driver.getTitle();
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		//driver.close();
		WebElement messagefield= driver.findElement(By.id("single-input-field"));
		messagefield.sendKeys("hi all--Good Morning");
		WebElement showbutton=driver.findElement(By.id("button-one"));
		showbutton.click();
		WebElement yourMessage=driver.findElement(By.id("message-one"));
		String message=yourMessage.getText();
		System.out.println(message);
		WebElement value_A=driver.findElement(By.id("value-a"));
		value_A.sendKeys("10");
		WebElement value_B=driver.findElement(By.id("value-b"));
		value_B.sendKeys("25");
		WebElement getTotal=driver.findElement(By.id("button-two"));
		getTotal.click();
		driver.findElement(By.id("message-two")).click();
		String total=driver.findElement(By.id("message-two")).getText();
		System.out.println(total);
		
	}

}
