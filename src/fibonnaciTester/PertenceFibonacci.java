package fibonnaciTester;

public class PertenceFibonacci {

	public class FibonacciUtils {
	    // Método para verificar se um número existe na sequência de Fibonacci
	    public static boolean pertenceFibonacci(int numero) {
	        if (numero < 0) {
	            return false;
	        }

	        int a = 0, b = 1;
	        while (a < numero) {
	            int temp = a;
	            a = b;
	            b = temp + b;
	        }

	        return a == numero;
	    }
	}
	
}
