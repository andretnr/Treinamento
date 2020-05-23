package exec9;

import javax.swing.JOptionPane;;

public class SeparaDominio {

	public static void main(String[] args) {
		// String email = JOptionPane.showInputDialog(null,"Informe o e mail:
		// ","Validadro de e-mail",0);
//		String email = JOptionPane.showInputDialog("Informe o e mail: ");
		String email = JOptionPane.showInputDialog(null, "Informe o e-mail: ", "Validadro de e-mail", 1);
		int cont = email.indexOf("@");
		if (cont > 0) {
			System.out.println("Posicção do @: " + cont);
			String dominio =
					email.substring(cont+1);
			System.out.println("Dominio do e-mail: "+dominio);
			String usuario =
					email.substring(0,cont);
			System.out.println("Usuário do e-mail: "+usuario);

		}
	}

}
