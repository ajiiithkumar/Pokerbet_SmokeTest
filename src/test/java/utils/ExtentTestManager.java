package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ExtentTestManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();

    public static synchronized ExtentTest getTest() {
        return extentTestThreadLocal.get();
    }

    public static synchronized void setTest(ExtentTest extentTest) {
        extentTestThreadLocal.set(extentTest);
    }

    public static synchronized void removeTest() {
        extentTestThreadLocal.remove();
    }

    public static synchronized void logInfo(String message) {
        getTest().log(Status.INFO, message);
    }

    public static synchronized void logPass(String message, WebDriver driver) throws IOException {
        getTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotBase64(driver)).build());
    }

    public static synchronized void logFail(String message, WebDriver driver) throws IOException {
        getTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotBase64(driver)).build());
    }

    private static String getScreenshotBase64(WebDriver driver) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        return screenshot.getScreenshotAs(OutputType.BASE64);
    }
}