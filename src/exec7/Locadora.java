package exec7;

import javax.swing.JOptionPane;

public class Locadora {

	/**
	 * @Locadora
	 * @author atnunes
	 * @since 13/02/2020
	 * @Version 0.1
	 * 
	 */

	// metodo processamento

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
						"1 - Selecionar Carro pelo Modelo \n 2 - Selecionar Carro pela Velocidade \n 3 - Selecionar Carro por Combustivel \n 4 - Selecionar Carro pela Cor \n 5 - Listar todos Carros \n 6 - Comprar Carro \n 7 - Adicionar Carro \n 8 - Remover Carro \n 9 - Encerrar"));

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
				case 7:
					adicionarCarro();
					break;
				case 8:
					removerCarro();
					break;
				case 9:
					repete = false;
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opcao InvÃ¡lida");
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
//			JOptionPane.showMessageDialog(null, "Opcao InvÃ¡lida");
//		}
	}

	// Metodo adicionar carros

	private void adicionarCarro() {
		for (int i = 0; i < vCarro.length; i++) {
			if (vCarro[i] != null || vCarro[i].vetorDisponivel) {
				final Carro carro = new Carro(JOptionPane.showInputDialog("Insira o modelo do carro: ").toUpperCase(),
						JOptionPane.showInputDialog("insira a placa do carro ex. ABC 1234").toUpperCase().replace(" ",
								""),
						Integer.parseInt(
								JOptionPane.showInputDialog("insira a velocidade maxima do carro:").replace(" ", "")),
						JOptionPane.showInputDialog("insira o tipo de combustivel do carro").toUpperCase().replace(" ",
								""),
						Double.parseDouble(JOptionPane.showInputDialog("insira o valor do carro: ").replace(" ", "")),
						JOptionPane.showInputDialog("Insira a cor do carro : ").toUpperCase().replace(" ", ""), false,
						false);
				vCarro[i] = carro;
			}
			final String escolha = JOptionPane.showInputDialog("Inserir outro carro?").toUpperCase().replace(" ", "");
			if (!escolha.equals("SIM")) {
				break;
			}
		}

	}

	// Metodo buscar modelo

	public void buscarModelo() {
		boolean encontrou = false;
		String mensagem = "";
		String modelo = JOptionPane.showInputDialog("Informe o modelo:").toUpperCase();
		for (int i = 0; i < vCarro.length; i++) {

			if ((vCarro[i] == null) || (vCarro[i].vetorDisponivel)) {

			} else {
				if (vCarro[i].vendido || (vCarro[i].vetorDisponivel)) {

				} else {
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
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não possuimos esse modelo!");
		} else {
			JOptionPane.showMessageDialog(null, mensagem);
		}

	}

	// Metodo Buscar velocidade

	public void buscarVelocidade() {
		boolean encontrou = false;
		String mensagem = "";
		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o velocidade:").toUpperCase());
		for (int i = 0; i < vCarro.length; i++) {

			if ((vCarro[i] == null) || (vCarro[i].vetorDisponivel)) {

			} else {
				if (vCarro[i].vendido || (vCarro[i].vetorDisponivel)) {

				} else {
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
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não temos carros com essa velocidade max!");
		} else {
			JOptionPane.showMessageDialog(null, mensagem);
		}

	}

	// Metodo Buscar combustivel

	public void buscarCombustivel() {
		boolean encontrou = false;
		String mensagem = "";
		String combustivel = JOptionPane.showInputDialog("Informe o Combustivel:").toUpperCase();
		for (int i = 0; i < vCarro.length; i++) {

			if ((vCarro[i] == null) || (vCarro[i].vetorDisponivel)) {

			} else {
				if (vCarro[i].vendido || (vCarro[i].vetorDisponivel)) {

				} else {
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
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não temos carros movidos com esse combustivel!");
		} else {
			JOptionPane.showMessageDialog(null, mensagem);
		}

	}

	// Metodo Buscar cor

	public void buscarCor() {
		boolean encontrou = false;
		String mensagem = "";
		String cor = JOptionPane.showInputDialog("Informe a Cor:").toUpperCase();
		for (int i = 0; i < vCarro.length; i++) {

			if ((vCarro[i] == null) || (vCarro[i].vetorDisponivel)) {

			} else {
				if (vCarro[i].vendido || (vCarro[i].vetorDisponivel)) {

				} else {
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
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não possuimos esse modelo!");
		} else {
			JOptionPane.showMessageDialog(null, mensagem);
		}

	}

	// Metodo listar todos carros por ordem de valor

	public void listarTudo() {
		// ordenarCarros();
		String mensagem = "";
		ordenarCarros();
		for (int i = 0; i < vCarro.length; i++) {

			if ((vCarro[i] == null)) {

			} else {
				if (vCarro[i].vendido || (vCarro[i].vetorDisponivel)) {

				} else {

					mensagem = mensagem + ("\nModelo do carro " + vCarro[i].modeloCarro)
							+ (" Cor do Carro:     " + vCarro[i].cor) + (" Placa do Carro:   " + vCarro[i].placaCarro)
							+ (" Velocidade Max:   " + vCarro[i].velocidadeMax)
							+ (" Combustivel:      " + vCarro[i].combustivel)
							+ (" Valor do Carro:   " + vCarro[i].valor);

				}

			}
		}
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public void ordenarCarros() {
		Carro reserva;
		for (int i = 0; i < vCarro.length; i++) {

			for (int j = 0; j < 9; j++) {

				if (vCarro[j].valor > vCarro[j + 1].valor) {
					reserva = vCarro[j];
					vCarro[j] = vCarro[j + 1];
					vCarro[j + 1] = reserva;

				}

			}
		}

	}

	// Metodo Comprar carro

	public void comprarCarro() {
		boolean encontrou = false;
		String mensagem = "";
		String model = JOptionPane.showInputDialog("Digite o modelo do carro que você deseja comprar?").toUpperCase();
		String cor = JOptionPane.showInputDialog("Digite a cor do carro?").toUpperCase();
		for (int i = 0; i < vCarro.length; i++) {

			if ((vCarro[i] == null)) {

			} else {
				if (vCarro[i].vendido || (vCarro[i].vetorDisponivel)) {

				} else {
					if (vCarro[i].modeloCarro.equals(model) && vCarro[i].cor.equals(cor)) {

						mensagem = mensagem + "Carro nÂ°" + i + ("\nModelo do carro  : " + vCarro[i].modeloCarro);
						mensagem = mensagem + ("\nCor do Carro     : " + vCarro[i].cor);
						mensagem = mensagem + ("\nPlaca do Carro   : " + vCarro[i].placaCarro);
						mensagem = mensagem + ("\nVelocidade Max   : " + vCarro[i].velocidadeMax);
						mensagem = mensagem + ("\nCombustivel      : " + vCarro[i].combustivel);
						mensagem = mensagem + ("\n\nValor do Carro : " + vCarro[i].valor);
						encontrou = true;

					}
				}
			}
		}
		mensagem = mensagem + "\n\nDigite o numero do carro desejado:";

		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "ERRO MALDITO");
		} else {
			int resposta = Integer.parseInt(JOptionPane.showInputDialog(null, mensagem).replace(" ", ""));

			try {

				int sim = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Deseja comprar esse carro? \n 1 - Sim \n 2 - NÃ£o"));
				switch (sim) {
				case 1:
					double dinheiro = Double
							.parseDouble(JOptionPane.showInputDialog(null, "quanto você pretende pagar?"));
					if (dinheiro < vCarro[resposta].valor) {
						JOptionPane.showMessageDialog(null, "Dinheiro insuficiente!");

					}
					if (dinheiro == vCarro[resposta].valor) {
						JOptionPane.showMessageDialog(null, "Parabens vc adquiriu o: " + vCarro[resposta].modeloCarro);
					}
					if (dinheiro > vCarro[resposta].valor) {
						JOptionPane.showMessageDialog(null, "Parabens vc adquiriu o: " + vCarro[resposta].modeloCarro);
						double troco = dinheiro - vCarro[resposta].valor;
						JOptionPane.showMessageDialog(null, "Receba seu troco: " + troco);
						// vendido();
						vCarro[resposta].vetorDisponivel = true;
						vCarro[resposta].vendido = true;
					}

					break;
				case 2:
					comprarCarro();
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digitou errado amiguinho");
			}
		}

	}

	// Metodo Vendido "incompleto"

	public void removerCarro() {
		String placa=JOptionPane.showInputDialog("digite a placa do carro").toUpperCase().replace(" ",
				"");
		
		for(int i=0;i<vCarro.length;i++) {
			if ((vCarro[i] == null)) {

			} else {
				if (vCarro[i].vendido || (vCarro[i].vetorDisponivel)) {

				} else {
					
				}
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

	// Metodo Main

	public static void main(String[] args) {

		vCarro = new Carro[20];
		Carro carro1 = new Carro("FIESTA", "ITB 2018", 250, "ALCOOL", 15000, "AZUL", false, false);
		vCarro[0] = carro1;
		Carro carro2 = new Carro("CAMARO", "HLM 3030", 300, "GASOLINA", 120000, "AMARELO", false, false);
		vCarro[1] = carro2;
		Carro carro3 = new Carro("PORSCHE", "YFL 3456", 400, "GASOLINA", 150000, "VERDE", false, false);
		vCarro[2] = carro3;
		Carro carro4 = new Carro("DODGE", "XNX 6666", 200, "DIESEL", 90000, "PRETO", false, false);
		vCarro[3] = carro4;
		Carro carro5 = new Carro("FERRARI", "EMX 6660", 300, "GASOLINA", 200000, "VERMELHA", false, false);
		vCarro[4] = carro5;
		Carro carro6 = new Carro("GOL", "SPL 1515", 300, "ALCOOL", 30000, "BRANCO", false, false);
		vCarro[5] = carro6;
		Carro carro7 = new Carro("CORSA", "HLM 1818", 150, "ALCOOL", 25000, "CINZA", false, false);
		vCarro[6] = carro7;
		Carro carro8 = new Carro("FORD", "FXX 1234", 200, "DIESEL", 50000, "ROXO", false, false);
		vCarro[7] = carro8;
		Carro carro9 = new Carro("FOX", "HKL 3654", 150, "ALCOOL", 23000, "LARANJA", false, false);
		vCarro[8] = carro9;
		Carro carro10 = new Carro("PUMA", "JHY 1020", 250, "DIESEL", 10000, "ROSA", false, false);
		vCarro[9] = carro10;
		for (int i = 10; i < 20; i++) {
			if (vCarro[i] == null)
				;

		}

		new Locadora();

	}
}