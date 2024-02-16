package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(909,"Fenil");
		hm.put(667,"Pradeep");
		hm.put(112,"Nirupa");
		hm.put(453,"Bhoomika");
		hm.put(987,"Brijesh");
		hm.put(457,"Shraddha");
		hm.put(356,"Deepa");
		hm.put(909,"Pradeep");
		System.out.println(hm);
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
	}
}
