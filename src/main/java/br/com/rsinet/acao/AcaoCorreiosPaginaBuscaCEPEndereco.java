package br.com.rsinet.acao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.paginas.CorreiosPaginaBuscaCEP;

public class AcaoCorreiosPaginaBuscaCEPEndereco {

	CorreiosPaginaBuscaCEP corrPagBuscCEP;
	
	//para receber o driver utilizado
		private WebDriver driver;
		private WebDriverWait wait;
		
		public AcaoCorreiosPaginaBuscaCEPEndereco(WebDriver driver) {
			this.driver = driver;
			this.wait = new WebDriverWait(driver, 20);
			this.corrPagBuscCEP = new CorreiosPaginaBuscaCEP();
		}
		
		public void acessaPaginaBuscaCEP() {
			driver.get("http://www.buscacep.correios.com.br/sistemas/buscacep/");
		}
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		
		public void clicarEmCorreios() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getLogoCorreios()));
			driver.findElement(corrPagBuscCEP.getLogoCorreios()).click(); 
		}
		
		//----------------------------------------------------------------------------------------------------------------------------------
		
		public void digitarEnderecoOuCEP(String endCep) {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getInputEndereco()));
			driver.findElement(corrPagBuscCEP.getInputEndereco()).click(); 
			driver.findElement(corrPagBuscCEP.getInputEndereco()).sendKeys(endCep);
		}
		
		//----------------------------------------------------------------------------------------------------------------------------------
		
		public void clicarTipoCEP() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getInputTipoCEP()));
			driver.findElement(corrPagBuscCEP.getInputTipoCEP()).click(); 
		}
		
		public void selecionarLocalidade() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getLocalidade()));
			driver.findElement(corrPagBuscCEP.getLocalidade()).click(); 
		}
		public void selecionarCEPPromocional() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getcEPPromocional()));
			driver.findElement(corrPagBuscCEP.getcEPPromocional()).click(); 
		}
		public void selecionarCaixaPostalComunitaria() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getCaixaPostalComunitaria()));
			driver.findElement(corrPagBuscCEP.getCaixaPostalComunitaria()).click(); 
		}
		public void selecionarGrandeUsuario() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getGrandeUsuario()));
			driver.findElement(corrPagBuscCEP.getGrandeUsuario()).click(); 
		}
		public void selecionarUnidadeOperacional() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getUnidadeOperacional()));
			driver.findElement(corrPagBuscCEP.getUnidadeOperacional()).click(); 
		}
		public void selecionarTodos() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getTodos()));
			driver.findElement(corrPagBuscCEP.getTodos()).click(); 
		}
		
		//------------------------------------------------------------------------------------------------------------------------------------
		
		public void clicarOpcoes() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getOpcoes()));
			driver.findElement(corrPagBuscCEP.getOpcoes()).click(); 
		}
		
		public void clicarOpcoesN() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getOpcoesN()));
			driver.findElement(corrPagBuscCEP.getOpcoesN()).click(); 
		}
		public void clicarOpcoesS() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getOpcoesS()));
			driver.findElement(corrPagBuscCEP.getOpcoesS()).click(); 
		}
		
		//-------------------------------------------------------------------------------------------------------------------------------------
		
		public void clicarBuscar() {
			wait.until(ExpectedConditions.elementToBeClickable(corrPagBuscCEP.getBuscar()));
			driver.findElement(corrPagBuscCEP.getBuscar()).click(); 
		}
		
		
		
}
