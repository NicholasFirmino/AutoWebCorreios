package br.com.rsinet.paginas;

import org.openqa.selenium.By;

public class CorreiosPaginaResultadoBuscaCEPEndereco {
	private final By logoCorreios = By.xpath("//*[@href='http://www.correios.com.br']");	//imagem logo correios
	private final By resultadoPesquisa = By.xpath("//*[@width='55']");	//resultado de pesquisa
	
	public By getResultadoPesquisa() {
		return resultadoPesquisa;
	}

	public By getLogoCorreios() {
		return logoCorreios;
	}
}
