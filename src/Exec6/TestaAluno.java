package Exec6;

import java.util.Calendar;
import javax.swing.JOptionPane;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class TestaAluno {
	
	/**
	 * @Teste Aluno
	 * @author atnunes
	 * @since 13/02/2020
	 * @Version 0.1
	 * 
	 */
	
	//Main Teste para Aluno
	
public static void main(String[]args) {
	//new Aluno("Andre",1982,"Java","Osasco",
	
String data = JOptionPane.showInputDialog("Digite a data de nascimento: ");

	
	Calendar cal = Calendar.getInstance();
	int Day = cal.get(Calendar.DAY_OF_MONTH);
	int Month = cal.get(Calendar.MONTH);
	int year = cal.get(Calendar.YEAR);
	
	
	String dataQuebrada[] = data.split("/");
	
	//System.out.println("Segunda separação");
	
	int a= Integer.parseInt(dataQuebrada[0]);
	int b= Integer.parseInt(dataQuebrada[1]);
	int c= Integer.parseInt(dataQuebrada[2]);
	
	
	DateTime dataInicial = new DateTime(c, b, a,0,0);
	DateTime dataFinal = new DateTime(year, Month, Day,0,0);
	
	int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
	
	System.out.println("\n"+ dias/365);
    
	JOptionPane.showMessageDialog(null, dias/365);
	

	
}



}
