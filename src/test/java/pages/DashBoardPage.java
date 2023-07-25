package pages;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoardPage {
    @FindBy(className = "search-match")
    public List<WebElement> searchResult;//0

    public DashBoardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifySearchResult() {
        WebElement result = searchResult.get(0);
        String searchActual = result.getText();
        String searchExpected = "facebook/create-react-app";
        Assert.assertEquals(searchActual, searchExpected);


    }
}
