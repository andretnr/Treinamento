package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteGui2 {

	public static void main(String[] args) {

		// Definir a tela e suas caracteristicas
		JFrame janela = new JFrame();
		janela.setTitle("Bom dia boca aberta!");
		janela.setSize(500, 200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);

		// definir o componente jbutton (bottao)
		JButton botao = new JButton();
		botao.setText("Feche a boca aqui");
		botao.setBounds(10, 10, 200, 20);

		// Definir o componente Jlabel de rotulo
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setBounds(10, 40, 40, 20);

		// definir o campo de texto jtextfield
		JTextField txtNome = new JTextField();
		txtNome.setBounds(50, 40, 400, 20);

		// adicionar componentes na tela

		janela.getContentPane().add(botao);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(txtNome);
		
		//Informar a visibilidade da tela
		janela.setVisible(true);

	}

}
