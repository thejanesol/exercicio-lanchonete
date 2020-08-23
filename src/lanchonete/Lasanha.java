package lanchonete;

import java.util.ArrayList;

public class Lasanha extends Massa {
	private ArrayList <String> tipoDeLasanha= new ArrayList <> ();

	public String getTipoDeLasanha() {
		String lasanhaMontada = "";
		for (int i = 0; i<tipoDeLasanha.size(); i++) {
			lasanhaMontada += tipoDeLasanha.get(i) + " ";
		}
		return lasanhaMontada;
	}

	public void setTipoDeLasanha(ArrayList <String> tipoDeLasanha) {

		this.tipoDeLasanha = tipoDeLasanha;
	}

}
