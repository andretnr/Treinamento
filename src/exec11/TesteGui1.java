package exec11;

import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui1 {

	// variaveis de referencia

	private static JFrame janela;
	private static JButton botao;

	public static void main(String[] args) {

		// criar uma nova tela(intancia)
		janela = new JFrame("Eaew boca aberta");

		// criar um botao
		botao = new JButton("Feche a boca aqui");

		// adicionar o botao ao painel da janela
		janela.getContentPane().add(botao);

		// configurar o tamanho do frame
		janela.setSize(300, 300);
		

		// configurar a visibilidade da tela (true / false)
		janela.setVisible(true);

		// Informar que a tela não tem layout pre definido
		janela.getContentPane().setLayout(null);

	}

}
