package dam;

import java.util.Scanner;

public class Exc02PositivoNegativo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Valor:");
				int num = Integer.parseInt(teclado.nextLine());
				if(num<-120 || num >120 ) {
					throw new Exception ("No comprendido entre -120 y 120");
				}
				if (num > 0) {
					System.out.println("Positivo");
				} else if (num < 0) {
					System.out.println("Negativo");
				} else {
					System.out.println("Cero");
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("No es un número");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
	}
}
