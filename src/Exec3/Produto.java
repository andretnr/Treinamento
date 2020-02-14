package Exec3;

//Classificar produtos
public class Produto {

	/**
	 * Produto
	 * 
	 * @author atnunes
	 * @since 11/02/2020
	 * @version 0.1 teste
	 */
//Difinair variaveis
	public String nome;

	public int quantidade = 0;
	public double custo = 0;
	public int quantidadeVendida = 0;
	public double porcentoLucro = 0;

	public void exibirNome() {
		
		if (nome != null) {
			System.out.println(nome);
		}else{
		    System.out.println("O campo nome é nulo!");
				
			}
		
	}

	public void exibirValor() {
		if (custo > 0 && porcentoLucro > 0){ 
			System.out.println((custo*porcentoLucro)+custo);
	}else{ 
		System.out.println(" valor  inválido ");
		}
		
	}

	public void exibirLucro() {
		if (custo > 0 && porcentoLucro > 0){
		System.out.println(custo*porcentoLucro);
	}else{ 
		System.out.println("Valor inválido");
	}
	}

	public void exibirTotal() {
		// System.out.println((quantidadeVendida*custo)*porcentoLucro/100+quantidadeVendida);
		exibirNome();
		exibirValor();
		exibirLucro();
		
		
	}

}
