package lanchonete;

public abstract class Lanche {
	private double preco;
	int tempo;
	private String nomeCliente;
	int numeroPedido;

	@Override
	public String toString() {
		return "Pedido de " + nomeCliente  + 
				". Total R$" + preco + ", Tempo de entrega: " + tempo 
				+ " minutos.\nAgradecemos a preferência." ;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public int tempoDeEntrega (int distancia) {
		tempo = distancia * 10;
		return distancia * 10;
		
	}
	
}
