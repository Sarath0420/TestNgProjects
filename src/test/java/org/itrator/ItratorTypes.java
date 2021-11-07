package org.itrator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ItratorTypes
{
	//Enumarator
	// athavthu normal ah for and enhanced for loop than pannuvom, but athukku munnadi ithan use pannananga
	// Enumarator, Itrator and List Itrator
public static void main(String[] args)
{
	Vector<String> v = new Vector<String>();
	
	v.add("a");
	v.add("b");
	v.add("c");
	v.add("d");
	
	// so ipo enumrator call pana athoda method eduthu call pannanum
	
	Enumeration<String> elements = v.elements();
	
	// while use panni value ah get pannanum
	
	while (elements.hasMoreElements())
	{
		// Typecasting for getting elements
		
		String text = (String) elements.nextElement();
		System.out.println(text);
	}
	System.out.println();
	
	// Iterator
	// Athavathu Ithula ella collection um use panna mudiyum and namakku thevaiyanathai remove panikalam
	
	Iterator<String> iterator = v.iterator();
	
	while (iterator.hasNext())
	{
		String string = (String) iterator.next();
//		if (string.equals("b"))
//		{
//			iterator.remove();
//		}
	}
	System.out.println(v);
	
	// List Iterator
	
	ListIterator<String> listIterator = v.listIterator();
	
	while (listIterator.hasNext())
	{
		String string = (String) listIterator.next();
		System.out.println(string);
	}
	System.out.println();
	while (listIterator.hasPrevious())
	{
		String string1 = (String) listIterator.previous();
		System.out.println(string1);
		
	}
}
}