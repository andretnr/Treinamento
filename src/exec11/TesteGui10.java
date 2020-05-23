package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TesteGui10 {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JTable tabela;
	private String[] colunas = new String[] { "uf", "estado" };
	private String[][] dados = new String[][] { { "SP", "São Paulo" }, { "RJ", "Rio de Janeiro" },
			{ "RN", "Rio Grande do Norte" }, { "PR", "Paraná" } };
	private JLabel lblIncluirUf;
	private JLabel lblIncluirEstado;
	private JTextField jtfIncluirUf;
	private JTextField jtfIcluirEstado;
	private JButton botaoIncluir;
	private JButton botaoExcluir;
	private JScrollPane painelDeScroll;

	public void iniciaGui() {

		// criar as instancias
		janela = new JFrame("Exemplo de Tabela");
		lblIncluirUf = new JLabel("Informe UF:");
		lblIncluirEstado = new JLabel("Informe estado:");
		jtfIncluirUf = new JTextField();
		jtfIcluirEstado = new JTextField();
		botaoIncluir = new JButton("Incluir");
		botaoExcluir = new JButton("Excluir");

		painelDaJanela = (JPanel) janela.getContentPane();

		// criar tabela
		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		tabela = new JTable(modelo);

		tabela.setEnabled(true);

		// instanciando e inserindo atributos
		painelDeScroll = new JScrollPane(tabela);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		painelDeScroll.setBounds(10, 100, 360, 95);
		tabela.setBounds(10, 30, 300, 95);
		botaoIncluir.setBounds(75, 200, 100, 50);
		botaoExcluir.setBounds(195, 200, 100, 50);
		lblIncluirUf.setBounds(15, 20, 70, 25);
		lblIncluirEstado.setBounds(15, 55, 120, 25);
		jtfIncluirUf.setBounds(110, 20, 50, 25);
		jtfIcluirEstado.setBounds(110, 55, 260, 25);

		// adiciona açoes ao botão
		botaoIncluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				adicionaLinha();

			}
		});

		// configurações de painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblIncluirUf);
		painelDaJanela.add(lblIncluirEstado);
		painelDaJanela.add(jtfIncluirUf);
		painelDaJanela.add(jtfIcluirEstado);
		painelDaJanela.add(painelDeScroll);
		painelDaJanela.add(botaoIncluir);
		painelDaJanela.add(botaoExcluir);

		// configuração de janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(400, 300);
		janela.setVisible(true);

	}

	public void adicionaLinha() {
if (jtfIncluirUf.getText().equals("") || (jtfIcluirEstado.getText().equals(""))) {
	JOptionPane.showMessageDialog(null, "Campo UF e Estado obrigatórios!");
	
}else {
	//obter o modelo da tela criada
	DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
    modelo.addRow(new String[] {jtfIncluirUf.getText(),jtfIcluirEstado.getText()});
    jtfIncluirUf.setText("");
    jtfIcluirEstado.setText("");
    JOptionPane.showMessageDialog(null, "Dados incluidos com sucesso!");
   
    
	
	
	
}

botaoExcluir.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		excluirLinha();
		
	}
});
	
}
		
		
		
	public void excluirLinha() {
		if (tabela.getSelectedRow()== -1) {
			JOptionPane.showMessageDialog(null,"Selecione uma linha");
			
		}else if (tabela.getSelectedRowCount() > 1){
			JOptionPane.showMessageDialog(null,"Selecione apenas uma linha");
		}else {
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			modelo.removeRow(tabela.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Excluido com sucesso");
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		new TesteGui10().iniciaGui();

	}

}
