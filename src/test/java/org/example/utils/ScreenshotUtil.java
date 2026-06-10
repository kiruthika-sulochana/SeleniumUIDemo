package org.example.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil extends DriverFactory{

    public static String captureScreenshot(WebDriver driver,
                                           String testName) {

        String timestamp =
                new SimpleDateFormat("yyyyMMdd_HHmmss")
                        .format(new Date());

        String fileName =
                testName + "_" + timestamp + ".png";

        String path =
                "/Users/kiruthika/Desktop/FailureScreenShots/"
                        + fileName;

        try {

            File src =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(src, new File(path));

        } catch (Exception e) {

            e.printStackTrace();
        }

        return path;
    }
}
