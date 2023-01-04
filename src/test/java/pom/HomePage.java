package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends  BasePage{
    private   String titleHomePage= "My Conference Talks – imalittletester";
    private By titleComicsLocator=By.className("menu-item-object-category");


    //constructor basePage
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public boolean homePageIsDisplayed()throws Exception    {
        return this.getTitel().equals(titleHomePage);
    }

    public void clickOnTitleComics() throws Exception{
        this.click(titleComicsLocator);
    }






}
