package seleniumframework.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
        	 System.out.println("Extent Report Initialized");
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("reports/ExtentReport.html");
            sparkReporter.config().setDocumentTitle("Automation Report");
            sparkReporter.config().setReportName("GUI Elements Test Report");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
        }
        return extent;
    }
}

