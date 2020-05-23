package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TesteGui7 {

	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JPanel painelDaJanela;
	
	
	public void iniciaGui() {
		
		//criar as instancias
		janela = new JFrame("Exemplo de menu");
		barraMenu = new JMenuBar();
		menu01 = new JMenu("menu01");
		menu02 = new JMenu("menu02");
		itemMenu1 = new JMenuItem("itemMenu1");
		itemMenu2 = new JMenuItem("itemMenu2");
		painelDaJanela = (JPanel) janela.getContentPane();
		
		//acresentar menus na barra de menu 
		barraMenu.add(menu01);
		barraMenu.add(menu02);
		
		//acresentar itens de menu nos menus
		menu01.add(itemMenu1);
		menu02.add(itemMenu2);
		
		//Configurar a ação do item menu 1
		itemMenu1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new TesteGui4().IniciaGui();
				
			}
			
			
			
		});
		
		//Configurar a ação do item menu 2
		itemMenu2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
			
			
		});
		
		//configurações do painel da tela
		painelDaJanela.setLayout(null);
		
		
		//configurações da tela
		janela.setJMenuBar(barraMenu);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		janela.setVisible(true);
		
		
		
		
		
		
		
		
		
			}
	
	public static void main(String[] args) {
		new TesteGui7().iniciaGui();
	}
	
}
