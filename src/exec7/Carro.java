package exec7;


import javax.swing.JOptionPane;



public class Carro {

	/**
	 * @Carro
	 * @author atnunes
	 * @since 13/02/2020
	 * @Version 0.1
	 */

	// Atributos

	String modeloCarro;
	String placaCarro;
	int velocidadeMax;
	String combustivel;
	double valor;
	String cor;

	boolean vendido = false;
	public boolean vetorDisponivel;
	
	//Metodo contrutor

	public Carro(String modeloCarro, String placaCarro, int velocidadeMax, String combustivel, double valor, String cor,
			boolean vendido, boolean vetorDisponivel) {
		super();
		this.modeloCarro = modeloCarro;
		this.placaCarro = placaCarro;
		this.velocidadeMax = velocidadeMax;
		this.combustivel = combustivel;
		this.valor = valor;
		this.cor = cor;
		this.vendido = vendido;
		this.vetorDisponivel = vetorDisponivel;
	}
	}

