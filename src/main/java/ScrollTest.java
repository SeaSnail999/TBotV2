// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ScrollTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    //System.setProperty("webdriver.gecko.driver", "/home/user/Downloads/geckodriver");
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void scroll() {
    // Test name: scroll
    // Step # | name | target | value
    // 1 | open | /z/ | 
    driver.get("https://web.telegram.org/z/");
    // 2 | setWindowSize | 550x692 | 
    driver.manage().window().setSize(new Dimension(550, 692));
    // 3 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 4 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 5 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 6 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 7 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 8 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 9 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 10 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
  }
}