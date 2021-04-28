package aniobisiesto;

import java.util.Scanner;

public class PruebaAnio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("A�o: ");
			int year = Integer.parseInt(
					teclado.nextLine());
			Anio y1 = new Anio(year);
			
			if(y1.esBisiesto()) {
				System.out.printf("El a�o %s es bisiesto",y1);
			}else {
				System.out.printf("El a�o %s no es bisiesto",y1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
