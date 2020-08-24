package lanchonete;

public class Sanduiche extends Lanche {
	private String ingredientes[] = new String[10];

	//Mostra somente os ingredientes escolhidos
	public String getIngredientes() {
		String ingredientesEscolhidos = "";
		for (int i = 0; i<ingredientes.length; i++) {
			if (ingredientes[i] != null) {
				ingredientesEscolhidos += ingredientes[i] + " ";
			}
		}
		return ingredientesEscolhidos;
	}

	public void setIngredientes(String ingredientes[]) {
		this.ingredientes = ingredientes;
	}
	
	public int tempoDeEntrega (int distancia) {
		super.tempo = super.tempoDeEntrega(distancia) + 15;
		return tempo;
	}
	

}
