package helperclass;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

    private static WebDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 10;
    private static final String SCREENSHOT_FOLDER = "./screenshots/";

    private HelperClass() {
    	WebDriverManager.chromedriver().setup();
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DTPL\\Music\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("user-agent=...");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            setUpDriver();
        }
        return driver;
    }

    public static void setUpDriver() {
        if (driver == null) {
            new HelperClass();
        }
    }

    public static String getScreenshot(String imageName) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filePath = SCREENSHOT_FOLDER + imageName;
        FileHandler.copy(screenshot, new File(filePath));
        return filePath;
    }

    public static String getScreenshotBase64(String screenshotName) throws IOException {
        String screenshotPath = getScreenshot(screenshotName);
        String base64Img = convertImgBase64(screenshotPath);
        String screenshotLink = "<a href='file://" + screenshotPath + "' target='_blank'>Click here to view screenshot</a>";
        return base64Img + "<br>" + screenshotLink;
    }

    public static String convertImgBase64(String screenshotPath) throws IOException {
        byte[] fileContent = FileUtils.readFileToByteArray(new File(screenshotPath));
        String base64Img = Base64.encodeBase64String(fileContent);
        return "<a href='file://" + screenshotPath + "' target='_blank'>Click here to view screenshot</a><br><img src='data:image/png;base64, " + base64Img + "' />";
    }
    
    
//    public static void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
 //  }
}