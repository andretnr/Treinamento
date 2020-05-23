package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TesteGui11 {

	private JFrame janela;
	private JTabbedPane painelComAbas;
	private JPanel painelDaJanela;
	private JPanel primeiraAba;
	private JPanel segundaAba;
	private JPanel terceiraAba;

	public void iniciaGui() {

		janela = new JFrame("Exemplo de painel com abas");
		painelComAbas = new JTabbedPane();
		painelDaJanela = (JPanel) janela.getContentPane();
		primeiraAba = new JPanel();
		segundaAba = new JPanel();
		terceiraAba = new JPanel();

		painelComAbas.addTab("Aba 1", primeiraAba);
		painelComAbas.addTab("Aba 2", segundaAba);
		painelComAbas.addTab("Aba 3", terceiraAba);
		painelComAbas.setBounds(14, 21, 342, 200);

		// Insere texto na aba
		primeiraAba.add(new JLabel("Esta é a primeira ABA"));
		segundaAba.add(new JLabel("Esta é a segunda ABA"));
		terceiraAba.add(new JLabel("Esta é a terceira ABA"));

		// configuração do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelComAbas);

		// configurar janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		new TesteGui11().iniciaGui();
	}

}
