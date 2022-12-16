package com.prowings.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> num=new CopyOnWriteArrayList<>();
		Iterator  itr=num.iterator();
		num.add(4);
		while(itr.hasNext()) {
			itr.remove();
			System.out.println(itr.next());
		}
		itr=num.iterator();
		while(itr.hasNext()) { 
		System.out.println(itr.next());
		}
		System.out.println(num);
	}

}
