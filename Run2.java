
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run2 {

        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");

                WebDriver driver = new ChromeDriver(chromeOptions);
                String uro="http://34.93.108.169:80";
                driver.get(uro);
                if (driver.findElement(By.id("nib1")).getText()
                                .equals("Congrats Nibbu Connected to MySQL successfully!")) {
                        System.out.println("TEST PASSED WOHOOOO!!!");
                        Thread.sleep(5000);
                        driver.close();
                } else {
                        System.out.println("Test Failed Nibba");
                        Thread.sleep(7000);
                        driver.quit();
                }
        }
}
