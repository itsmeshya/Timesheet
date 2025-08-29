package timeSheet;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandle {
	public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			driver=new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			//driver.findElement(By.id("alertButton")).click();
			
			//driver.findElement(By.id("confirmButton")).click();
			
			//driver.findElement(By.id("promtButton")).click();
						
			driver.findElement(By.id("timerAlertButton")).click();
			
			//Alert alt=driver.switchTo().alert();
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			//alt.accept();
			//Thread.sleep(3000);
			//alt.sendKeys("Shya");
						
			//alt.dismiss();
			
	}

}
