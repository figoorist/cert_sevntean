package ru.comp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {
  @FindBy(how = How.TAG_NAME, using = "title")
  @CacheLookup
  public WebElement title;
}
