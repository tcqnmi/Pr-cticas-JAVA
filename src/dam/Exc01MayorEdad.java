package dam;

import java.util.Scanner;

public class Exc01MayorEdad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Dime tu edad");
				//Validación por tipo
				int edad = Integer.parseInt(teclado.nextLine());
				
				//Validación por lógica del dato
				if(edad<0 || edad >120) {
					throw new Exception("La edad debe estar comprendida entre 0 y 120 años");
				}
				//TODO OK, DATOS CORRECTOS 
				if (edad >= 18) {
					System.out.println("Eres mayor de edad");
				} else {
					System.out.println("Eres menor de edad");
				}
				break;
			} catch (NumberFormatException e) {// es la excepción que envía el programa si no encuentra un formato válido
				System.out.println("La edad debe ser un número");
				//e.printStackTrace()Son las líneas rojas que se generan por defecto
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}

	}

}
