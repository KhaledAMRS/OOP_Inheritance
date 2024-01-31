import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login extends TestBase{

    WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        loadProjectDataProperties();   //If you don't call it -> you will get this error java.lang.NullPointerException: Cannot invoke "java.util.Properties.getProperty(String)" because "this.prop" is null

        this.driver = initializeBrowser(prop.getProperty("browser"));

        driver.get(prop.getProperty("url"));
    }

    @Test(priority = 1)
    public void loginWithValidCredentials() throws IOException
    {

    }

    @AfterMethod
    public void closure() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
