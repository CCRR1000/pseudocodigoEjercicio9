/*
  9. Se leen desde teclado pares de temperaturas (T1 y T2) hasta que T1 sea cero. Hallar el promedio de las temperaturas 
  ingresadas que están comprendidas entre 5° y 15° (incluidos)
*/

import java.util.*;

public class Ejercicio9 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int T1, T2, contador=0;
		double promedio, sumaT=0;

		do {
			System.out.print("\nIngrese la primer temperatura: ");
			T1 = read.nextInt();

			if (T1!=0) {
				System.out.print("Ingrese la segunda temperatura: ");
				T2 = read.nextInt();

				if (T1<=15 && T1>=5) {
					sumaT += T1;
					contador++;
				}
				if (T2<=15 && T2>=5) {
					sumaT += T2;
					contador++;
				}

			} else {
				promedio = sumaT/contador;

				System.out.println("\n   Promedio de temperaturas entre 5° y 15°: "+promedio+"\n");
			}

		} while (T1!=0);
	}


}

