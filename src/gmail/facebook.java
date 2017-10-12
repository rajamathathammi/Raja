package gmail;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    driver.get("https://accounts.facebook.com/signin");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("rajamatha.thammi@gmail.com");
  
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("143143");
    driver.findElement(By.id("loginbutton")).click();
  }

}