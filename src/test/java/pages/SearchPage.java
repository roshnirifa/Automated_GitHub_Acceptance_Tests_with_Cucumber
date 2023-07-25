package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    @FindBy(className = "header-search-button")
    WebElement searchBox;
    @FindBy(id = "query-builder-test")
    WebElement input;

    //    @FindBy(className ="ActionListItem-descriptionWrap")
//    WebElement searchBtn;
    @FindBy(className = "ActionListContent")
    WebElement searchBtn;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void doSearch() {
        searchBox.click();
        input.sendKeys("create-react-app");

    }

    public void clickSearchBtn( WebDriver driver) {
        Actions action = new Actions(driver);
        searchBtn.click();
        action = action.sendKeys(Keys.ARROW_DOWN);

        action.perform();
    }

}
