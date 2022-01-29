package Nivell1_Ex4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UsoIteradora {

	public static void main(String[] args) {
		
		Iteradora miIteradora = new Iteradora();
		
		ArrayList<String> miarrayList = new ArrayList<String>();
		LinkedList<Integer> milinkedList = new LinkedList<Integer>();
		Set<Double> miset = new HashSet<Double>();
		LinkedHashSet<String> milinkedHashSet = new LinkedHashSet<String>();
		TreeSet<Integer> misortedSet = new TreeSet<Integer>();
		
		miarrayList.add("mario");
		miarrayList.add("Juan");
		miIteradora.imprime(miarrayList);
		
		milinkedList.add(1);
		milinkedList.add(5);
		miIteradora.imprime(milinkedList);
		
		miset.add(1.5);
		miset.add(5.25);
		miIteradora.imprime(miset);
		
		milinkedHashSet.add("Antonio");
		milinkedHashSet.add("SanPedro");
		miIteradora.imprime(milinkedHashSet);
		
		misortedSet.add(1);
		misortedSet.add(100);
		misortedSet.add(5);
		misortedSet.add(2);
		miIteradora.imprime(misortedSet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
