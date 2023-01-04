package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComicsPage extends BasePage {

    private By getTitelPage=By.linkText("Next Page");

    public ComicsPage(WebDriver driver) throws Exception {
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception {

        return this.isDisplayed(getTitelPage);
    }

}
