package ejercicios;
import java.util.Scanner;
public class Condicionales {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.err.println("ingresar dia: ");
        int a = scan.nextInt();
        System.err.println("ingresar mes: ");
        int b = scan.nextInt();
        System.err.println("ingresar anio: ");
        int c = scan.nextInt();
        imprimirFecha(a, b, c);
        
	}
	//	System.err.println("ingresar nota  1: ");
	//	double nota1 = scan.nextFloat();
	//	System.err.println("ingresar nota  2: ");
		//double nota2 = scan.nextFloat();
	//	System.out.println("ingresar el nombre");
	//	String nombre = scan.nextLine();
	//	int largo = nombre.length();
//		System.err.println(largo);
	
	//EJERCICIO 8
	//	ponerNota(nota1,nota2);	}
	
	//public static void ponerNota(double x, double y) {
	//	double promedio = (x+y)/2;
	///	if(promedio>=7) {
	//		System.err.println("Promocionadp");
	//	}else if(promedio>=4) {
	//		System.err.println("Aprobado");
	//	}else if(promedio<4) {
	//		System.err.println("Debe recuperar");
	//	}
		
//EJERCCIO 9
		public static void imprimirFecha(int dia, int mes, int anio) {
		if (dia>=30) {
			   if (mes==4) {
				System.out.println(dia+" de Abril" + anio);
			}else if (mes==9) {
				System.out.println(dia+" de Diciembre" + anio);
			}else if (mes==11) {
				System.out.println(dia+" de Noviembre" + anio);
			}else if (mes==6) {
				System.out.println(dia+" de Junio" + anio);
			}else System.err.println("FUERA DE RANGO");
			   
		} else if (mes==3) {
				System.out.println(dia+" de Marzo" + anio);
			}else if (mes==5) {
				System.out.println(dia+" de Mayo" + anio);
			}else if (mes==7) {
				System.out.println(dia+" de Julio" + anio);
			}else if (mes==8) {
				System.out.println(dia+" de Agosto" + anio);
			}else if (mes==10) {
				System.out.println(dia+" de Octubre" + anio);
			}else if (mes<13 && mes>11) {
				System.out.println(dia+" de Diciembre" + anio);
        
		} else if (mes==3) {
			System.out.println(dia+" de Marzo" + anio);
		}	
		}
		
		
}

