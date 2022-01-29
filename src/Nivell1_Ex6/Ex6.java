package Nivell1_Ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex6 {

	public static void main(String[] args) {
		
		List<Integer> myList = new LinkedList<Integer>();
		int size = myList.size();
						
		for(int i = 1; i<=10; i++) {
			if(size==0) {}
			else if(size%2 == 0) {
				size = size/2;
				}else {
					size=(size/2)+1;
				}
		myList.add(size, i);
		size = myList.size();
		}
	
		System.out.println(myList);
	}

}
