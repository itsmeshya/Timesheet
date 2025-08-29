package timeSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbrowsercommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Title "+driver.getTitle());
		System.out.println("Current URL "+driver.getCurrentUrl());
		System.out.println("PageSource "+driver.getPageSource());
		Thread.sleep(5000);
		driver.close();
	}
}
