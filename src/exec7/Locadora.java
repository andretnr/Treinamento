package exec7;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Locadora {

	private static final Component ordenarCarros = null;
	/**
	 * @Locadora
	 * @author atnunes
	 * @since 13/02/2020 Version 0.1
	 * 
	 */

	static Carro vCarro[];

	public Locadora() {
		processar();

	}

	public void processar() {
		escolha();
	}

	public void escolha() {
		boolean repete = true;
		while (repete) {

			try {

				int opcao = Integer.parseInt(JOptionPane.showInputDialog(
						"1 - Seleciona pelo Modelo \n 2 - Seleciona pela Velocidade \n 3 - Seleciona por Combustivel \n 4 - Seleciona pela Cor \n 5 - Listar todos carros \n 6 - Comprar Carro \n9 - Encerrar"));

				switch (opcao) {
				case 1:
					buscarModelo();
					break;
				case 2:
					buscarVelocidade();
					break;
				case 3:
					buscarCombustivel();
					break;
				case 4:
					buscarCor();
					break;
				case 5:
					listarTudo();
					break;
				case 6:
					comprarCarro();
					break;
				case 9:
					repete = false;
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opcao Inválida");
					break;

				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digitou errado amiguinho");
//			processar();

			}
		}
//		if (opcao == 1) {
//			buscarModelo();
//
//		} else if (opcao == 2) {
//			buscarVelocidade();
//
//		} else if (opcao == 3) {
//			buscarCombustivel();
//
//		} else if (opcao == 4) {
//			listarTudo();
//
//		} else {
//			JOptionPane.showMessageDialog(null, "Opcao Inválida");
//		}
	}

	public void buscarModelo() {
		boolean encontrou = false;
		String mensagem = "";
		String modelo = JOptionPane.showInputDialog("Informe o modelo:").toUpperCase();
		for (int i = 0; i < vCarro.length; i++) {
			if (vCarro[i].modeloCarro.equals(modelo)) {
				mensagem = mensagem + ("\nModelo do carro: " + vCarro[i].modeloCarro);
				mensagem = mensagem + ("\nCor do Carro   : " + vCarro[i].cor);
				mensagem = mensagem + ("\nPlaca do Carro : " + vCarro[i].placaCarro);
				mensagem = mensagem + ("\nVelocidade Max : " + vCarro[i].velocidadeMax);
				mensagem = mensagem + ("\nCombustivel    : " + vCarro[i].combustivel);
				mensagem = mensagem + ("\nValor do Carro : " + vCarro[i].valor);

				encontrou = true;

			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não possuimos esse modelo!");
		} else {
			JOptionPane.showMessageDialog(null, mensagem);
		}

	}

	public void buscarVelocidade() {
		boolean encontrou = false;
		String mensagem = "";
		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o velocidade:").toUpperCase());
		for (int i = 0; i < vCarro.length; i++) {
			if (vCarro[i].velocidadeMax == velocidade) {
				mensagem = mensagem + ("\n\nModelo do carro: " + vCarro[i].modeloCarro);
				mensagem = mensagem + ("\nCor do Carro   : " + vCarro[i].cor);
				mensagem = mensagem + ("\nPlaca do Carro : " + vCarro[i].placaCarro);
				mensagem = mensagem + ("\nVelocidade Max : " + vCarro[i].velocidadeMax);
				mensagem = mensagem + ("\nCombustivel    : " + vCarro[i].combustivel);
				mensagem = mensagem + ("\nValor do Carro : " + vCarro[i].valor);
				encontrou = true;
			}

		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não temos carros com essa velocidade max!");
		} else {
			JOptionPane.showMessageDialog(null, mensagem);
		}

	}

	public void buscarCombustivel() {
		boolean encontrou = false;
		String mensagem = "";
		String combustivel = JOptionPane.showInputDialog("Informe o Combustivel:").toUpperCase();
		for (int i = 0; i < vCarro.length; i++) {
			if (vCarro[i].combustivel.equals(combustivel)) {
				mensagem = mensagem + ("\nModelo do carro: " + vCarro[i].modeloCarro);
				mensagem = mensagem + ("Cor do Carro   : " + vCarro[i].cor);
				mensagem = mensagem + ("Placa do Carro : " + vCarro[i].placaCarro);
				mensagem = mensagem + ("Velocidade Max : " + vCarro[i].velocidadeMax);
				mensagem = mensagem + ("Combustivel    : " + vCarro[i].combustivel);
				mensagem = mensagem + ("Valor do Carro : " + vCarro[i].valor);
				encontrou = true;
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não temos carros movidos com esse combustivel!");
		} else {
			JOptionPane.showMessageDialog(null, mensagem);
		}

	}

	public void buscarCor() {
		boolean encontrou = false;
		String mensagem = "";
		String cor = JOptionPane.showInputDialog("Informe a Cor:").toUpperCase();
		for (int i = 0; i < vCarro.length; i++) {
			if (vCarro[i].cor.equals(cor)) {
				mensagem = mensagem + ("\nModelo do carro  : " + vCarro[i].modeloCarro);
				mensagem = mensagem + ("\nCor do Carro     : " + vCarro[i].cor);
				mensagem = mensagem + ("\nPlaca do Carro   : " + vCarro[i].placaCarro);
				mensagem = mensagem + ("\nVelocidade Max   : " + vCarro[i].velocidadeMax);
				mensagem = mensagem + ("\nCombustivel      : " + vCarro[i].combustivel);
				mensagem = mensagem + ("\n\nValor do Carro : " + vCarro[i].valor);
				encontrou = true;

			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não possuimos esse modelo!");
		} else {
			JOptionPane.showMessageDialog(null, mensagem);
		}

	}

	public void listarTudo() {
		String mensagem = "";
		for (int i = 0; i < vCarro.length; i++) {
			mensagem = mensagem + ("\nModelo do carro " + vCarro[i].modeloCarro)
					+ ("Cor do Carro:     " + vCarro[i].cor) + ("Placa do Carro:   " + vCarro[i].placaCarro)
					+ ("Velocidade Max:   " + vCarro[i].velocidadeMax) + ("Combustivel:      " + vCarro[i].combustivel)
					+ ("Valor do Carro:   " + vCarro[i].valor);

		}
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public void ordenarCarros() {
		Carro reserva;

		for (int ct1 = 0; ct1 < vCarro.length; ct1++) {

			for (int ct2 = 0; ct2 < 9; ct2++) {

				if (vCarro[ct1].valor < vCarro[ct2].valor) {

				}
				reserva = vCarro[ct1];
				vCarro[ct1] = vCarro[ct2];
				vCarro[ct2] = reserva;

			}
		}

	}

	public void comprarCarro() {
		String model = JOptionPane.showInputDialog("Digite o modelo do carro que você deseja comprar?");
		String cor = JOptionPane.showInputDialog("Digite a cor do carro?");
		for (int i = 0; i < vCarro.length; i++) {
			if (vCarro[i].modeloCarro == model && vCarro[i].cor == cor) {

			}
		}

	}

	// for (int i = 0; i < vCarro.length; i++) {
//
	// System.out.println("\nModelo do carro: " + vCarro[i].modeloCarro);
	// System.out.println("Cor do Carro : " + vCarro[i].cor);
//			System.out.println("Placa do Carro : " + vCarro[i].placaCarro);
	// System.out.println("Velocidade Max : " + vCarro[i].velocidadeMax);
	// System.out.println("Combustivel : " + vCarro[i].combustivel);
//			System.out.println("Valor do Carro : " + vCarro[i].valor);
//

	// }

	public static void main(String[] args) {

		vCarro = new Carro[10];
		Carro carro1 = new Carro("FIESTA", "itb 2102", 250, "alcool", 15000, "Azul");
		vCarro[0] = carro1;
		Carro carro2 = new Carro("CAMARO", "hlm 3030", 300, "gasolina", 30000, "Amarelo");
		vCarro[1] = carro2;
		Carro carro3 = new Carro("PORSCHE", "yfl 0569", 400, "gasolina", 90000, "Verde");
		vCarro[2] = carro3;
		Carro carro4 = new Carro("DODGE", "xnx 1313", 200, "diesel", 120000, "Preto");
		vCarro[3] = carro4;
		Carro carro5 = new Carro("FERRARI", "emx 6660", 300, "gasolina", 150000, "Vermelha");
		vCarro[4] = carro5;
		Carro carro6 = new Carro("GOL", "spl 1515", 300, "alcool", 5000, "Branco");
		vCarro[5] = carro6;
		Carro carro7 = new Carro("CORSA", "hlm 1818", 150, "alcool", 5000, "Cinza");
		vCarro[6] = carro7;
		Carro carro8 = new Carro("FORD", "fxx 1234", 200, "diesel", 20000, "Roxo");
		vCarro[7] = carro8;
		Carro carro9 = new Carro("FOX", "hkl 3654", 150, "alcool", 10000, "Laranja");
		vCarro[8] = carro9;
		Carro carro10 = new Carro("PUMA", "jhy 1020", 250, "diesel", 15000, "Rosa");
		vCarro[9] = carro10;

		new Locadora();

	}
}
