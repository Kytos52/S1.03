package Nivell1_Ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UsoGeneradora {

	public static void main(String[] args) {
		
		Generadora miGeneradora = new Generadora();
		System.out.println(miGeneradora.seguentPersonatje());
		System.out.println(miGeneradora.seguentPersonatje());
		System.out.println(miGeneradora.seguentPersonatje());
		System.out.println(miGeneradora.seguentPersonatje());
		
		ArrayList<String> arrayListPersonatges = new ArrayList<String>();
		LinkedList<String> linkedListPersonatges = new LinkedList<String>();
		Set<String> setPersonatges = new HashSet<String>();
		LinkedHashSet<String> linkedHashSetPersonatges = new LinkedHashSet<String>();
		TreeSet<String> sortedSet = new TreeSet<String>();
		
		String person;
		for (int i = 0; i<=7; i++) {
			person = miGeneradora.seguentPersonatje();
			arrayListPersonatges.add(person);
			linkedListPersonatges.add(person);
			setPersonatges.add(person);
			linkedHashSetPersonatges.add(person);
			sortedSet.add(person);
		}
		
		System.out.print("arrayListPersonatges ");
		System.out.println(arrayListPersonatges);
		System.out.print("linkedListPersonatges ");
		System.out.println(linkedListPersonatges);
		System.out.print("setPersonatges ");
		System.out.println(setPersonatges);
		System.out.print("linkedHashSetPersonatges ");
		System.out.println(linkedHashSetPersonatges);
		System.out.print("sortedSet ");
		System.out.println(sortedSet);
		
	}

}
