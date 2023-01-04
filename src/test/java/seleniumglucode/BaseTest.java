package seleniumglucode;

import org.openqa.selenium.chrome.ChromeDriver;
import pom.ComicsPage;
import pom.HomePage;

public class BaseTest {

    protected ChromeDriver driver= Hooks.getDriver();
    protected HomePage homePage =new HomePage(driver);
    protected ComicsPage comicsPage=new ComicsPage(driver);


    public BaseTest() throws Exception {
    }
}
