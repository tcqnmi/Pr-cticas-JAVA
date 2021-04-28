package dam;

import java.util.Scanner;

public class Exc01MayorEdad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Dime tu edad");
				//Validaci�n por tipo
				int edad = Integer.parseInt(teclado.nextLine());
				
				//Validaci�n por l�gica del dato
				if(edad<0 || edad >120) {
					throw new Exception("La edad debe estar comprendida entre 0 y 120 a�os");
				}
				//TODO OK, DATOS CORRECTOS 
				if (edad >= 18) {
					System.out.println("Eres mayor de edad");
				} else {
					System.out.println("Eres menor de edad");
				}
				break;
			} catch (NumberFormatException e) {// es la excepci�n que env�a el programa si no encuentra un formato v�lido
				System.out.println("La edad debe ser un n�mero");
				//e.printStackTrace()Son las l�neas rojas que se generan por defecto
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}

	}

}
