package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SearchPage_PF {

    WebDriver driver;
    public SearchPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(name = "q")
    WebElement input_searchBox;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    WebElement btn_submit;



    public void addUserName(String string){
        input_searchBox.sendKeys(string);
    }
    public void addUserNameAndPressEnter(String string){
        input_searchBox.sendKeys(Keys.ENTER);
    }

    public void clickSubmit(){
        if(btnSubmitIsDisplayed()){
            btn_submit.click();
        }
        else {
            (input_searchBox).sendKeys(Keys.ENTER);
        }
    }

    public boolean btnSubmitIsDisplayed(){

        return (btn_submit).isDisplayed();

    }
}
