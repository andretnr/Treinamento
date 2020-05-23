package exec4;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;
import javafx.util.converter.PercentageStringConverter;
import java.util.Scanner;

public class AlugaFilme {

	/*
	 * @
	 */

	double alugueldiario;
	double valorpago;
	int diastotal;
	String filmes;
	boolean inception = true;
	boolean stolen = true;

	public AlugaFilme() {
		processar();
	}

	private void processar() {
		if (verifiqueDisponibilidade(escolhaFilme())) {
			JOptionPane.showInternalMessageDialog(null, "Esse filme está disponível!");
		//	verificarValor();
		} else {
			JOptionPane.showInternalMessageDialog(null, "esse filme não está disponível");
		}

	}

	public int escolhaFilme() {
		if (Integer
				.parseInt(JOptionPane.showInputDialog("Digite o numero do filme:\n 1 - Inception\n 2 - Stolen")) == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	public boolean verifiqueDisponibilidade(int filme) {
		if (filme == 1) {
			if (inception) {
				return true;
			}
			if (filme == 2) {
				if (stolen) {
					return true;
				}
			}
		}

		return false;
	}

//	public double verificarValor(int diastotal, double valorfilme, double valorcliente ) {
//		diastotal= Integer.parseInt(JOptionPane.showInputDialog(null,"Alugou o filme por quantos dias?" ));
//			valorcliente= Double.parseDouble(JOptionPane.showInputDialog(null,"Efetue o pagamento: "));v
//			verificarValor==valordiario*diastotal;
//			
//	}
	
//	public double valordiario () {
//		valordiario filme

	public static void main(String[] args) {
		new AlugaFilme();
	}

}

//}
