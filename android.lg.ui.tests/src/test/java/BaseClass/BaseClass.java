package BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public static WebDriverWait wait;
    public static AppiumDriver<MobileElement> driver;


    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android;");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");

//        cap.setCapability("autoAcceptAlerts", "true");
        cap.setCapability("appPackage", "com.ladygentleman.app");
        cap.setCapability("appActivity", "com.ladygentleman.app.view.AppActivity");
//        cap.setCapability("noReset","true");
        cap.setCapability("automationName", "UiAutomator2");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");


        driver = new AndroidDriver<>(url, cap);
        wait = new WebDriverWait(driver, 40);

        System.out.println("Приложение запущено");
        System.out.println();

    }


    @After
    public void tearDown() {
        driver.quit();
        System.out.println();
        System.out.println("Приложение закрыто");

    }
}