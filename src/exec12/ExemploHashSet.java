package exec12;

import java.util.HashSet;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		HashSet<String> lista = new HashSet<String>();
		lista.add("A era do gelo");
		lista.add("Madagascar");
		lista.add("Fuga das Galinhas");
		
System.out.println(lista);

HashSet<String> listaString = new HashSet<String>();
listaString.add("A era do gelo");
listaString.add("Madagascar");
listaString.add("Fuga das Galinhas");

System.out.println(listaString);


HashSet<Integer> listaint = new HashSet<Integer>();
listaint.add(10);
listaint.add(1);
listaint.add(1);
listaint.add(2);
listaint.add(3);

System.out.println(listaint);



	}

}
