package ejercicios;

import java.util.Scanner;

public class Practica_0 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.err.println("ingresar dia: ");
        int a = scan.nextInt();
        System.err.println("ingresar mes: ");
        int b = scan.nextInt();
        System.err.println("ingresar anio: ");
        int c = scan.nextInt();
       imprimirFecha(a, b, c);
        
	
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
//     EJERCCIO 9 MAL HECHO
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
}
