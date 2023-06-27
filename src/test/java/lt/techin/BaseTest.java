package lt.techin;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseTest {
    static WebDriver driver;
    @BeforeEach

    public void setup() throws InterruptedException {
     driver = new ChromeDriver();
//       EdgeOptions edgeOptions = new EdgeOptions();
//       driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.get("https://op.akademijait.vtmc.lt/");


    }

//    @AfterEach
//    public void quit() {
//        driver.quit();
//    }
}
