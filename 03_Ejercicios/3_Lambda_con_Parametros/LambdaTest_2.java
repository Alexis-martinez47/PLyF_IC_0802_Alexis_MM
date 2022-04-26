public class LambdaTest_2{
	public static void main(String[] args){

		// Expresion Lambda ==> representa un objeto de una interfaz funcional
		Operaciones op = (num1, num2) -> System.out.println(num1+num2);

		op.imprimeSuma(5,10);
	}
}