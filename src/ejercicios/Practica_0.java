package ejercicios;

import java.util.Scanner;

public class Practica_0 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
	//         IMPRIME EL JERCICIO 12	
	//	System.err.println("ingresar el numero raacional:  ");
	//	double a =scan.nextDouble();
	//	System.err.println("ingresar el numero correspondiente");
	//	int b= scan.nextInt();
	//	System.err.println("El resultado es: "+potencia(a,b));
		
	//             IMPRIME EL EJERCICIO 11	
	//	System.err.println("Ingresar el dato correspondiente: ");
	//	int a = scan.nextInt();
	//	int resultado = sumatoriaPares(a); 
	//	System.out.println("La sumatoria de 1 hasta " + a + " es: " + resultado); // Imprime: La sumatoria de 1 hasta 5 es: 15 (1 + 2 + 3 + 4 + 5)
		
	//         IMPRIME EL EJERCICIO 10 ME AYUDO NOTEBOOKKML PORUQE NO ENTENDIA LA CONSIGNA	
	//	System.err.println("Ingresar el dato correspondiente: ");
	//	int a = scan.nextInt();
	//	int resultado = sumatoriaPares(a); 
	//	System.out.println("La sumatoria de 1 hasta " + a + " es: " + resultado); // Imprime: La sumatoria de 1 hasta 5 es: 15 (1 + 2 + 3 + 4 + 5)
		
		
		
		
	// IMPRIME EL EJERCICIO 9	
	//	System.err.println("ingresar dia: ");
    //   int a = scan.nextInt();
    //    System.err.println("ingresar mes: ");
    //    int b = scan.nextInt();
    //    System.err.println("ingresar anio: ");
    //    int c = scan.nextInt();
    //   imprimirFecha(a, b, c);
        
	//  IMPRIME EL EJERCICIO 8
	//	System.err.println("ingresar nota  1: ");
	//	double nota1 = scan.nextFloat();
	//	System.err.println("ingresar nota  2: ");
	//	double nota2 = scan.nextFloat();
	//	System.out.println("ingresar el nombre");
	//	String nombre = scan.nextLine();
	//	int largo = nombre.length();
	//	System.err.println(largo);
	//	ponerNota(nota1,nota2);
		}
		//EJERCICIO 8
	public static void ponerNota(double x, double y) {
		double promedio = (x+y)/2;
		if(promedio>=7) {
			System.err.println("Promocionadp");
		}else if(promedio>=4) {
			System.err.println("Aprobado");
		}else if(promedio<4) {
			System.err.println("Debe recuperar");
		}
	}	
//     EJERCCIO 9 BIEN HECHO PERO NO IMPRIME EL ERROR
		public static void imprimirFecha(int dia, int mes, int anio) {			
			if (dia<=31) {
				if(mes==1){
					
					System.err.println(dia+" de Enero de "+anio);
					
				}else if(mes==3) {
					System.err.println(dia+" de Marzo de "+anio);
				}else if(mes==12) {
					System.err.println(dia+" de Diciembre de "+anio);
				}else if(mes==10) {
					System.err.println(dia+" de Octubre de "+anio);
				}else if(mes==7) {
					System.err.println(dia+" de Julio de "+anio);
				}else if(mes==5) {
					System.err.println(dia+" de Mayo de "+anio);
				}else if(mes==8) {
					System.err.println(dia+" de Agosto de "+anio);
				}
				else if (dia<=30) {
			     if(mes==9) {
				System.err.println(dia+" de Enero de "+anio);
			    }else if(mes==6) {
				System.err.println(dia+" de Marzo de "+anio);
			    }else if(mes==11) {
				System.err.println(dia+" de Diciembre de "+anio);
			    }else if(mes==4) {
				System.err.println(dia+" de Octubre de "+anio);
			    }else if (dia<=28) {
			    if(mes==2) {
				System.err.println(dia+" de Febrero de "+anio);
			    }else {
				System.err.println("fuera de rango");
			    }
			
	
	 }
	}		
  }
 }
		
		
		
		//EJERCICIO 10
		public static int sumatoria(int n) {
			int suma=0;
			for(int i=1;i<n;i++) {
				suma+=i;			
					
			}return suma;
			
		
		}
		
		// EJERCICIO 11
		public static int sumatoriaPares(int n) {
			int suma=0;
			for(int i=0;i<n;i++) {
				if(i%2==0) {
				suma+=i;
				}
			}return suma;
		}
		
		
		
		// EJERCICIO 12 CON AYUDA DE NOTEBOKKKML PORQUE NO ENTENDIA COMO HACERLO
		public static double potencia(double x, int a) {
			double resultado = 1.0;
			// 1\. Acumulador inicializado en 1.0 (neutro de la multiplicación) 
			// 2\. El bucle se repite 'a' veces (tantas como indique el exponente) 
			for (int i = 1; i<= a; i++) { 
				resultado *= x;
				// 3\. Multiplica el resultado actual por la base 'x'
				} return resultado; 
				// 4\. Devuelve el resultado final acumulado
		
		
		
		
		
		
		
		
		
		
		}	
}
