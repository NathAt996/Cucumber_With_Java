package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeStepsDefinition {

    public static WebDriver driver;


    @Given("I navigate to the HomePage")
    public void i_navigate_to_the_home_page() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chromedriver", "C:\\Users\\NathanMorgan51\\Downloads\\chromedriver-win32.zip\\chromedriver-win32");
        driver = new ChromeDriver(options);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

    }
    @When("navigating, forgot password link")
    public void navigating_forgot_password_link() {
        driver.findElement(By.xpath("//u[text()='Forgot Password?']")).click();

    }
    @Then("I should see the forgot password page")
    public void i_should_see_the_forgot_password_page() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Password help assistance");

    }

}
