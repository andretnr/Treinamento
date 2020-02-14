package Exec6;

import java.util.Calendar;

public class Aluno {

	/**
	 * @Dados Aluno
	 * @author atnunes
	 * @since 13/02/2020
	 * @Version 0.1
	 * 
	 */

	//Declaração de Variaveis
	
	String nome;
	int anoNascto;
	String curso;
	String cidade;
	String dataNascto;
	
    //Metodo Construtor
	
	public Aluno() {
	}

	public Aluno(String nome, int anoNascto, String curso, String cidade, String dataNascto) {
		this.nome = nome;
		this.anoNascto = anoNascto;
		this.curso = curso;
		this.cidade = cidade;
		this.dataNascto = dataNascto;
		exibir();
	}

	/*
	 * Calculo idade simples (desativado)
	 */

	//public int idade() {
		//Calendar cal = Calendar.getInstance();
		//int year = cal.get(Calendar.YEAR);
		//int idade = (year - anoNascto);
		//return idade;
	//}

	
	// Metodo de Exibição
	 
	
	public void exibir() {

		System.out.println("Nome  : "+nome);
		System.out.println("Idade : "+idade());
		System.out.println("Curso : "+curso);
		System.out.println("Cidade: "+cidade);

	}
	
	//Metodo do Calculo de Idade

	public int idade() {
		Calendar cal = Calendar.getInstance();
		int Day = cal.get(Calendar.DAY_OF_MONTH);
		int Month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		
		//String dataNascto;
		String dataQuebrada[] = dataNascto.split("/");
		
		//System.out.println("Segunda separação");
		
		int a= Integer.parseInt(dataQuebrada[0]);
		int b= Integer.parseInt(dataQuebrada[1]);
		int c= Integer.parseInt(dataQuebrada[2]);
		
		int i = ((year-c)*365-(b-Month)*30+(Day-a));
		int idade = (i+30)/365;
		return idade;
	}
}
		
		//Testes Aleatorios
		
		//Teste > //(year-c)
		
		 //int idade = ((a+(b*30)+c) - (Day + (Month * 30) + year );
	

	//public int anoNascto() {
		//String anoNascto;
		//String datas2[] = data1.split("/");
		
		//System.out.println("Segunda separação");
		//System.out.println(datas2[0]);
		//System.out.println(datas2[1]);
		//System.out.println(datas2[2]);
		
		
		
	
		
	
	
	// String data = data.replace("/"," ");
	// data = data.trim();
	// String data = null;
	// Integer.parseInt(data);
	// data = (new java.text.SimpleDateFormat("yyyyMMdd").format(new
	// java.util.Date(System.currentTimeMillis())));
//		return idade2();


