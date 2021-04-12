package ru.comp;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * Loads test suite configuration from resource files.
 */
public class SuiteConfiguration {

  private static final String DEBUG_PROPERTIES = "/debug.properties";

  private Properties properties;

  public SuiteConfiguration() throws IOException {
  	this(System.getProperty("application.properties", DEBUG_PROPERTIES));
  }

  public SuiteConfiguration(String fromResource) throws IOException {
    properties = new Properties();
    properties.load(SuiteConfiguration.class.getResourceAsStream(fromResource));
  }

  public boolean hasProperty(String name) {
    return properties.containsKey(name);
  }

  public String getProperty(String name) {
    return properties.getProperty(name);
  }
}
