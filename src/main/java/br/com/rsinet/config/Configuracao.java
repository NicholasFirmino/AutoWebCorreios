package br.com.rsinet.config;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuracao {
	
	private WebDriver driver;
	
	public Configuracao(WebDriver driver) {
		this.driver = driver;
	}
	

	public void inicializa() {
		try {
			System.setProperty("webdriver.chrome.driver", new File("./drivers/chromedriver.exe").getCanonicalPath() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void finaliza() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
