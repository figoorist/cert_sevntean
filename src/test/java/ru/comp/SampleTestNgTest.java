package ru.comp;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.comp.pages.HomePage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.driver;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = new HomePage();
  }

  @Test
  public void testHomePageHasAHeader() {
    open(baseUrl);
    Assert.assertFalse("".equals(homepage.title.getText()));
  }
}
