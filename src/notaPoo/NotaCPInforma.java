package notaPoo;

import java.util.Scanner;

public class NotaCPInforma {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int nota;
		try {
			System.out.println("¿Qué nota ha sacado?");
			nota = Integer.parseInt(teclado.nextLine());
			if(nota<0) {
				throw new Exception ("No puede tener una nota inferior a 0");
			}
			if(nota >10) {
				throw new Exception("No puede tener una nota superior a 10");
			}
			if(nota<5) {
			System.out.println("Suspenso");
			}else if(nota<7) {
			System.out.println("Notable");
			}else{
			System.out.println("Sobresaliente");
		}
		} catch (NumberFormatException e) {
			System.out.println("Valor no numérico");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
