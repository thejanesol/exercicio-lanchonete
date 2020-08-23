package lanchonete;

import java.util.ArrayList;
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
			menuMassa();
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

		System.out.println("Pedido: Bolo\nMassa: " + ((Bolo) lanche).getMassa() 
		+ " - Cobertura: " + ((Bolo) lanche).getCobertura() + " - Recheio: " + 
				((Bolo) lanche).getRecheio());
		System.out.println(lanche);
	}
	
	static Massa massa;
	public static void menuMassa () {
		
		System.out.println("Escolha o tipo de massa");
	
		System.out.println("[1]Pizza - [2]Macarrão - [3]Lasanha");
		int escolhaMassa = scan.nextInt();
		
		if (escolhaMassa == 1) {
			massa = new Pizza();
			pizza(massa);

		} 
		
		else if (escolhaMassa == 2) {
			massa = new Macarrao();
			macarrao(massa);		
		} 
		
		else if (escolhaMassa == 3){
			massa = new Lasanha();
			lasanha(massa);
			
		} else {
			System.out.println("Escolha inválida.");					
		}
		
		scan.nextLine();
		
		System.out.println("Escolha seu molho: ");
		String molho = scan.nextLine();
		((Massa) massa).setMolho(molho);
		
		System.out.println("Qual a sua distância em km do JavaLanches?");

		int distancia = scan.nextInt();
		massa.tempoDeEntrega(distancia);
		
		if (distancia <= 10) {
			massa.setPrecoFrete(5);
		} else {
			massa.setPrecoFrete(10);
		}
		
		massa.setPrecoTotal(massa.getPrecoFrete() + massa.getPrecoLanche());
		
		System.out.println(((Massa) massa).getTipoDeMassa() 
				+ " - molho " + ((Massa) massa).getMolho());
		System.out.println(massa);
	}
	
	public static void pizza (Massa massa) {
		System.out.println("Você escolheu pizza.");
		
		System.out.println("Escolha o tamanho da sua pizza: \n"
				+ "1- Pequena 2- Média 3- Grande");
		int tamanhoDaPizza = scan.nextInt();
		
		switch (tamanhoDaPizza) {
		case 1:
			massa.setPrecoLanche(25);
			break;
		case 2:
			massa.setPrecoLanche(35);
			break;
		case 3: 
			massa.setPrecoLanche(45);
			break;
		}
		
		String ingrediente = "";
		int contador = 0;
		String ingredientes[] = new String[5];
		System.out.println("Informe até 5 ingredientes "
				+ "para rechear sua pizza e digite 0 para finalizar.");
		while (contador < 5 && !ingrediente.equals("0")){
		ingrediente = scan.nextLine();
		if (!ingrediente.equals("0")) {
		ingredientes[contador] = ingrediente;
		contador ++;
		}
		}
		((Pizza) massa).setIngredientes(ingredientes);
		
		((Massa) massa).setTipoDeMassa("Pedido: Pizza \nIngredientes:" +
		((Pizza) massa).getIngredientes()); 
		
	}
	
	public static void macarrao(Massa massa) {
		System.out.println("Escolha seu tipo de macarrão:"
				+ "\n(1-Penne, 2-espaguete, 3-Fusili ou 4-Tagliatelle)");			
		int tipoDeMacarrao = scan.nextInt();
		String macarrao = "";
		switch (tipoDeMacarrao) {
		case 1:
			macarrao = "penne";
			break;
		case 2:
			macarrao = "espaguete";
			break;
		case 3: 
			macarrao = "fusili";
			break;
		case 4:
			macarrao = "tagliatelle";
			break;
		}
		
		System.out.println("Deseja adicionar um recheio por mais R$5?\n"
				+ "1- Sim  0- Não");
		String recheio = "";
		int adicionarRecheio = scan.nextInt();
		switch(adicionarRecheio) {
		case 1:
			System.out.println("Informe o recheio desejado: ");
			recheio += "com recheio de: " + scan.nextLine();
			massa.setPrecoLanche(20);
			break;
		case 0:
			massa.setPrecoLanche(15);
		} 
		
		((Massa) massa).setTipoDeMassa("Pedido: Macarrão " + macarrao + recheio);	
	}
	
	public static void lasanha(Massa massa) {
		ArrayList <String> montarLasanha= new ArrayList <> ();
		System.out.println("Escolha o tipo de massa (beringela, massa fresca,"
				+ " tradicional...)");	
		scan.nextLine();
		String massaLasanha = scan.nextLine();
		System.out.println("Escolha o tipo de recheio: ");
		String recheio = scan.nextLine();
		montarLasanha.add("massa " + massaLasanha);
		montarLasanha.add("com recheio de " + recheio);
		
		((Lasanha) massa).setTipoDeLasanha((montarLasanha));
		
		((Massa) massa).setTipoDeMassa("Pedido: Lasanha\n" 
		+ ((Lasanha) massa).getTipoDeLasanha());	
		
		System.out.println("Escolha o tamanho da sua lasanha: \n"
				+ "1- Pequena 2- Média 3- Grande");
		int tamanhoDaLasanha = scan.nextInt();
		
		switch (tamanhoDaLasanha) {
		case 1:
			massa.setPrecoLanche(28);
			break;
		case 2:
			massa.setPrecoLanche(38);
			break;
		case 3: 
			massa.setPrecoLanche(48);
			break;
		}
		
	}

}
