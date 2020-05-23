package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TesteGui3 {

	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;

	public TesteGui3() {
		iniciaGui();

	}

	public void iniciaGui() {

		// Cria a janela instancia
		janela = new JFrame();

		// cria area de texto
		area = new JTextArea();

		// criar o primeiro botao
		botao1 = new JButton("Clique aqui");

		// adicionar o metodo desenvolvido na classe textolistener
		botao1.addActionListener(new textoListener());

		// cria o segundo botao
		botao2 = new JButton("Troca cor");
		botao2.addActionListener(new corListenner());

		// Cria um campo para digitar texto
		campo = new JTextField();

		// adicionar o metodo desenvolvido na classe textolistener
		campo.addActionListener(new textoListener());

		// Adicionar o botao ao painel
		janela.getContentPane().add(BorderLayout.EAST, botao2);

		janela.getContentPane().add(BorderLayout.SOUTH, botao1);

		// adicionar a area ao painel
		janela.getContentPane().add(BorderLayout.CENTER, area);

		// adicionar jtext field ao painel
		janela.getContentPane().add(BorderLayout.NORTH, campo);

		// configurar o tamanho da tela
		janela.setSize(300, 300);

		// configurar a visibilidade
		janela.setVisible(true);

	}

	public class textoListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			area.append(campo.getText() + "\n");
			campo.setText("");

		}

	}

	public class corListenner implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// Se o fundo da textarea for neutro troca para preto
			if (area.getBackground().equals(Color.BLACK)) {
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);

			} else {
				area.setBackground(Color.BLACK);
				area.setForeground(Color.YELLOW);

			}

		}

	}

	public static void main(String[] args) {
		new TesteGui3();

	}

}
