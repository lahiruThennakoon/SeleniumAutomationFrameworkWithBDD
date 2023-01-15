package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.SearchPage_PF;
import java.time.Duration;

public class searchSteps extends TestBase {
    SearchPage_PF searchPage;


    @Before
    public void browserSetup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.google.com");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }
    @Given("page is loaded")
    public void page_is_loaded() {
        System.out.println("page is loaded");

    }

        @When("user clicks on search box")
        public void user_clicks_on_search_box() {


        }
        @When("user type the {string}")
        public void user_type_the(String string) {
        searchPage= new SearchPage_PF(webDriver);
            searchPage.addUserName(string);
        }
        @When("user add the {string} and search")
        public void user_add_the_and_search(String string) {
            searchPage.addUserName(string);
        }
        @When("clicks on search button")
        public void clicks_on_search_button() {
        searchPage.clickSubmit();
        }
        @Then("user should navigate to the results sheet")
        public void user_should_navigate_to_the_results_sheet() {

        }

        @After
    public void tearDown (){
            webDriver.close();
            webDriver.quit();
        }
}
