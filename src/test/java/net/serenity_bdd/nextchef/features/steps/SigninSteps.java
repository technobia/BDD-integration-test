package net.serenity_bdd.nextchef.features.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenity_bdd.nextchef.features.steps.serenity.AuthenticationService;
import net.thucydides.core.annotations.Steps;

/**
 * Created by apium on 16/05/2016.
 */
public class SigninSteps {
    @Steps
    AuthenticationService authentication;

    @Given("^At the login page$")
    public void atTheHomePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        authentication.openLoginPage();;

    }

    @When("^I login by my username '([^\\s]+)' and password '(.*)'$")
    public void iLoginByMyUsernameAndPassword(String username, String password) throws Throwable {
        authentication.inputUserAndPass(username, password);
        authentication.login();
    }

    @Then("^I can access the my workspace$")
    public void iCanAccessTheExplorePage() throws Throwable {
        authentication.shouldBeAtTheWorkspacePage();
    }

    @And("^My name '(.+)' in the top of the page$")
    public void myNameAdminUserInTheTopOfThePage(String ownerName) throws Throwable {
        authentication.shouldContainTheWorkspaceOwnername(ownerName);
    }
}
