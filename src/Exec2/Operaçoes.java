package exec2;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Opera�oes {

	/**
	 * Opera��es
	 * 
	 * @author atnunes
	 * @since 11/02/2020
	 * @version 0.1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// exemplo de adi��o
		int adicao = 5 + 2;
		// exemplo de subtra��o
		int subtracao = 12 - 6;
		// exemplo de multiplica��o
		int multiplicao = 3 * 5;
		// exemplo de divis�o
		int divisao = 52 / 2;
		// exemplo de modula��o
		// equivale a 30 dividido por 20 que da resto 10
		// o modulo devolve o valor do resto

		int modulo = 30 % 20;

		// Resultados
		System.out.println("5 + 2 = " + adicao + "\n 12 - 6 = " + subtracao
				+ "\n 3 x 5 = " + multiplicao + "\n 52 / 2 = " + divisao
				+ "\n sobra de 30 / 20 = " + modulo);

	}

}
