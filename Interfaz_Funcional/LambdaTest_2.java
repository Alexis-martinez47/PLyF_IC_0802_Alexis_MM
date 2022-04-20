// Ejemplo_1
/*
public class LambdaTest_2{
	public static void main(String[] args){

		// Expresion Lambda ==> representa un objeto de una interfaz funcional
		Operaciones op = (num1, num2) -> System.out.println(num1+num2);

		op.imprimeSuma(5,10);
	}
}*/

// Ejemplo_2
/*
public class LambdaTest_2{
	public static void main(String[] args){

		// Expresion Lambda ==> representa un objeto de una interfaz funcional
		Operaciones op = (num1, num2) -> System.out.println(num1+num2);

		LambdaTest_2 objeto = new LambdaTest_2();
		objeto.miMetodo(op, 10, 10);
	}

	public void miMetodo(Operaciones op, int num1, int num2){
		op.imprimeSuma(num1,num2);
	}
}*/

// Ejemplo_3
public class LambdaTest_2{
	public static void main(String[] args){

		// Expresion Lambda ==> representa un objeto de una interfaz funcional
		Operaciones op = (num1, num2) -> System.out.println(num1+num2);

		op.imprimeOperacion(5,10);

		LambdaTest_2 objeto = new LambdaTest_2();
		objeto.miMetodo((num1, num2) -> System.out.println(num1-num2), 20, 10);

		objeto.miMetodo((num1, num2) -> System.out.println(num1-num2), 20, 10);
	}

	public void miMetodo(Operaciones op, int num1, int num2){
		op.imprimeOperacion(num1,num2);
	}
}