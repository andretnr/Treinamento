package exec8;


//Utilizando os conhecimentos obtidos até agora, faça um programa que simule o funcionamento de uma caixa bancario eletronico.

//Regras: o usuario informará qual o valor a ser sacado e o programa deve retornar a quantidade de cada nota de acordo com seu valor.

//NOTAS DISPONÍVEIS: 2,00 - 5,00 - 10,00 - 20,00 - 50,00

//EXEMPLO: SAQUE DE 1437

//  Nota de 50:       28 notas
	
//	Nota de 20:        1 notas
	
//	Nota de 10:        1 notas
	
//	Nota de  5:        1 notas
	
//	Nota de  2:        1 notas

public class Caixa {
	
	/**
	 * Caixa eletronico
	 * @author atnunes
	 * @since 17/02/2020
	 * @Version 0.1
	  */
	
//Atributos	
	
double saque;
double deposito;
double dinheiroArmazenado = 100000;
double saldo;
double nota50 = 50;
double nota20 = 20;
double nota10 = 10;
double nota5 = 5;
double nota2 = 2;


//Construtor

public Caixa(double saque, double deposito, double dinheiroArmazenado, double saldo, double nota50, double nota20,
		double nota10, double nota5, double nota2) {
	super();
	this.saque = saque;
	this.deposito = deposito;
	this.dinheiroArmazenado = dinheiroArmazenado;
	this.saldo = saldo;
	this.nota50 = nota50;
	this.nota20 = nota20;
	this.nota10 = nota10;
	this.nota5 = nota5;
	this.nota2 = nota2;
}




}



	


