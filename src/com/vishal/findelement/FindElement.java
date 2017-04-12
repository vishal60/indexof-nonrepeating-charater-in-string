package com.vishal.findelement;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class FindElement {
	private static String s;
	private static LinkedHashSet<Character> ts;	

	public static Character nonRepeatingCharAt(String str, int index){
		s = str;
		ts = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			if(ts.contains(s.charAt(i)))
				ts.remove(s.charAt(i));
			else
				ts.add(s.charAt(i));
		}
		Iterator<Character> itr = ts.iterator();
				
		int i = 1;
		while(itr.hasNext() && i<index){
			itr.next();
			i++;
		}		
		return itr.next();
		
	}
}
