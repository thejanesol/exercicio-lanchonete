package lanchonete;

public class Massa extends Lanche {
	private String molho;
	private String tipoDeMassa;

	public String getTipoDeMassa() {
		return tipoDeMassa;
	}

	public void setTipoDeMassa(String tipoDeMassa) {
		this.tipoDeMassa = tipoDeMassa;
	}
	
	public int tempoDeEntrega (int distancia) {
		super.tempo = super.tempoDeEntrega(distancia) + 30;
		return tempo;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
}
