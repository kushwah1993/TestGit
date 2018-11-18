package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Sort{

	public static void main(String[] args){
		
		List<String> list = new ArrayList<String>();
		list.add("Ssfsdf");
		list.add("fh");
		list.add("ehdgfhfsdf");
		list.remove("");
		//Collections.reverse(list);
		for(String s:list)
			System.out.println(s);
		
		Iterator<String> obj = list.iterator();
		while(obj.hasNext())
			System.out.println(obj.next());
		
		Enumeration<String> enums = Collections.enumeration(list);
		while(enums.hasMoreElements())
			System.out.println(enums.nextElement());
		
		
		
		
	}
}
