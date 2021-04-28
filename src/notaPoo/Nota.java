package notaPoo;

public class Nota {

	private int nota = 5;

	public Nota(int nota) throws Exception {
		setNota(nota);
	}
	public Nota() {
	}
	public Nota(Nota n) {
		this.nota = n.nota;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) throws Exception {
		if(nota>10) {
			throw new Exception("No puede ser mayor de 10");
		}
		if(nota<0) {
			throw new Exception("No puede ser menor de 0");
		}
		this.nota=nota;
	}
	
	public boolean esAprobado() {
		if(this.nota >= 5)
			return true;
		else
			return false;
	}
	public boolean esSuspenso() {
		return !esAprobado();
	}
	
	public String enLetra() {
		if(nota<5) {
			return "Suspenso";
			}else if(nota<7) {
			return "Notable";
			}else{
			return "Sobresaliente";
			}
	}

	@Override
	public String toString() {
		return String.format("Tu nota es: %d", nota);
	}
	
	
}
