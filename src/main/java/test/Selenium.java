package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "./driver/chromedriver.exe"; //Seleccionamos la ruta de Chrome Driver
		System.setProperty("webdriver.chrome.driver", exePath); // Asignamos la popiedad con la ruta chrome driver
		
		WebDriver driver = new ChromeDriver();//obbjeto de WebDriver
		driver.get("https://www.google.com");

	}

}
