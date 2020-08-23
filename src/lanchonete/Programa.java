package lanchonete;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
			
		Lanche lanche;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		
		System.out.print("*Bem vindo(a) a lanchonete JavaLanches,"+nome+"!*\n"
		+ "Por gentileza, digite o código do lanche desejado:"
		+ "\n  [1]Sanduiche   [2]Bolo   [3]Massa");
		
		int codigo = 0;
		codigo = scan.nextInt();
		
		if (codigo == 1) {
			lanche = new Sanduiche();

			String ingrediente = "";
			int contador = 0;
			String ingredientes[] = new String[10];
			
			//Submenu sanduiche
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
			
			lanche.setPreco(15);
			lanche.setNomeCliente(nome);
			
			System.out.println("Qual a sua distância em km do JavaLanches?");
			int distancia = scan.nextInt();
			lanche.tempoDeEntrega(distancia);
			System.out.println("Lanche: Sanduiche\n" + ((Sanduiche) lanche).getIngredientes());
			System.out.println(lanche);
			
		} 
		
		else if (codigo == 2) {
			lanche = new Bolo();
			
			//Submenu bolo
			scan.nextLine();
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
			
			lanche.setPreco(10);
			lanche.setNomeCliente(nome);
			System.out.println("Lanche: Bolo\nMassa de " + ((Bolo) lanche).getMassa() 
			+ " - Cobertura: " + ((Bolo) lanche).getCobertura() + " - Recheio: " + 
					((Bolo) lanche).getRecheio());
			System.out.println(lanche);
			
		} 
		
		
		else if (codigo == 3) {
			lanche = new Massa();
			
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
			
			System.out.println("Lanche: " + ((Massa) lanche).getTipoDeMassa() 
					+ " com molho " + ((Massa) lanche).getMolho());
			lanche.setPreco(20);
			lanche.setNomeCliente(nome);			
			System.out.println(lanche);
		}
		
		
		else {
			System.out.println("Código inválido.");
		}
		
		scan.close();	
}
}
