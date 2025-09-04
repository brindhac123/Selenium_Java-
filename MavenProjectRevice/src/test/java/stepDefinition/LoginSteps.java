package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {

    WebDriver driver;

    @Given("User launches the browser")
    public void user_launches_the_browser() {
    	System.setProperty("webdriver.chrome.driver", 
	            "C:\\Users\\brind.LAPTOP-FD6SDTLA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("User navigates to SwagLabs login page")
    public void user_navigates_to_swaglabs_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("User enters valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User should be redirected to the home page")
    public void user_should_be_redirected_to_the_home_page() {
        String title = driver.getTitle();
        if(title.contains("Swag Labs")) {
            System.out.println("Login successful - Home page opened");
        } else {
            System.out.println("Login failed");
        }
        //driver.quit();
    }
}
