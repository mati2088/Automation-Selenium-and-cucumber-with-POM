package seleniumglucode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private  static ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\matia\\OneDrive\\Escritorio\\Cucumber\\Cucumber #1\\src\\main\\resources\\drivers\\driver.exe");
        driver=new ChromeDriver();
        driver.get("https://imalittletester.com/my-conference-talks/");
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }


}
