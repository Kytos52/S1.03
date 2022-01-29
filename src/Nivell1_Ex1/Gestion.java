package Nivell1_Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Gestion {
	
	static List<Month> listaMeses = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MESES SIN AGOSTO");
		
		
		Month enero = new Month("Enero"); listaMeses.add(enero); 
		Month febrero = new Month("febrero "); listaMeses.add(febrero );
		Month marzo= new Month("marzo"); listaMeses.add(marzo);
		Month abril = new Month("abril"); listaMeses.add(abril);
		Month mayo = new Month("mayo"); listaMeses.add(mayo);
		Month junio = new Month("junio"); listaMeses.add(junio);
		Month julio = new Month("julio"); listaMeses.add(julio);
		Month septiembre = new Month("septiembre"); listaMeses.add(septiembre);
		Month octubre = new Month("octubre"); listaMeses.add(octubre);
		Month noviembre = new Month("noviembre"); listaMeses.add(noviembre);
		Month diciembre = new Month("diciembre"); listaMeses.add(diciembre);
		
		ListIterator<Month> listIterator = listaMeses.listIterator();
		
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		
		Month agosto = new Month ("agosto"); listaMeses.add(7,agosto);
		
		System.out.println("MESES CON AGOSTO");
		ListIterator<Month> listIterator1 = listaMeses.listIterator();
		
		while(listIterator1.hasNext()){
			System.out.println(listIterator1.next());
		}
			
		
		
	}
}


