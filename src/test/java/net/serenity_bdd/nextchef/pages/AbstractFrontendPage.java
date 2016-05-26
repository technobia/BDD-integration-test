package net.serenity_bdd.nextchef.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by apium on 25/05/2016.
 */
@DefaultUrl("http://localhost:5000")
public class AbstractFrontendPage extends PageObject {
    protected void inputText(WebElement inputEl, String txtValuse) {
        inputEl.clear();
        inputEl.sendKeys(txtValuse);
    }
}
