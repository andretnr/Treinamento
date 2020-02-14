package Exec3;

//Armazenar Carros 
public class Carro extends Produto{
	
	String marca = "volkswagen";
	String modelo = "Gol Gti";
	int ano = 1990;
	String cor = "Vermelho";
	String motor = "AP 1.6 turbo";
	
	public void exibirCarro(){
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(ano);
		System.out.println(cor);
		System.out.println(motor);
		exibirTotal();

	
}
}
