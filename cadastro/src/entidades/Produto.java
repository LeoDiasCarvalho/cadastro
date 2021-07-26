package entidades;

public class Produto {
	private String nome;
	private double preco;
	
	public Produto() {
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double desconto() {
		return preco -= preco * 2 / 100;
	}
	
	public double parcelado(int parcela) {
		double valor = 0.0;
		if(parcela > 10 || parcela <= 12) {
			valor = preco + preco * 10 / 100;
		}else if(parcela > 5 || parcela <= 10) {
			valor = preco + preco * 5 / 100;
		}else if(parcela > 3 || parcela <= 5) {
			valor = preco + preco * 3 / 100;
		}else if(parcela > 0 || parcela <= 3) {
			valor = preco;
		}else {
			System.out.println("Valor Inválido");
		}
		return valor;
	}
	
	public String toString() {
		return "Produto: " + nome +
				" Preço: $" + String.format("%.2f", preco);
	}
	
	
	
	
	
	
}
