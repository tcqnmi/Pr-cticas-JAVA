package aniobisiesto;

import java.util.Scanner;

public class AnioCIR {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("A�o:");
				int anio = Integer.parseInt(teclado.nextLine());

				if (anio < 1900)
					throw new Exception("Debe ser un a�o superior al 1900");

				if (anio > 2100)
					throw new Exception("Debe ser un a�o inferior al 2100");

				if (anio%4==0 && !(anio%100==0 && anio%400!=0)) {
					System.out.println("Es a�o bisisesto");
				} else {
					System.out.println("A�o no bisiesto");
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Debe ser un valor num�rico");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
		
	}
	

}
