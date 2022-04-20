// Ejemplo1
/*
public class LambdaTest{
	public static void main(String[] args){

	// Expresion Lambda ==> representa un objeto de una interfaz funcional
	FunctionTest ft= () -> System.out.println("Hola Mundo");	// Implementacion del metodo abstracto "saludar()"
								  								// de la Interfaz funcional

		ft.saludar();
	}
}   
*/

//Ejemplo2

public class LambdaTest{
	public static void main(String[] args){

	// Expresion Lambda ==> representa un objeto de una interfaz funcional
	FunctionTest ft= () -> System.out.println("Hola Mundo");	// Implementacion del metodo abstracto "saludar()"
																// de la Intefaz funcional
	LambdaTest objeto = new LambdaTest();
	objeto.miMetodo(ft);
}

	public void miMetodo(FunctionTest parametro){
		parametro.saludar();
	}
	}
