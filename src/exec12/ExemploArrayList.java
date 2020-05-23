package exec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class ExemploArrayList {
	
	public static void main(String[] args) {
		
		//criar um objeto array List
		List<String> arrayList = new ArrayList<String>();
		
		
		//adicionar elementos ao final da lista
		arrayList.add("Elemnto N°1");
		arrayList.add("Elemnto N°2");
		arrayList.add("Elemnto N°3");
		
		System.out.println("Posição 1 contem: "+ arrayList.get(0));
		System.out.println("Posição 2 contem: "+ arrayList.get(1));
		System.out.println("Posição 3 contem: "+ arrayList.get(2));

		for (String s: arrayList) {
			System.out.println(s);
		}
		
		//tambem podemos adicionar um elemento numa posição qualquer
		arrayList.add(1, "Elemento n°1,5");
		System.out.println("\nApós adicionar o elemento 1,5:\n");
		
		for (String s: arrayList) {
			System.out.println(s);
		}
		
		//Obter o tamanho da lista
		System.out.println("\nO tamanho da lista é: " + arrayList.size() + "\n" );
		
		//podemos ver um determinado valor na lista
		if (arrayList.contains("Elemento n°1,5")) {
			System.out.println("Elemento 1,5 existe");
		}else {
			System.out.println("elemento 1,5 não existe");
		}
		
		int indice = arrayList.indexOf("elemento n°1,5");
		System.out.println("\nO indice do elemento 1,5 é: "+ indice);
		
		//remover um elemento da lista
		System.out.println("Removendo elemento n°1,5");
		arrayList.remove("Elemento n°1,5");
		System.out.println("Lista Atualizada");
		
		for (String s:arrayList) {
			System.out.println(s);
			
		}
		
		//remover com base no indice - remover ultimno registro
		System.out.println("Removendo o ultimo elemento");
		arrayList.remove(arrayList.size()-1);
		System.out.println("lista atualizada");
		
	
		for (String s:arrayList) {
			System.out.println(s);
			
		}
		
		//adicionar elementos na lista
		System.out.println("\nAdiciona na lista:");
		arrayList.add("elemento n°5");
		arrayList.add("elemento n°9");
		arrayList.add("elemento n°4");
		arrayList.add("elemento n°0");
		arrayList.add("elemento n°8");
		
		System.out.println("\nLista com elementos adicionados:");
		
		for (String s:arrayList) {
			System.out.println(s);
			}
		
		//ordenando array list
		Collections.sort(arrayList);
		System.out.println("\nLista ordenada:");
		
		for (String s:arrayList) {
			System.out.println(s);
			}
		
		//Criando uma lista de objetos
		List<Filme> arrayListFilmes = new ArrayList<Filme>();
		
		
		//criando 3 filmes
		Filme filme1 = new Filme();
		filme1.setCodigo(1);
		filme1.setNome("Codigo de conduta");
		
		Filme filme2 = new Filme();
		filme2.setCodigo(2);
		filme2.setNome("Era do gelo");
		
		
		Filme filme3 = new Filme();
		filme3.setCodigo(3);
		filme3.setNome("Matrix");
		
		
		if (filme1.equals(filme2)) {
			System.out.println("\nFilmes iguais\n");
		}else {
			System.out.println("\nFilmes diferentes\n");
		}
		
		//adicionar lista de filmes instanciados
		arrayListFilmes.add(filme1);
		arrayListFilmes.add(filme2);
		arrayListFilmes.add(filme3);
		
		//exibindo lista de filme
		for (Filme f : arrayListFilmes) {
			System.out.println(f);
		}
		
		//ordenar lista
	//	System.out.println("Lista Ordenada:");
	//	Collections.sort(() arrayListFilmes);
	//	for (filme f : arrayListFilmes) {
	//	System.out.println(f);
	//	}
		
		
		
		
		
		
	}

}
