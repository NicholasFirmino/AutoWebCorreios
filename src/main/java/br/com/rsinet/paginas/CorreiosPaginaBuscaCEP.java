package br.com.rsinet.paginas;

import org.openqa.selenium.By;

public class CorreiosPaginaBuscaCEP {
	
	private final By logoCorreios = By.xpath("//*[@href='http://www.correios.com.br']");
	
	private final By buscaCEPEndereco = By.xpath("//*[@class='tituloimagem']");
	
	
	private final By inputEndereco = By.xpath("//*[@name='relaxation']");
	
	
	private final By inputTipoCEP = By.xpath("//*[@name='tipoCEP']");
	
	private final By localidade = By.xpath("//*[@value='LOG']");
	private final By cEPPromocional = By.xpath("//*[@value='PRO']");
	private final By caixaPostalComunitaria = By.xpath("//*[@value='CPC']");
	private final By grandeUsuario = By.xpath("//*[@value='GRU']");
	private final By unidadeOperacional = By.xpath("//*[@value='UOP']");
	private final By todos = By.xpath("//*[@value='all']");
	
	
	private final By opcoes = By.xpath("//*[@href=\"javascript: sHL('PreferenciaCEP')\"]"); //*[@href="javascript: sHL('PreferenciaCEP')"]
	private final By opcoesN = By.xpath("//*[@name='semelhante'][@value='N']");
	private final By opcoesS = By.xpath("//*[@name='semelhante'][@value='S']");
	
	
	private final By buscar = By.xpath("//*[@value='Buscar']");


	public By getLogoCorreios() {
		return logoCorreios;
	}


	public By getBuscaCEPEndereco() {
		return buscaCEPEndereco;
	}


	public By getInputEndereco() {
		return inputEndereco;
	}


	public By getInputTipoCEP() {
		return inputTipoCEP;
	}


	public By getLocalidade() {
		return localidade;
	}


	public By getcEPPromocional() {
		return cEPPromocional;
	}


	public By getCaixaPostalComunitaria() {
		return caixaPostalComunitaria;
	}


	public By getGrandeUsuario() {
		return grandeUsuario;
	}


	public By getUnidadeOperacional() {
		return unidadeOperacional;
	}


	public By getTodos() {
		return todos;
	}


	public By getOpcoes() {
		return opcoes;
	}


	public By getOpcoesN() {
		return opcoesN;
	}


	public By getOpcoesS() {
		return opcoesS;
	}


	public By getBuscar() {
		return buscar;
	}
	
	
	
}
