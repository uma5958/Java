package HashMapInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCRMTest {
	public WebDriver driver;
	String credentialsInfo[];

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
	}

	@Test(priority=1)
	public void loginWithAdminUserTest() throws Exception {
		String credentials = Data.getUserLoginInfo().get("admin");
		credentialsInfo = credentials.split("_");
		driver.findElement(By.xpath("username")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.xpath("password")).sendKeys(credentialsInfo[1]);
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("documents[0].click();",loginBtn);
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Select s = new Select(driver.findElement(By.name("SelectMonth")));
		s.deselectByVisibleText(Data.monthMap().get(10));
	}

	@Test(priority=2)
	public void loginWithCustomerUserTest() throws Exception {
		String credentials = Data.getUserLoginInfo().get("adminuser");
		credentialsInfo = credentials.split("_");
		driver.findElement(By.xpath("username")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.xpath("password")).sendKeys(credentialsInfo[1]);
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("documents[0].click();",loginBtn);
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Select s = new Select(driver.findElement(By.name("SelectMonth")));
		s.deselectByVisibleText(Data.monthMap().get(10));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
