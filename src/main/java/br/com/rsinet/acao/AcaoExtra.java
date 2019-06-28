package br.com.rsinet.acao;

public class AcaoExtra {

	public AcaoExtra() {
		
	}
	
	public void espera(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
