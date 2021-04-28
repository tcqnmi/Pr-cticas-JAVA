package poo;

public class pruebaEdad {

	public static void main(String[] args) {
		
		try {
			
		Edad ed= new Edad(100);
		ed.setEdad(-150);
		Edad ed2= new Edad(ed);
		System.out.println(ed);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		
	}

}
