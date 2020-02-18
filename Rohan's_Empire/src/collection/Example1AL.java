package collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example1AL {
	
	public static void main(String[] args) {
		//angular brackets notation <>is referred  to as a generic in java
		List <String> list1=new ArrayList<String>();
		//List <String> list1=new LinkedList<String>();
		list1.add("java");
		list1.add("oracle");
		list1.add(".net");
		list1.add("python");
		list1.add("java");
		
		//tradotional for loop
		for(int i=0;i<list1.size();i++)
		{
			//String str=list1.get(i);
			System.out.println(list1.get(i));
			System.out.println(list1);
		}
		//for each loop
		for(String p:list1)
		{
			System.out.println(p);
		}
		
		//labda type for-each
		list1.forEach(str-> System.out.println(str) );
		
		//using iterator approach
		Iterator<String> itr= list1.iterator();
		while(itr.hasNext()) 
		{
			String str=itr.next();
			System.out.println(str);
		}
		
	}

}
