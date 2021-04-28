package aniobisiesto;

import java.util.Scanner;

public class PruebaAnio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Año: ");
			int year = Integer.parseInt(
					teclado.nextLine());
			Anio y1 = new Anio(year);
			
			if(y1.esBisiesto()) {
				System.out.printf("El año %s es bisiesto",y1);
			}else {
				System.out.printf("El año %s no es bisiesto",y1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
