package br.com.rsinet.acao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.paginas.CorreiosPaginaPrincipal;

public class AcaoCorreiosPaginaPrincipal {

	CorreiosPaginaPrincipal corrPagPrinc;
	
	//para receber o driver utilizado
	private WebDriver driver;
	private WebDriverWait wait;
	
	public  AcaoCorreiosPaginaPrincipal(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
		this.corrPagPrinc = new CorreiosPaginaPrincipal();
	}
	
	public void acessaPaginaPrincipal() {
		driver.get("http://www.correios.com.br/");
	}
	
	public void clicarEmCorreios() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagPrinc.getLogoCorreios()));
		driver.findElement(corrPagPrinc.getLogoCorreios()).click(); 
	}
	
	public void clicarEncomendasLog() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagPrinc.getEncomendasLog()));
		driver.findElement(corrPagPrinc.getEncomendasLog()).click(); 
	}
	
	public void clicarCorresMark() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagPrinc.getCorresMark()));
		driver.findElement(corrPagPrinc.getCorresMark()).click(); 
	}
	
	public void clicarSolucEmpres() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagPrinc.getSolucEmpres()));
		driver.findElement(corrPagPrinc.getSolucEmpres()).click(); 
	}
	
	public void clicarServFinanc() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagPrinc.getServFinanc()));
		driver.findElement(corrPagPrinc.getServFinanc()).click(); 
	}
	
	public void clicarLojaVirtual() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagPrinc.getLojaVirtual()));
		driver.findElement(corrPagPrinc.getLojaVirtual()).click(); 
	}
	
	public void clicarImprensa() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagPrinc.getImprensa()));
		driver.findElement(corrPagPrinc.getImprensa()).click(); 
	}
	
	public void clicarFerramentas() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagPrinc.getFerramentas()));
		driver.findElement(corrPagPrinc.getFerramentas()).click(); 
	}
	
	public void clicarDeAaZ() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagPrinc.getDeAaZ()));
		driver.findElement(corrPagPrinc.getDeAaZ()).click(); 
	}
	
	public void clicarBusca() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagPrinc.getBuscar()));
		driver.findElement(corrPagPrinc.getBuscar()).click(); 
	}
	
	
}
