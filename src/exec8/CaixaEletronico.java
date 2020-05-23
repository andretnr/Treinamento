package exec8;
import javax.swing.JOptionPane;
/**
 * Classe responsável por demonstrar o fluxo de saque
 * de um caixa eletrônico com notas de 2, 5, 10, 20 e 50 
 * @author atnunes
 * @since 17/02/2020
 * @version 0.1
 */

public class CaixaEletronico {//inicio da classe
	
	public static void main(String[] args) {//inicio do método main
		
		

		//Declaração das variáveis utilizadas no programa
		int valorSacado = 1003;
		int notaCinquenta = 0;
		int notaVinte = 0;
		int notaDez = 0;
		int notaCinco = 0;
		int notaDois = 0;
		
		int valorSacado1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor que deseja sacar:"));
		
		
		
		//Inicio dos condicionais para calculo de notas
		if (valorSacado1 == 103) {
			notaCinquenta = 1;
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado1 = (valorSacado1 - 103);
			System.out.println("Notas de Cinquenta: " + notaCinquenta);
			System.out.println("Notas de Vinte: " + notaVinte);
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
			
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
		}
		if (valorSacado1 == 53) {
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado1 = (valorSacado1 - 53);
			System.out.println("Notas de Vinte: " + notaVinte);
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
			
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
		}else
			if (valorSacado1 >= 50) {
				notaCinquenta = (valorSacado1 / 50);
				valorSacado1 = (valorSacado1 - (notaCinquenta * 50));
				System.out.println("Notas de Cinquenta: " + notaCinquenta);
				JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
		}
		if (valorSacado1 == 43) {
			notaVinte = 1;
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado1 = (valorSacado1 - 43);
			System.out.println("Notas de Vinte: " + notaVinte);
			System.out.println("Notas de Dez: " + notaDez);
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
			
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
		}
		if (valorSacado1 == 23) {
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado1 = valorSacado1 - 23;
			System.out.println("Notas de Dez: " + notaDez);
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
			
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
			
		}else		
			if (valorSacado1 >= 20) {
				notaVinte = (valorSacado1 / 20);
				valorSacado1 = (valorSacado1 - (notaVinte * 20));
				System.out.println("Notas de Vinte: " + notaVinte);
				
				JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
		}
		if (valorSacado1 == 13) {
			notaCinco = 1;
			notaDois = 4;
			valorSacado1 = valorSacado1 - 13;
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
			
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
			
		}else
			if (valorSacado1 >= 10) {
				notaDez = (valorSacado1 / 10);
				valorSacado1 = (valorSacado1 - (notaDez * 10));
				System.out.println("Notas de Dez: " + notaDez);
				
				JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
		}
				

		
		switch (valorSacado1) {
		case 9:
			notaCinco = 1;
			notaDois = 2;
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
			break;
		case 8:
			notaDois = 4;
			System.out.println("Notas de Dois: " + notaDois);
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
			break;
		case 7:
			notaCinco = 1;
			notaDois = 1;
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
			break;
		case 6:
			notaDois = 3;
			System.out.println("Notas de Dois: " + notaDois);
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
			break;
		case 5:
			notaCinco = 1;			
			System.out.println("Notas de Cinco: " + notaCinco);
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
			break;
		case 4:
			notaDois = 2;
			System.out.println("Notas de Dois: " + notaDois);
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
			break;
		case 3:
			notaDois = 1;
			System.out.println("Notas de Dois: " + notaDois);
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
			break;
		case 2:
			notaDois = 1;
			System.out.println("Notas de Dois: " + notaDois);
			JOptionPane.showMessageDialog(null, "\n Notas de Cinquenta: " + notaCinquenta+"\n Notas de Vinte: " + notaVinte+ " \n Notas de Dez"+notaDez+ " \n Notas de Cinco: " + notaCinco+" Notas de Dois: " + notaDois );
			
			break;

		}//fim do método main

	}//fim da classe
	
}

