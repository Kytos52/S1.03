package Nivell1_Ex8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;

public class Ex8 {

	public static void main(String[] args) {
		
		//LinkedHashMap amb claus de tipus String i objectes del tipus Persona 
		LinkedHashMap<String, Persona> lhm = new LinkedHashMap<String, Persona>();
		lhm.put("alumno3", new Persona("Mario",52,123456789));
		lhm.put("alumno2", new Persona("Atonio",42,223456789));
		lhm.put("alumno1", new Persona("Luis",32,323456789));
		lhm.put("alumno5", new Persona("Zebulón",22,423456789));
		lhm.put("alumno4", new Persona("Mackei",12,523456789));
		
		System.out.println("Contenido inicial del LinkedHashMap:");
		Iterator<Entry<String, Persona>> iterLhm = lhm.entrySet().iterator();
		while (iterLhm.hasNext()) {
		   System.out.println(iterLhm.next().toString());
		}
		
		class alumno {
			String id;
			Object al;
			public alumno(String id, Object al) {
				this.id = id;
				this.al = al;
			}
			@Override
			public String toString() {
				return "alumno [id=" + id + ", al=" + al + "]";
			}
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public Object getAl() {
				return al;
			}
			public void setAl(Object al) {
				this.al = al;
			}
			
			
		}
		
		ArrayList <alumno> listado = new ArrayList<alumno>();
		
		
		Iterator<Entry<String, Persona>> iter = lhm.entrySet().iterator();
		while (iter.hasNext()) {
		    //System.out.println(iter.next().getKey().toString());
			Map.Entry me = (Map.Entry) iter.next();
			
			listado.add(new alumno(me.getKey().toString(), me.getValue()));
		}
		
		
		System.out.println("ArrayList antes de ordenar: ");
		//System.out.println(listado);
		for (int i = 0; i<listado.size();i++) {
			System.out.println(listado.get(i));
		}
		
		
		
		Collections.sort(listado,new  Comparator<alumno>(){

			@Override
			public int compare(alumno a1, alumno a2) {
				// TODO Auto-generated method stub
				
					return a1.getId().compareTo(a2.getId());
		        
			}
		});	
		
		System.out.println("ArrayList después de ordenar: ");
		//System.out.println(listado);
		for (int i = 0; i<listado.size();i++) {
			System.out.println(listado.get(i));
		}
	}
}
