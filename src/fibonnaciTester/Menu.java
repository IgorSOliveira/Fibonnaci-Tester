package fibonnaciTester;

import java.util.Scanner;

import fibonnaciTester.PertenceFibonacci.FibonacciUtils;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual número você deseja conferir se existe na sequência?");
        int number = scanner.nextInt();
        scanner.nextLine();
		
        if (FibonacciUtils.pertenceFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
	}

}
