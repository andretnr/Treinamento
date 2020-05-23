package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import sun.applet.Main;
import sun.swing.SwingAccessor;

public class TesteGui4 {

	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDivorciado;
	private JButton btnVerificar;
	private JPanel painelDaJanela;
	private ButtonGroup grpRadio;

	public void IniciaGui() {

		// criar as instancias
		janela = new JFrame("Exemplo do Radio Button");
		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDivorciado = new JRadioButton();
		btnVerificar = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// cria objeto de grupo de botoes
		grpRadio = new ButtonGroup();

		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDivorciado);

		// configuraçôes da label
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("Selecione o estado civil:");
		lblEscolha.setBounds(82, 18, 230, 18);

		// configuração dos botôes
		rbtSolteiro.setText("Solteiro");
		rbtCasado.setText("Casado");
		rbtViuvo.setText("Viuvo");
		rbtDivorciado.setText("Divorciado");

		// configuraçôes do solteiro

		rbtSolteiro.setText("Solteiro");
		rbtSolteiro.setBounds(82, 50, 230, 18);

		// configuraçôes do casado

		rbtCasado.setText("Casado");
		rbtCasado.setBounds(82, 80, 230, 18);

		// configuraçôes do viuvo

		rbtViuvo.setText("Viuvo");
		rbtViuvo.setBounds(82, 110, 230, 18);

		// configuraçôes do divorciado

		rbtDivorciado.setText("Divorciado");
		rbtDivorciado.setBounds(82, 140, 230, 18);

		// configurações do botao
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(126, 176, 83, 23);

		// adicionar acao do botao
		btnVerificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				verificaSelecionado();
			}
		});

		// configurações do painel tela
		painelDaJanela.setLayout(null);
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(rbtSolteiro);
		painelDaJanela.add(rbtCasado);
		painelDaJanela.add(rbtViuvo);
		painelDaJanela.add(rbtDivorciado);
		painelDaJanela.add(btnVerificar);

		// configurações da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(340, 273);
		janela.setVisible(true);

	}// fim do metodo GUi
	
	public void verificaSelecionado() {
		// Verificar qual radio button foi selecionado
		String resposta = "";
		if (rbtSolteiro.isSelected()) {
			resposta += rbtSolteiro.getText();
		}
		if (rbtCasado.isSelected()) {
			resposta += rbtCasado.getText();
		}
		if (rbtViuvo.isSelected()) {
			resposta += rbtViuvo.getText();
		}
		if (rbtDivorciado.isSelected()) {
			resposta += rbtDivorciado.getText();
		}
		
		
		
		
		if (!resposta.equals("")) {
			// Trocar cor da fonte
		lblEscolha.setForeground(Color.BLUE);
		lblEscolha.setText(resposta);
		resposta = "";
	}
	}

	public static void main(String[] args) {
		new TesteGui4().IniciaGui();
	}

}
