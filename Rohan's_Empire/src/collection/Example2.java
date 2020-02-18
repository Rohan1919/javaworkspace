package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//import com.lti.objectclass.Person;

public class Example2 {
      	
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("harshal");
		p1.setAge(88);
		Person p2=new Person();
		p2.setName("ram");
		p2.setAge(88);
		
		
		List <Person> list= new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(new Person("Rohan",99));
		list.add(new Person("pavan",99));
		list.add(new Person("shubham",99));
		
		for(Person person:list){
			System.out.println(person.getName() + "   age is " +person.getAge());
		}

		for(Person person : list){
			System.out.println(person);
		}
		Set <Person> set= new HashSet<Person>();
		set.add(new Person("Rohan",99));
		set.add(new Person("pavan",99));
		set.add(new Person("shubham",99));
		set.add(new Person("Rohan",99));
		set.add(new Person("pavan",99));
		set.add(new Person("shubham",99));
		for(Person person : set){
			System.out.println(person);
		}
		
		
		
	}

}
