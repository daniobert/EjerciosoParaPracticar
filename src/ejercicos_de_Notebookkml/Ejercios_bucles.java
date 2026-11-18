package ejercicos_de_Notebookkml;
import java.util.Scanner;

public class Ejercios_bucles {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.err.println("PONE EL NUMERO PIBE: ");
	int impar = scan.nextInt();
	imprimirImpares(impar);
	}
//                  Ejercicio 1: Filtrado de Impares	
//Consigna: 
//	Escribir un método static void imprimirImpares(int n) que reciba un número entero positivo n
//	e imprima por pantalla todos los números impares desde 1 hasta n (inclusive).

	public static void imprimirImpares(int n) {
		for(int fact=0;fact<n;fact++) {
			if(fact%2!=0) {
				 System.err.println(fact);
			}
		}
	}
	
	
	
	
}
