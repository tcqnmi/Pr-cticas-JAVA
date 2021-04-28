package notaPoo;

import java.util.Scanner;

public class PruebaNota {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("¿Qué nota ha sacado?");
			int nota = Integer.parseInt(teclado.nextLine());
			Nota calif = new Nota(nota);
			
			if(calif.esAprobado()) {
				System.out.println("Has aprobado");
			}
			
			System.out.println(calif);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
