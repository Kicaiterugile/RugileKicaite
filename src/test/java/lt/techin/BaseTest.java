package lt.techin;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    static WebDriver driver;
    @BeforeEach

    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://op.akademijait.vtmc.lt/");


    }

//    @AfterEach
//    public void quit() {
//        driver.quit();
//    }
}
