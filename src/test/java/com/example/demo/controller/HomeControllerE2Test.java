//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class HomeControllerE2ETest {
//
//    private static WebDriver driver;
//
//    @BeforeAll
//    public static void setUp() {
//        // Assuming you have ChromeDriver installed and set up in your PATH
//        driver = new ChromeDriver();
//    }
//
//    @AfterAll
//    public static void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//
//    @Test
//    public void testIndexPage() {
//        driver.get("http://localhost:8080/");
//
//        WebElement heading = driver.findElement(By.tagName("h1"));
//        assertEquals("Welcome to Spring Boot with Mustache!", heading.getText());
//
//        WebElement list = driver.findElement(By.tagName("ul"));
//        assertEquals(3, list.findElements(By.tagName("li")).size());
//    }
//}
