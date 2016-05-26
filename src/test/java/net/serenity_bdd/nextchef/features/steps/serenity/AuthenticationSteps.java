package net.serenity_bdd.nextchef.features.steps.serenity;

import net.serenity_bdd.nextchef.pages.WorkspacePage;
import net.serenity_bdd.nextchef.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

/**
 * Created by apium on 16/05/2016.
 */
public class AuthenticationSteps {
    LoginPage loginPage;
    WorkspacePage workspacePage;

    @Step
    public void openLoginPage() {
        loginPage.open("open", new String[]{});
    }

    @Step
    public void inputUserAndPass(String userName, String password) {
        loginPage.inputEmailAndPass(userName, password);
    }

    @Step
    public void login() {
        loginPage.login();
    }

    @Step
    public void shouldBeAtTheWorkspacePage() {
        workspacePage.isExplorePage();
    }


    public void shouldContainTheWorkspaceOwnername(String ownerName) {
        Assert.assertEquals(ownerName, workspacePage.getOwnerName());
    }
}
