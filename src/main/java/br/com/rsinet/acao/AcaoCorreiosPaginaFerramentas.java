package br.com.rsinet.acao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.paginas.CorreiosPaginaFerramentas;

public class AcaoCorreiosPaginaFerramentas {
	CorreiosPaginaFerramentas corrPagFerr;
	
	//para receber o driver utilizado
	private WebDriver driver;
	private WebDriverWait wait;
	
	public AcaoCorreiosPaginaFerramentas(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
		this.corrPagFerr = new CorreiosPaginaFerramentas();
	}
	
	public void acessaPaginaFerramentas() {
		driver.get("http://www2.correios.com.br/default.cfm");
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	
	public void clicarEmCorreios() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getLogoCorreios()));
		driver.findElement(corrPagFerr.getLogoCorreios()).click(); 
	}
	
	public void clicarSistemas() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getSistemPortCorreio()));
		driver.findElement(corrPagFerr.getSistemPortCorreio()).click(); 
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	
	public void clicarBuscaCEP() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getBuscaCEP()));
		driver.findElement(corrPagFerr.getBuscaCEP()).click(); 
	}
	
	public void clicarRastrObj() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getRastrObj()));
		driver.findElement(corrPagFerr.getRastrObj()).click(); 
	}
	
	public void clicarPrecoPrazo() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getPrecoPrazo()));
		driver.findElement(corrPagFerr.getPrecoPrazo()).click(); 
	}
	
	public void clicarBuscaAgencia() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getBuscaAgencia()));
		driver.findElement(corrPagFerr.getBuscaAgencia()).click(); 
	}
	
	public void clicarMaloteWeb() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getMaloteWeb()));
		driver.findElement(corrPagFerr.getMaloteWeb()).click(); 
	}
	
	public void clicarDiscColeta() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getDiscColeta()));
		driver.findElement(corrPagFerr.getDiscColeta()).click(); 
	}
	
	
	//------------------------------------------------------------------------------------------------------------------------------------
	
	public void clicarCorreiosOn(){
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getCorreciosOn()));
		driver.findElement(corrPagFerr.getCorreciosOn()).click(); 
	}
	
	public void clicarEndercador() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getEnderecador()));
		driver.findElement(corrPagFerr.getEnderecador()).click(); 
	}
	
	public void clicarFaturaEletronica() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getFaturaEletronica()));
		driver.findElement(corrPagFerr.getFaturaEletronica()).click(); 
	}
	
	public void clicarNotaFiscalEletronica() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getNotaFiscalEletronica()));
		driver.findElement(corrPagFerr.getNotaFiscalEletronica()).click(); 
	}
	
	public void clicarFaleConosco() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getFaleConosco()));
		driver.findElement(corrPagFerr.getFaleConosco()).click(); 
	}
	
	public void clicarMalaDiretaFacil() {
		wait.until(ExpectedConditions.elementToBeClickable(corrPagFerr.getMalaDiretaFacil()));
		driver.findElement(corrPagFerr.getMalaDiretaFacil()).click(); 
	}
	
	
}
