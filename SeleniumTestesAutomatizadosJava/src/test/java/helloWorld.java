import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class helloWorld {
    @Test
    public void HelloWorld(){
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver browser = new EdgeDriver();
        browser.navigate().to("http://localhost:8080/leiloes");
        browser.quit();
    }
}
