package lanchonete;

public class Bolo extends Lanche{
	private String cobertura;
	private String massa;
	private String recheio;
	
	
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	public String getMassa() {
		return massa;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public int tempoDeEntrega (int distancia) {
		return super.tempoDeEntrega(distancia) + 30;
	}
}
