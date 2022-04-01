package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSel {
  @Test
  public void selenium_test01() {
	// TODO Auto-generated method stub
			String exePath = "./driver/chromedriver.exe"; //Seleccionamos la ruta de Chrome Driver
			System.setProperty("webdriver.chrome.driver", exePath); // Asignamos la popiedad con la ruta chrome driver
			
			WebDriver driver = new ChromeDriver();//obbjeto de WebDriver
			driver.get("https://www.google.com");
  }

}
