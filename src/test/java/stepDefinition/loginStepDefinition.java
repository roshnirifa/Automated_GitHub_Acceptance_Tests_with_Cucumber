package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashBoardPage;
import pages.SearchPage;
import setup.BrowserSetup;

;

public class loginStepDefinition extends BrowserSetup {
    SearchPage searchPage;
    DashBoardPage dashboardPage;

    @Given("user visit the website")
    public void user_visit_the_website() {

        driver.get("https://github.com/");
    }

    @When("search create-react-app")
    public void search_create_react_app() {
        searchPage = new SearchPage(driver);
        searchPage.doSearch();
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        searchPage = new SearchPage(driver);
        searchPage.clickSearchBtn(driver);
    }

    @Then("user can see the search result")
    public void user_can_see_the_search_result() {
        dashboardPage = new DashBoardPage(driver);
        dashboardPage.verifySearchResult();

    }
    @After
    public void closeDriver(){
        driver.quit();
    }
}
