package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual produto deseja cadastar: ");
		String nome = sc.nextLine();
		System.out.print("Qual o preço: ");
		double preco = sc.nextDouble();
		
		Produto novo = new Produto(nome, preco);
		
		System.out.println();
		System.out.println(novo);
		System.out.println();
		System.out.println("Como gostaria de pagar (avista/parcelado): ");
		char resp = sc.next().charAt(0);
		
		if(resp == 'a') {
			novo.desconto();
		}else if(resp == 'p') {
			System.out.println();
			System.out.print("Quantas parcelas: ");
			int parcela = sc.nextInt();
			novo.parcelado(parcela);
		}
		
		sc.close();
	}

}
