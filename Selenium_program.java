package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
	            "C:\\Users\\brind.LAPTOP-FD6SDTLA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://accounts.google.com/v3/signin/identifier?ifkv=AdBytiNto1_KhG6pnnMJnhuukYeug1XAUh0lO1CedP7V6j5A467pTuwmuWc8TBsgK46_2DKWmPfDng&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1037988790%3A1756618464738524");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("brindhs@gmail.com");
driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();

	}

}
