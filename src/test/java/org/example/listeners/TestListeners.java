package org.example.listeners;

import org.example.utils.ScreenshotUtil;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestListeners implements ITestListener {

    private static final Map<String, Long> startTimes = new ConcurrentHashMap<>();

    @Override
    public void onTestStart(ITestResult result) {

        startTimes.put(
                result.getName(),
                System.currentTimeMillis());


        System.out.println("Started : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        long duration =
                System.currentTimeMillis()
                        - startTimes.get(result.getName());

        System.out.println(
                "PASSED : "
                        + result.getName()
                        + " Duration : "
                        + duration + " ms");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        WebDriver driver =
                (WebDriver) result.getTestContext()
                        .getAttribute("driver");

        String screenshotPath =
                ScreenshotUtil.captureScreenshot(
                        driver,
                        result.getName());

        System.out.println(
                "FAILED : "
                        + result.getName());

        System.out.println(
                "Screenshot : "
                        + screenshotPath);
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println("Skipped : " + result.getName());
    }
}
