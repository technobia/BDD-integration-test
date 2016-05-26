package net.serenity_bdd.nextchef.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by john on 18/11/14.
 */
@DefaultUrl("http://localhost:5000")
@NamedUrls(
        {
                @NamedUrl(name = "open", url = "/#/")
        }
)
public class WorkspacePage extends AbstractFrontendPage {
    @FindBy(css = "div.navbar-dropdown.navbar-settings.dropdown > div.text")
    WebElement userNameEl;
    @FindBy(css = "div.project-list.list-view")
    WebElement projectList;

    public void isExplorePage() {
        this.shouldBeVisible(projectList);
    }

    public String getOwnerName() {
        return userNameEl.getText();
    }
}
