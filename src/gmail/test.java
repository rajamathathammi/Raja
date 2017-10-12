package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("rajamatha.thammi");
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("19041995");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a.WaidBe")).click();
	}

}
