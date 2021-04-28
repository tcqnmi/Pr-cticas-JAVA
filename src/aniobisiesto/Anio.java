package aniobisiesto;

public class Anio {
	
	private int year = 1900;

	public Anio(int year) throws Exception {
		setYear(year);
	}
	public Anio() {
		
	}
	public Anio(Anio y) {
		this.year = y.year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws Exception {
		if(year<1900) 
			throw new Exception("No puede ser un año inferior a 1900");
		if(year>2100)
			throw new Exception("No puede ser un año superior a 2100");
		this.year=year;
	
	}
	
	public boolean esBisiesto() {
		if(this.year%4==0 && !(year%100==0 && year%400!=0)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return String.format("%d", year);
	}
	
	

}
