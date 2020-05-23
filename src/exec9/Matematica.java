package exec9;

public class Matematica {

	public static void main(String[] args) {
		double x = 10, y = 20.5, z = -30;
		
		//Valor Absoluto
		double abs = Math.abs(z);
		System.out.println("Absoluto: " +abs );
		
		//Reotrna o menor Valor inteiro
		double ceil = Math.ceil(y);
		System.out.println(ceil);
		
		//Arredonda o valor
		double floor = Math.floor(y);
		System.out.println(floor);
		
		//Calcula logaritmo
		double log = Math.log(x);
		System.out.println(log);
		
		//Retorna o maior
		double max = Math.max(x,y);
		System.out.println(max);
		
		//Retorna o menor
		double min = Math.min(x, y);
		System.out.println(min);
		
		
		//Calcula potencia
		double pow = Math.pow(x, 2);
		System.out.println(pow);
		
		//calcula o raiz quadrada
		double sqrt = Math.sqrt(x);
		System.out.println(sqrt);
		
		//Calcula o coseno
		double cos = Math.cos(x);
		System.out.println(cos);
		
		//Calcula Seno
		double sin = Math.sin(x);
		System.out.println(sin);
		
		//Calcula Tangente
		double tan = Math.tan(x);
		System.out.println(tan);
		
		
		
	}

}
