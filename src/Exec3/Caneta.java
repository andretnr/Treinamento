package exec3;

//Armazenar informa��es de Canetas
public class Caneta extends Produto{
	
	
	String cor = "preta";
	String formato = "cilindrica";
	String marca = "Bic";
	
	
	public void exibirCaneta(){
		System.out.println(cor);
		System.out.println(formato);
		System.out.println(marca);
		
		exibirTotal();

}
}