package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    protected WebDriver driver;

    public SearchPage(WebDriver driver){

        this.driver=driver;
    }

    private By input_searchBox = By.name("q");
    private By btn_submit = By.xpath("(//*[@type='submit'])[1]");

    public void addUserName(String string){
        driver.findElement(input_searchBox).sendKeys(string);
    }
    public void addUserNameAndPressEnter(String string){
        driver.findElement(input_searchBox).sendKeys(Keys.ENTER);
    }

    public void clickSubmit(){
        if(btnSubmitIsDisplayed()){
            driver.findElement(btn_submit).click();
        }
        else {
            driver.findElement(input_searchBox).sendKeys(Keys.ENTER);
        }
    }

    public boolean btnSubmitIsDisplayed(){

        return driver.findElement(btn_submit).isDisplayed();

    }
}
