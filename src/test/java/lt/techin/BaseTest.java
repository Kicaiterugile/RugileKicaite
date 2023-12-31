package lt.techin;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach

    public void setup() throws InterruptedException {
//     driver = new ChromeDriver();
        EdgeOptions edgeOptions = new EdgeOptions();
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.get("http://localhost:8080");
    }

//    @AfterEach
//    public void quit() {
//        driver.quit();
//    }
}
