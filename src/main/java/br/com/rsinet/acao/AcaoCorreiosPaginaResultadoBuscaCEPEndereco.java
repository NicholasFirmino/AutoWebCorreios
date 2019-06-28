package br.com.rsinet.acao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.paginas.CorreiosPaginaResultadoBuscaCEPEndereco;

public class AcaoCorreiosPaginaResultadoBuscaCEPEndereco {
	
	CorreiosPaginaResultadoBuscaCEPEndereco corrPagResultBuscCEPEnd; 
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public  AcaoCorreiosPaginaResultadoBuscaCEPEndereco(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
		this.corrPagResultBuscCEPEnd = new CorreiosPaginaResultadoBuscaCEPEndereco();
	}
	
	public void acessaPaginaBuscaCEP() {
		driver.get("http://www.buscacep.correios.com.br/sistemas/buscacep/resultadoBuscaCepEndereco.cfm");
	}
	
	public void clicarEmCorreios() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagResultBuscCEPEnd.getLogoCorreios()));
		driver.findElement(corrPagResultBuscCEPEnd.getLogoCorreios()).click(); 
	}
}
