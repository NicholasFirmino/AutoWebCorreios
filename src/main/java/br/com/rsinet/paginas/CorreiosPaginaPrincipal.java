package br.com.rsinet.paginas;

import org.openqa.selenium.By;

public class CorreiosPaginaPrincipal {
	
	private final By logoCorreios = By.xpath("//*[@id='logo-header']");	//imagem logo correios
	
	private final By encomendasLog = By.xpath("//*[@href='http://www.correios.com.br/encomendas-logistica']");
	private final By corresMark = By.xpath("//*[@href='http://www.correios.com.br/correspondencia-marketing']");
	private final By solucEmpres = By.xpath("//*[@href='http://www.correios.com.br/solucoes-empresariais']");
	private final By servFinanc = By.xpath("//*[@href='http://www.correios.com.br/servicos-financeiros']");
	
	private final By lojaVirtual = By.xpath("//*[@id='web_store']");	//acessaloja virtual
	private final By imprensa = By.xpath("//*[@id='press_romm']");	//acessa imprensa
	private final By ferramentas = By.xpath("//*[@id='tools']");	//acesso ferramentas
	private final By deAaZ = By.xpath("//*[@id='a_to_z']");	//acesso de A a Z
	private final By buscar = By.xpath("//*[@id='search']");	//acesso buscar
	
	
	public By getLogoCorreios() {
		return logoCorreios;
	}
	public By getEncomendasLog() {
		return encomendasLog;
	}
	public By getCorresMark() {
		return corresMark;
	}
	public By getSolucEmpres() {
		return solucEmpres;
	}
	public By getServFinanc() {
		return servFinanc;
	}
	public By getLojaVirtual() {
		return lojaVirtual;
	}
	public By getImprensa() {
		return imprensa;
	}
	public By getFerramentas() {
		return ferramentas;
	}
	public By getDeAaZ() {
		return deAaZ;
	}
	public By getBuscar() {
		return buscar;
	}
	
	
}
