package Exec3;

//Armazenar informações de Canecas
public class Caneca extends Produto{
	
	String estampa = "naruto";
	String material = "porcelana";
	String medida = "4 metros";

	
	public void exibirCaneca(){
		System.out.println(estampa);
		System.out.println(material);
		System.out.println(medida);
		
		exibirTotal();

	}
	}
