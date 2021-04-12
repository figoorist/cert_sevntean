package ru.comp;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ru.stqa.selenium.factory.WebDriverPool;

/**
 * Base class for TestNG-based test classes
 */
public class TestNgTestBase {

  protected static String baseUrl;

  @BeforeSuite
  public void initTestSuite() throws IOException {
    SuiteConfiguration config = new SuiteConfiguration();
    System.setProperty("webdriver.chrome.driver", config.getProperty("driverPath"));
    baseUrl = config.getProperty("site.url");
  }
}
