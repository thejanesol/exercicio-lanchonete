package lanchonete;

public abstract class Massa extends Lanche {
	private String molho;
	private String tipoDeMassa;

	public String getTipoDeMassa() {
		return tipoDeMassa;
	}

	public void setTipoDeMassa(String tipoDeMassa) {
		this.tipoDeMassa = tipoDeMassa;
	}
	
	public int tempoDeEntrega (int distancia) {
		return super.tempoDeEntrega(distancia) + 30;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
}
