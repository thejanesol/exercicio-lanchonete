package lanchonete;

import java.util.Stack;

public class Sanduiche extends Lanche {
	private String ingredientes[] = new String[10];

	//Mostra somente os ingredientes escolhidos
	public String getIngredientes() {
		Stack <String> ingredientesEscolhidos = new Stack<>();
		for (int i = 1; i<ingredientes.length; i++) {
			if (ingredientes[i] != null) {
				ingredientesEscolhidos.push(ingredientes[i]);
			}
		}
		return "ingredientes escolhidos = " + ingredientesEscolhidos;
	}

	public void setIngredientes(String ingredientes[]) {
		this.ingredientes = ingredientes;
	}
	
	public int tempoDeEntrega (int distancia) {
		super.tempo = super.tempoDeEntrega(distancia) + 15;
		return tempo;
	}
	

}
