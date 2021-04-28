package personaExc;

public class Persona {
	
	private int edad = 18;

	public Persona(int edad) throws Exception {
		setEdad(edad);
	}
	
	public Persona() {
		
	}
	
	public Persona(Persona otro) {
		this.edad= otro.edad;
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if(edad<0) {
			throw new Exception("Edad no puede ser inferior a 0");
		}
		if(edad>120){
			throw new Exception("Edad no puede ser superior a 120");
		}
		
		
		this.edad = edad;
	}
	
	public boolean esMayorEdad() {
		if(this.edad>=18) 
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return String.format("Esta persona tiene %d años", edad);
	}
	
	
}
