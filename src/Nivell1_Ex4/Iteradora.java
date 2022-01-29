package Nivell1_Ex4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Iteradora {

	public Iteradora() {};

	public void imprime(ArrayList lista) {
		System.out.println(lista.getClass());
		Iterator iter = lista.iterator();
		while (iter.hasNext()) {
		    System.out.println(iter.next().toString());
		}
	}
	public void imprime(LinkedList lista) {
		System.out.println(lista.getClass());
		Iterator iter = lista.iterator();
		while (iter.hasNext()) {
		    System.out.println(iter.next().toString());
		}
	}
	public void imprime(Set lista) {
		System.out.println(lista.getClass());
		Iterator iter = lista.iterator();
		while (iter.hasNext()) {
		    System.out.println(iter.next().toString());
		}
	}
	public void imprime(LinkedHashSet lista) {
		System.out.println(lista.getClass());
		Iterator iter = lista.iterator();
		while (iter.hasNext()) {
		    System.out.println(iter.next().toString());
		}
	}

}

