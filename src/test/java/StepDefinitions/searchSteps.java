package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class searchSteps {

    WebDriver webDriver=null;

    @Given("page is loaded")
    public void page_is_loaded() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.google.com");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

        @When("user clicks on search box")
        public void user_clicks_on_search_box() {

        }
        @When("user type the {string}")
        public void user_type_the(String string) {
            webDriver.findElement(By.name("q")).sendKeys(string);
        }
        @When("user add the {string} and search")
        public void user_add_the_and_search(String string) {
            webDriver.findElement(By.name("q")).sendKeys(string);
        }
        @When("clicks on search button")
        public void clicks_on_search_button() {
        if(webDriver.findElement(By.xpath("(//*[@type='submit'])[1]")).isDisplayed()){
            webDriver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
        }
        else
            webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        }
        @Then("user should navigate to the results sheet")
        public void user_should_navigate_to_the_results_sheet() {
          webDriver.close();
          webDriver.quit();
        }
}
