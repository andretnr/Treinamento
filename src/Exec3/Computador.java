package Exec3;

//Armazenar infomaçoes de Computadores
public class Computador extends Produto{

	String processador = "i7";
	String memoria = "direct";
	String tela = "4k";
	String harddisk = "tera";
	String placavideo = "gtx";
	
	public void exibirComputador(){
		System.out.println(processador);
		System.out.println(memoria);
		System.out.println(tela);
		System.out.println(harddisk);
		System.out.println(placavideo);
		exibirTotal();
		
		
	}
	
	
	
	
	
	
}
