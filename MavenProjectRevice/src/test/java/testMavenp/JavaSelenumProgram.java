package testMavenp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSelenumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
	            "C:\\Users\\brind.LAPTOP-FD6SDTLA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AXH0vVsf6IVGwSRhRHWnsnEv2nmmTh5T0xWJE8kMyOUoade8Dtx2rxGViItmfnTe3z10SQt1p-pCHg&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-972712367%3A1744113908889676");

	}

}
