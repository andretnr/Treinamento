package exec7;

import javax.swing.JOptionPane;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.CaseInsensitiveMap;



public class Repeticao {
	boolean exit = false;

	public Repeticao() {
		while (!exit) {
			processar();
	
			
			
		}
		
			
		
	}
	public void testaWhile() {
		int i = 10;
		while (i<10) {
			System.out.println(i + "ao cubo �: "+((i*i)*i));
			i = i +1;
			
		}
	}
		
		public void testaDoWhile(){
			int i= 10;
			
		}

	
	public void processar() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("op�ao 1"+1+"\n op�cao 2"+2+"\n op��o 3"+3+"\n op��o 4"+4+"\n op��o 9"+9));
		switch (opcao) {
	case 1:
			JOptionPane.showMessageDialog(null, "op�ao 1");
		case 2:
			JOptionPane.showMessageDialog(null, "op�ao 2");
		case 3:
			JOptionPane.showMessageDialog(null, "op�ao 3");
		case 4:
			JOptionPane.showMessageDialog(null, "op�ao 4");
		case 9:
			JOptionPane.showMessageDialog(null, "op�ao 9");
			default:
			JOptionPane.showMessageDialog(null, "op�ao invalida");
	}
	}

public static void main(String[]args) {
	new Repeticao();
}
}
	
	




