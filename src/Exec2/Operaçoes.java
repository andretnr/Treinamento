package exec2;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Operaçoes {

	/**
	 * Operaçôes
	 * 
	 * @author atnunes
	 * @since 11/02/2020
	 * @version 0.1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// exemplo de adição
		int adicao = 5 + 2;
		// exemplo de subtração
		int subtracao = 12 - 6;
		// exemplo de multiplicação
		int multiplicao = 3 * 5;
		// exemplo de divisão
		int divisao = 52 / 2;
		// exemplo de modulação
		// equivale a 30 dividido por 20 que da resto 10
		// o modulo devolve o valor do resto

		int modulo = 30 % 20;

		// Resultados
		System.out.println("5 + 2 = " + adicao + "\n 12 - 6 = " + subtracao
				+ "\n 3 x 5 = " + multiplicao + "\n 52 / 2 = " + divisao
				+ "\n sobra de 30 / 20 = " + modulo);

	}

}
