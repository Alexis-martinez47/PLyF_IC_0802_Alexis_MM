public class Expresiones_Lambda_3{
	public static void main(String[] args){
		CalculadoraInt objInt= (x,y) -> x+y;
		CalculadoraInt objInt1= (x,y) -> x*y;
		CalculadoraInt objInt2= (x,y) -> x/y;
		CalculadoraInt objInt3= (x,y) -> x-y;
		CalculadoraInt objInt4= (x,y) -> x%y;
		CalculadoraLong objLong= (x,y) -> x+y;
		CalculadoraLong objLong1= (x,y) -> x*y;
		CalculadoraLong objLong2= (x,y) -> x/y;
		CalculadoraLong objLong3= (x,y) -> x-y;
		CalculadoraLong objLong4= (x,y) -> x%y;
		
		Expresiones_Lambda_3.engine(objInt);
		Expresiones_Lambda_3.engine(objInt1);
		Expresiones_Lambda_3.engine(objInt2);
		Expresiones_Lambda_3.engine(objInt3);
		Expresiones_Lambda_3.engine(objInt4);
		Expresiones_Lambda_3.engine(objLong);
		Expresiones_Lambda_3.engine(objLong1);
		Expresiones_Lambda_3.engine(objLong2);
		Expresiones_Lambda_3.engine(objLong3);
		Expresiones_Lambda_3.engine(objLong4);
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