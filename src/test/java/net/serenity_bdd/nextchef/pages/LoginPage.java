package net.serenity_bdd.nextchef.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://localhost:5000")
@NamedUrls(
        {
                @NamedUrl(name = "open", url = "/#/login")
        }
)
public class LoginPage extends AbstractFrontendPage {
    @FindBy(name = "email")
    WebElement emailInput;
    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(xpath = "//button[text() = 'LOG IN']")
    WebElement logInBtton;

    public void inputEmailAndPass(String email, String password) {
        inputText(this.emailInput, email);
        inputText(this.passwordInput, password);
    }

    public void login() {
        this.logInBtton.click();
    }
}