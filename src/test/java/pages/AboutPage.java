package pages;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.BrowserSetup;
import utils.Utils;


import java.util.List;

public class AboutPage {
    @FindBy(className = "Link--secondary")
    List<WebElement> aboutbtn; //48
    @FindBy(className = "h1-mktg")
    WebElement verifyAboutPage;

    public AboutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doClick() {
//        Utils.doScroll( driver);
        aboutbtn.get(48).click();
    }

    public void verifyAboutPage() {

        String searchActual = verifyAboutPage.getText();
        String searchExpected = "Let's build from here";
        Assert.assertEquals(searchActual, searchExpected);

    }
}
