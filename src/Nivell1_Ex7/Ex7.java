package Nivell1_Ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("john", 20);
		map.put("paul", 30);
		map.put("peter", 40);
		map.put("Antonio", 57);
		System.out.println("HashMap "+map);
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.putAll(map);
		System.out.println("treeMap -> HashMap ordenado: "+treeMap);
		//Aquí están las parejas ordenadas
		
		//Introducimos las parejas en un LinkedHAsMAp
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		//Recorremos el TreeMap anterior y vamos introduciendo las parejas en un LinkedHashMap
		Iterator<Entry<String, Integer>> iter = treeMap.entrySet().iterator();
		while (iter.hasNext()) {
		    //System.out.println(iter.next().getKey().toString());
			Map.Entry me = (Map.Entry) iter.next();
			
			lhm.put(me.getKey().toString(),Integer.parseInt(me.getValue().toString()));
		}
		System.out.println("lhm -> LinkedHashMap sigue ordenado: "+lhm);
		
		//Recorremos el LinkedHashMap para poner las claus  en un HashMAp
		//Recorremos el LinkedHashMap para poner las claus  en un LinkedHashSet
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Iterator<Entry<String, Integer>> iterLhm1 = lhm.entrySet().iterator();
		while (iterLhm1.hasNext()) {
		    //System.out.print(iterLhm.next().toString());
		   map1.put(iterLhm1.next().getKey().toString(), null);
		}
		System.out.println("map1 ->HashMap con sólo las claves: "+map1);
		
		
		LinkedHashMap<String, Integer> lhm1 = new LinkedHashMap<String, Integer>();
		Iterator<Entry<String, Integer>> iterLhm = lhm.entrySet().iterator();
		while (iterLhm.hasNext()) {
		    //System.out.print(iterLhm.next().toString());
		   lhm1.put(iterLhm.next().getKey().toString(), null);
		}
		
		System.out.println("lhm1 -> LinkedHashMap con sólo las claves: "+lhm1);
		
		System.out.println("LinkedHashMap mantiene el orden. ");
		System.out.println("HashMap no mantiene el orden. ");
		
		
		
		
		
		
	
		
	}

}
