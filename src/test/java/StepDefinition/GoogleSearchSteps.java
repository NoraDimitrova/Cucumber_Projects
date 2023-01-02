package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - Browser is open");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nora Dimitrova\\Desktop\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

    }

    @And("user is on google page")
    public void user_is_on_google_page() {
        System.out.println("Inside Step - User is on Google search page");
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//div[text()='Приемане на всички']")).click();
    }

    @When("user enters text in search box")
    public void user_enters_text_in_search_box() {
        System.out.println("Inside Step - User enters a text in search box");
        driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
    }

    @And("this enter")
    public void this_enter() {
        System.out.println("Inside Step - this enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Inside Step - user is navigated to search results");
        driver.getPageSource().contains("Automation Step by Step: NEVER STOP LEARNING");
//        driver.close();
//        driver.quit();
    }


}
