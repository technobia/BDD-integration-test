package net.serenity_bdd.nextchef.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by john on 18/11/14.
 */
@DefaultUrl("http://localhost:5000")
@NamedUrls(
        {
                @NamedUrl(name = "open", url = "/")
        }
)
public class HomePage extends AbstractFrontendPage {
}
