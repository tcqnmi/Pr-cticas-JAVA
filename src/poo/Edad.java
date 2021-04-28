package poo;

public class Edad {
	
	private int edad = 18;
	
	public Edad() {
		
	}
	//peligro de mala introducción de datos
	public Edad(int edad) throws Exception {
		setEdad(edad);
	}
	public Edad(Edad e) {
		//e ya guarda una edad válida
		this.edad = e.edad;
	}
	public int getEdad() {
		return edad;
	}
	
	//peligro de mala introducción de datos
	//las comprobaciones solo se hacen en el setter, nada de repetir código
	//los otros puntos que necesiten comprobación llamarán al setter
	public void setEdad(int edad) throws Exception {
		//un error muy típico es que usan this, pero las comprobaciones se 
		//hacen sobre el dato que nos pasan
		//Aquí no va try, cuando escribimos el throw new, clicamos add exception
		//En lugar de capturar la excepción se la pasamos al que hizo la llamada
		if(edad<0)
			throw new Exception("La edad no puede ser negativa");
		if(edad>120)
			throw new Exception("La edad no puede ser superior a 120");
		
		
		//todo ok!
		this.edad = edad;
	}
	
	public boolean esMayorEedad() {
		//trabajamos sobre el atributo el cual ya debe ser valido si o si 
		//no son necesarias más comprobaciones de las ya hechas
		return this.edad>=18;
	}
	
	@Override
	public String toString() {
		return this.edad + " años";
	}
	
	
	
	
	
}
