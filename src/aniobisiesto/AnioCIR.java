package aniobisiesto;

import java.util.Scanner;

public class AnioCIR {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Año:");
				int anio = Integer.parseInt(teclado.nextLine());

				if (anio < 1900)
					throw new Exception("Debe ser un año superior al 1900");

				if (anio > 2100)
					throw new Exception("Debe ser un año inferior al 2100");

				if (anio%4==0 && !(anio%100==0 && anio%400!=0)) {
					System.out.println("Es año bisisesto");
				} else {
					System.out.println("Año no bisiesto");
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Debe ser un valor numérico");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
		
	}
	

}
