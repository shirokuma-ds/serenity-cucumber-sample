package org.shirokuma.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class CustomDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
//        WebDriverManager.operadriver().setup();
//
//        return new OperaDriver();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("85.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        RemoteWebDriver driver = null;

        try {
            driver = new RemoteWebDriver(
                    URI.create("http://192.168.56.8:4444/wd/hub").toURL(),
                    capabilities
            );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
