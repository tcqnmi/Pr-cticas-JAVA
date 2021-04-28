package personaExc;

public class PruebaPersona {

	public static void main(String[] args) {
		
		try {
			Persona p1 = new Persona(22);
			Persona p2 = new Persona();
			Persona p3 = new Persona(p1);
			System.out.println(p1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
