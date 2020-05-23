package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {

	public static void main(String[] args) {
		PrintStream gravador;
		try {
			gravador = new PrintStream("saida.txt");
			gravador.println("Texto");
			gravador.println("Texto");
			gravador.println("Texto");
			gravador.println("Texto");
			gravador.println("Texto");
			gravador.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
				
	}

}
