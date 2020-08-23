package lanchonete;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
			
		Lanche lanche;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("*Bem vindo(a) a lanchonete JavaLanches!*\n"
		+ "Por gentileza, digite o código do lanche desejado:"
		+ "\n  [1]Sanduiche   [2]Bolo   [3]Massa");
		
		int codigo = 0;
		codigo = scan.nextInt();
		
		if (codigo == 1) {
			lanche = new Sanduiche();
			menuSanduiche(lanche);
		} 
		
		else if (codigo == 2) {
			lanche = new Bolo();
			menuBolo(lanche);	
		} 
		
		else if (codigo == 3) {
			lanche = new Massa();
			menuMassa(lanche);
		}
		
		else {
			System.out.println("Código inválido.");
		}
		scan.close();
}
	
	static Scanner scan = new Scanner (System.in);
	
	public static void menuSanduiche (Lanche lanche) {
		String ingrediente = "";
		int contador = 0;
		String ingredientes[] = new String[10];
		
		System.out.println("Você escolheu sanduiche.\n*Tabela de valores*"
				+ "\n -Até 3 ingredientes: R$10\n -Até 5 ingredientes: R$15 "
				+ "\n -Mais de 5: R$20 ");
		System.out.println("Informe até 10 ingredientes "
				+ "para rechear seu sanduiche e digite 0 para finalizar.");
		while (contador < 10 && !ingrediente.equals("0")){
		ingrediente = scan.nextLine();
		if (!ingrediente.equals("0")) {
		ingredientes[contador] = ingrediente;
		contador ++;
		}
		}
		
		((Sanduiche) lanche).setIngredientes(ingredientes);
		
		if (contador <= 3) {
			lanche.setPrecoLanche(10);
		}
		else if (contador > 3 && contador <= 5) {
			lanche.setPrecoLanche(15);
		} else {
			lanche.setPrecoLanche(20);
		}
		
		System.out.println("Qual a sua distância em km do JavaLanches?");
		int distancia = scan.nextInt();
		lanche.tempoDeEntrega(distancia);
		
		if (distancia <= 10) {
			lanche.setPrecoFrete(5);
		} else {
			lanche.setPrecoFrete(10);
		}
		
		lanche.setPrecoTotal(lanche.getPrecoFrete() + lanche.getPrecoLanche());
		
		System.out.println("Pedido: sanduiche recheado com " + ((Sanduiche) lanche).getIngredientes());
		
		System.out.println(lanche);
		
	}
	
	public static void menuBolo (Lanche lanche) {
		System.out.println("Você escolheu bolo.");
		System.out.println("Escolha a massa: ");
		String massa = scan.nextLine();
		
		System.out.println("Escolha a cobertura: ");
		String cobertura = scan.nextLine();
		
		System.out.println("Escolha o recheio: ");
		String recheio = scan.nextLine();

		((Bolo) lanche).setMassa(massa);
		((Bolo) lanche).setCobertura(cobertura);
		((Bolo) lanche).setRecheio(recheio);
		
		System.out.println("Qual a sua distância em km do JavaLanches?");
		int distancia = scan.nextInt();
		lanche.tempoDeEntrega(distancia);
		
		lanche.setPrecoLanche(10); 
		
		if (distancia <= 10) {
			lanche.setPrecoFrete(5);
		} else {
			lanche.setPrecoFrete(10);
		}
		
		lanche.setPrecoTotal(lanche.getPrecoFrete() + lanche.getPrecoLanche());

		System.out.println("Lanche: Bolo\nMassa de " + ((Bolo) lanche).getMassa() 
		+ " - Cobertura: " + ((Bolo) lanche).getCobertura() + " - Recheio: " + 
				((Bolo) lanche).getRecheio());
		System.out.println(lanche);
	}
	
	
	public static void menuMassa (Lanche lanche) {
		System.out.println("massa");
		//Submenu massa
		System.out.println("Escolha o tipo de massa");
		System.out.println("[1]Pizza - [2]Macarrão - [3]Lasanha");
		int escolhaMassa = scan.nextInt();
		
		if (escolhaMassa == 1) {
			((Massa) lanche).setTipoDeMassa("Pizza");
			
		} 
		else if (escolhaMassa == 2) {
			((Massa) lanche).setTipoDeMassa("Macarrão");
			
		} 
		else if (escolhaMassa == 3){
			((Massa) lanche).setTipoDeMassa("Lasanha");
			
		} else {
			
		}
		
		scan.nextLine();
		
		System.out.println("Escolha seu molho: ");
		String molho = scan.nextLine();
		((Massa) lanche).setMolho(molho);
		
		
		System.out.println("Qual a sua distância em km do JavaLanches?");

		int distancia = scan.nextInt();
		lanche.tempoDeEntrega(distancia);
		
		if (distancia <= 10) {
			lanche.setPrecoFrete(5);
		} else {
			lanche.setPrecoFrete(10);
		}
		
		lanche.setPrecoTotal(lanche.getPrecoFrete() + lanche.getPrecoLanche());
		
		System.out.println("Lanche: " + ((Massa) lanche).getTipoDeMassa() 
				+ " com molho " + ((Massa) lanche).getMolho());
	
		System.out.println(lanche);
	}

}
