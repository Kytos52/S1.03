package Nivell1_Ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class Gestion {
	
	static Set<Month> listaMeses = new HashSet<>();

	public static void main(String[] args) {

		System.out.println("Conjunto de tres primeros meses del año:");
		
		Month enero = new Month("Enero"); listaMeses.add(enero); 
		Month febrero = new Month("febrero "); listaMeses.add(febrero );
		Month marzo= new Month("marzo"); listaMeses.add(marzo);
		
		
		Iterator iter = listaMeses.iterator();
		while (iter.hasNext()) {
		    System.out.println(iter.next());
		}
		
		// Vuelvo  a añadir enero
		listaMeses.add(enero);
		System.out.println("Conjunto de tres primeros meses del año tras duplicar enero:");
		
		Iterator iter1 = listaMeses.iterator();
		while (iter1.hasNext()) {
		    System.out.println(iter1.next());
		}
		

	
		
		
	}

}
