package exec10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teste04 {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("entrada.txt");
			InputStreamReader isr = new InputStreamReader (is);
			BufferedReader leitor = new BufferedReader (isr);
			String texto = leitor.readLine();
			while (texto!=null) {
				System.out.println(texto);
				texto = leitor.readLine();
				leitor.close();
				
			}
			
			
			
} catch (FileNotFoundException e) {
	System.out.println("arquivo de entrada não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
	e.printStackTrace();
}
	}

}
