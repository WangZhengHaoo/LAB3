import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class IniForTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;

    public static final String email = "123456789@qq.com";
    public static final String password = "123456789";

}
