package exec11;

import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class TesteGui8 {
	
	private JFrame janela;
	private JPanel painelDaJanela;
	private JLabel lblSenha;
	private JPasswordField jpwSenha;
	
	public void IniciaGui() {
		
		//criar as instancias
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		lblSenha = new JLabel();
		jpwSenha = new JPasswordField();
		
		//cfg Lbl
		lblSenha.setText("Senha:");
	lblSenha.setBounds(10, 40, 40, 20);
	
	//CFG campo
	jpwSenha.setBounds(60, 40, 100, 20);
	
	//cfg painel
	painelDaJanela.setLayout(null);
	painelDaJanela.add(lblSenha);
	painelDaJanela.add(jpwSenha);
	
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setSize(300, 300);
	janela.setVisible(true);
	
	
		
	}
	public static void main(String[] args) {
		new TesteGui8().IniciaGui();
	}

}
