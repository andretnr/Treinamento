package exec11;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TesteGui12 {

	private JFrame janela;
	private JList list;
	private JLabel label;
	private JPanel painelDaJanela;
	private JScrollPane scroll;
	
	private String[] diaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};
	
	
	public void iniciaGui() {
		
		janela = new JFrame("Exemplo de Lista");
		painelDaJanela = (JPanel) janela.getContentPane();
		list = new JList(diaSemana);
		label = new JLabel("CTRL para multiseleções", JLabel.CENTER);
		scroll = new JScrollPane(list);
		
		//configuração parametro da lista
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				label.setText((String) list.getSelectedValue());
			}
		});
		
		
		//configurações do scrool
		scroll.setBounds(10, 60, 300, 90);
		
		//atributos do rotulo
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.BLACK);
		label.setBounds(10, 10, 300, 30);
		
		//configuração da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400,300);
		janela.setVisible(true);
		
		//configurações do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(label);
		painelDaJanela.add(scroll);
		
	
		
		
		
	}
	
	
	public static void main(String[] args) {
		new TesteGui12().iniciaGui();
	}
}
