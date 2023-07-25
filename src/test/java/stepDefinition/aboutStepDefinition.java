package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AboutPage;
import setup.BrowserSetup;

public class aboutStepDefinition extends BrowserSetup {
    AboutPage aboutPage;

    @Given("user can visit the website")
    public void user_can_visit_the_website() {
        driver.get("https://github.com/");
    }

    @When("user click about button")
    public void user_click_about_button() {
        aboutPage = new AboutPage(driver);
        aboutPage.doClick();
    }

    @Then("user can see the about page")
    public void user_can_see_the_about_page() {
        aboutPage.verifyAboutPage();
    }
    @After
    public void closeDriver(){
        driver.quit();
    }
}
