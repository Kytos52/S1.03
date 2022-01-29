package Nivell1_Ex3;



public class Generadora {
	
	private String  personajes[] = {"Rambo", "Tarzán", "MazingerZ"};
	private Integer actual;
	
	
	public Generadora() {
		this.actual=0;
	}
	
	
	
	public int getActual() {
		return actual;
	}

	public void setActual(int actual) {
		this.actual = actual;
	}



	public String seguentPersonatje() {
		actual++;
	
		if(actual<=personajes.length) {
			
			return personajes[actual-1];
			
			
		}else {
			actual =1;
			return personajes[actual-1];
		}
		
		
	}
}
