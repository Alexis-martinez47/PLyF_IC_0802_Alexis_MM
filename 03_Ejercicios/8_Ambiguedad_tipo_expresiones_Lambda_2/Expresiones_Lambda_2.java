public class Expresiones_Lambda_2{
	public static void main(String[] args){
		Expresiones_Lambda_2.engine((CalculadoraInt)(x, y) -> x + y);
		Expresiones_Lambda_2.engine((CalculadoraInt)(x, y) -> x * y);
		Expresiones_Lambda_2.engine((CalculadoraInt)(x, y) -> x / y);
		Expresiones_Lambda_2.engine((CalculadoraInt)(x, y) -> x - y);
		Expresiones_Lambda_2.engine((CalculadoraInt)(x, y) -> x % y);
		Expresiones_Lambda_2.engine((CalculadoraLong)(x, y) -> x + y);
		Expresiones_Lambda_2.engine((CalculadoraLong)(x, y) -> x * y);
		Expresiones_Lambda_2.engine((CalculadoraLong)(x, y) -> x / y);
		Expresiones_Lambda_2.engine((CalculadoraLong)(x, y) -> x - y);
		Expresiones_Lambda_2.engine((CalculadoraLong)(x, y) -> x % y);
	}

// Sobrecarga de Metodos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}

	private static void engine(CalculadoraLong cal){
		long x = 2, y = 4;
		long resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}
}