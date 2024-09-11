package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    private static ExtentReports extent;
    private static String reportFileName = "Test-Automation-Report.html";
    private static String fileSeparator = System.getProperty("file.separator");
    private static String reportFilepath = System.getProperty("user.dir") + fileSeparator + "test-output";
    private static String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    private static String reportFileLocation = reportFilepath + fileSeparator + getReportFileName();

    public static ExtentReports getInstance() {
        if (extent == null)
            createInstance();
        return extent;
    }

    // Create an extent report instance
    public static ExtentReports createInstance() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFileLocation);
        sparkReporter.config().setDocumentTitle(getReportTitle());
        sparkReporter.config().setReportName(getReportTitle());
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        return extent;
    }

    private static String getReportFileName() {
        return "Pokerbet Desktop Smoke Automation Report_" + timestamp + ".html";
    }

    private static String getReportTitle() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
        return "Pokerbet Desktop Smoke Automation Report " + dateFormat.format(new Date());
    }
}