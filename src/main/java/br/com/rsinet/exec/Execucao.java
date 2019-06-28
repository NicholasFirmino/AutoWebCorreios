package br.com.rsinet.exec;

import org.openqa.selenium.WebDriver;
import br.com.rsinet.config.Configuracao;


public class Execucao {
	
	static Configuracao config;
	private static WebDriver driver;
	static BuscarCEP buscarCEP;
	static BuscarEndereco buscarEndereco;
	
	public static void main(String[] args) {
		config = new Configuracao(driver);
		config.inicializa();
		{
			testes();
		}
		config.finaliza();
	}
	
	public static void testes() {
		instaciar();
		buscarCEP.buscarPor("avenida dos autonomistas");
		buscarEndereco.buscarPor("06160-180");
	}
	
	public static void instaciar() {
		buscarCEP = new BuscarCEP(config.getDriver());
		buscarEndereco = new BuscarEndereco	(config.getDriver());
	}
}
