public class LambdaTest{
	public static void main(String[] args){

	// Expresion Lambda ==> representa un objeto de una interfaz funcional
	FunctionTest ft= () -> System.out.println("Hola Mundo");	// Implementacion del metodo abstracto "saludar()"
								  								// de la Interfaz funcional

		ft.saludar();
	}
}   
