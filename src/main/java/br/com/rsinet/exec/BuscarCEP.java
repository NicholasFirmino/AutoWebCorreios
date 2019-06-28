package br.com.rsinet.exec;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.acao.AcaoCorreiosPaginaBuscaCEPEndereco;
import br.com.rsinet.acao.AcaoCorreiosPaginaFerramentas;
import br.com.rsinet.acao.AcaoCorreiosPaginaPrincipal;
import br.com.rsinet.acao.AcaoCorreiosPaginaResultadoBuscaCEPEndereco;
import br.com.rsinet.acao.AcaoExtra;

public class BuscarCEP {

	public BuscarCEP(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebDriver driver;
	
	AcaoCorreiosPaginaBuscaCEPEndereco acaoCorrPagBuscCep;
	
	public void buscarPor(String cep) {
		AcaoCorreiosPaginaPrincipal acaoCorrPagPrincipal = new AcaoCorreiosPaginaPrincipal(this.driver);
		AcaoCorreiosPaginaFerramentas acaoCorrPagFerr = new AcaoCorreiosPaginaFerramentas(this.driver);
		AcaoCorreiosPaginaBuscaCEPEndereco acaoCorrPagBuscCep = new AcaoCorreiosPaginaBuscaCEPEndereco(this.driver);
		AcaoCorreiosPaginaResultadoBuscaCEPEndereco acaoCorrPagResBuscCEP = new AcaoCorreiosPaginaResultadoBuscaCEPEndereco(this.driver);
		AcaoExtra acaoExt = new AcaoExtra();
		
		acaoCorrPagPrincipal.acessaPaginaPrincipal();
			acaoExt.espera(1000);
		acaoCorrPagPrincipal.clicarFerramentas();
			acaoExt.espera(1000);
		acaoCorrPagFerr.clicarBuscaCEP();
			acaoExt.espera(1000);
		acaoCorrPagBuscCep.digitarEnderecoOuCEP(cep);
			acaoExt.espera(1000);
		acaoCorrPagBuscCep.clicarBuscar();
			acaoExt.espera(5000);
		acaoCorrPagResBuscCEP.clicarEmCorreios();
			acaoExt.espera(1000);
	}
}
