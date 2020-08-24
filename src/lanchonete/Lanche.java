package lanchonete;

public abstract class Lanche {
	private double precoLanche;
	private double precoFrete;
	private double precoTotal;
	int tempo;
	private String nomeCliente;
	private String pedido;

	@Override
	public String toString() {
		return "Pedido: " + pedido + "\nValor: " + precoLanche +
				", Frete: " + precoFrete + "\nTotal R$" + precoTotal +
				" - Tempo de entrega: " + tempo 
				+ " minutos.\nAgradecemos a preferência." ;
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

	public double getPrecoLanche() {
		return precoLanche;
	}

	public void setPrecoLanche(double precoLanche) {
		this.precoLanche = precoLanche;
	}

	public double getPrecoFrete() {
		return precoFrete;
	}

	public void setPrecoFrete(double precoFrete) {
		this.precoFrete = precoFrete;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
}
