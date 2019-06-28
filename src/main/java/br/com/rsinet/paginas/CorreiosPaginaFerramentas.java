package br.com.rsinet.paginas;

import org.openqa.selenium.By;

public class CorreiosPaginaFerramentas {
	
	private final By logoCorreios = By.xpath("//*[@href='http://www.correios.com.br']");
	
	private final By SistemPortCorreio = By.xpath("//*[@class='tituloimagem']");
	
	private final By buscaCEP = By.xpath("//*[@src='home2014/img/homeSis/cep.png']");
	private final By rastrObj = By.xpath("//*[@src='home2014/img/homeSis/sro.png']");
	private final By precoPrazo = By.xpath("//*[@src='home2014/img/homeSis/precos.png']");
	private final By buscaAgencia = By.xpath("//*[@src='home2014/img/homeSis/agencias.png']");
	private final By maloteWeb = By.xpath("//*[@src='home2014/img/homeSis/malote.png']");
	private final By discColeta = By.xpath("//*[@src=\"home2014/img/homeSis/disque_coleta.png\"]");
	
	private final By correciosOn = By.xpath("//*[@src='home2014/img/homeSis/correios_online.png']");
	private final By enderecador = By.xpath("//*[@src='home2014/img/homeSis/enderecador.png']");
	private final By faturaEletronica = By.xpath("//*[@src='home2014/img/homeSis/fatura_eletronica.png']");
	private final By notaFiscalEletronica = By.xpath("//*[@src='home2014/img/homeSis/nfe.png']");
	private final By faleConosco = By.xpath("//*[@src='home2014/img/homeSis/fale_conosco.png]");
	private final By malaDiretaFacil = By.xpath("//*[@src='home2014/img/homeSis/icone-mala-direta-facl.png']");
	public By getLogoCorreios() {
		return logoCorreios;
	}
	public By getSistemPortCorreio() {
		return SistemPortCorreio;
	}
	public By getBuscaCEP() {
		return buscaCEP;
	}
	public By getRastrObj() {
		return rastrObj;
	}
	public By getPrecoPrazo() {
		return precoPrazo;
	}
	public By getBuscaAgencia() {
		return buscaAgencia;
	}
	public By getMaloteWeb() {
		return maloteWeb;
	}
	public By getDiscColeta() {
		return discColeta;
	}
	public By getCorreciosOn() {
		return correciosOn;
	}
	public By getEnderecador() {
		return enderecador;
	}
	public By getFaturaEletronica() {
		return faturaEletronica;
	}
	public By getNotaFiscalEletronica() {
		return notaFiscalEletronica;
	}
	public By getFaleConosco() {
		return faleConosco;
	}
	public By getMalaDiretaFacil() {
		return malaDiretaFacil;
	}
	
	
}
