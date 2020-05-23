package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteGui5 {

	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCc;
	private JCheckBox cbDb;
	private JCheckBox cbBb;
	private JButton btnResposta;
	private JPanel painelDaJanela;

	public void iniciaGui() {

		// criar as instancias

		janela = new JFrame("Exemplo de Check Box");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCc = new JCheckBox();
		cbDb = new JCheckBox();
		cbBb = new JCheckBox();
		btnResposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// configurações da label
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento:");
		lblEscolha.setBounds(42, 15, 280, 18);

		// configuração do botão

		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta:");
		lblResposta.setBounds(42, 230, 300, 18);

		// configurações do botao
		btnResposta.setText("Verificar");
		btnResposta.setBounds(146, 196, 100, 28);

		// adicionar acao do botao
		btnResposta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				verificaSelecionado();
			}
		});

		// Adicionar componentes na tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(cbCc);
		painelDaJanela.add(cbDb);
		painelDaJanela.add(cbBb);
		painelDaJanela.add(btnResposta);
		painelDaJanela.add(lblResposta);

		// configurações do check box Cartão de Crédito
		cbCc.setText("Cartão de crédito");
		cbCc.setSelected(false);
		cbCc.setBounds(42, 124, 145, 24);

		// configurações do check box Deposito bancario
		cbDb.setText("Deposito bancario");
		cbDb.setSelected(false);
		cbDb.setBounds(42, 98, 145, 24);

		// configurações do check box Boleto bancario
		cbBb.setText("Boleto Bancario");
		cbBb.setSelected(false);
		cbBb.setBounds(42, 70, 157, 24);

		// configurações da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(390, 300);
		janela.setVisible(true);

	}// fim do metodo inicia GUI

	public void verificaSelecionado() {
		// Verificar qual radio button foi selecionado
		String resposta = "";
		if (cbCc.isSelected()) {
			resposta += (cbCc.getText() + " - ");
		}
		if (cbDb.isSelected()) {
			resposta += (cbDb.getText() + " - ");
		}
		if (cbBb.isSelected()) {
			resposta += (cbBb.getText() + " - ");

		}

		if (!resposta.equals("")) {
			lblResposta.setText(resposta);
			resposta = "";
		}
	}

	public static void main(String[] args) {
		new TesteGui5().iniciaGui();
	}

}
