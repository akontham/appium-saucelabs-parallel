package com.pnt;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by srikanthvejendla on 2/26/17.
 */
public class SampleSauceTest {

//    DesiredCapabilities capabilities;
//    AppiumDriver driver;
//
//    @Before
//    public void setUp() throws Exception{
//        capabilities = new DesiredCapabilities();
//        capabilities.setCapability("appiumVersion", "1.5.3");
//        capabilities.setCapability("deviceName","Android Emulator");
//        capabilities.setCapability("deviceOrientation", "portrait");
//        capabilities.setCapability("browserName", "");
//        capabilities.setCapability("platformVersion","5.1");
//        capabilities.setCapability("platformName","Android");
//        capabilities.setCapability("app","sauce-storage:samsclub.apk");
//        capabilities.setCapability("appPackage","com.rfi.sams.android");
//        capabilities.setCapability("appActivity",".main.SplashActivity");
//
//        driver = new AndroidDriver(new URL("https://pntsauce:194d0d1d-2b85-4eda-8249-9bcb3eecb16b@ondemand.saucelabs.com:443/wd/hub"),capabilities);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//        //https://pntsauce:194d0d1d-2b85-4eda-8249-9bcb3eecb16b@ondemand.saucelabs.com:443/wd/hub
//        //http://pntsauce:194d0d1d-2b85-4eda-8249-9bcb3eecb16b@ondemand.saucelabs.com:80/wd/hub
//    }
//
//    @Test
//    public void sampleTest(){
//        driver.findElement(By.id("com.rfi.sams.android:id/sign_in_button")).click();
//        driver.findElement(By.id("com.rfi.sams.android:id/sign_in_username")).sendKeys("test@yahoo.com");
//        driver.findElement(By.id("com.rfi.sams.android:id/sign_in_password")).sendKeys("test123");
//        driver.findElement(By.id("com.rfi.sams.android:id/sign_in_button")).click();
//    }
//
//    @After
//    public void tearDown(){
//        driver.quit();
//    }

    // curl -u pntsauce:194d0d1d-2b85-4eda-8249-9bcb3eecb16b -X POST -H "Content-Type: application/octet-stream" https://saucelabs.com/rest/v1/storage/pntsauce/samsclub.apk?overwrite=true --data-binary @/Users/srikanthvejendla/Desktop/samsclub.apk

}
