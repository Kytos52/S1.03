package Nivell1_Ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex5 {

	public static void main(String[] args) {
		
		List<Integer> miList1 = new ArrayList<>();
		Collections.addAll(miList1, 1,2,3,4,5);
		List<Integer> miList2= new ArrayList<>();
		Collections.addAll(miList2, 10,20,30,40,50);
		System.out.println("Lista 1 = "+miList1 +" Lista 2 = "+ miList2);
		
				
		ListIterator<Integer> iter = miList1.listIterator();
		while (iter.hasNext()) {
		    String siguiente = iter.next().toString();
		    //System.out.println(siguiente);
		    //miList2.add(Integer.parseInt(siguiente));
		}
		
		
		while (iter.hasPrevious()) {
		    String siguiente = iter.previous().toString();
		    //System.out.println(siguiente);
		    miList2.add(Integer.parseInt(siguiente));
		}
		
		System.out.println("Lista2 más Lista1 en orden inverso = "+ miList2);
		
		
		

	}

}
