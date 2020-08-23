package lanchonete;

public class Pizza extends Massa {
	private String ingredientes[] = new String[5];

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

}
