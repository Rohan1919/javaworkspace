import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int marks;
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	Student(int rollno,String name,int marks){
		this.rollno=rollno;
		this.marks=marks;
		this.name=name;
	}

	@Override
	public int compareTo(Student o) {
		
		//return this.marks - o.marks;
		//return this.name.compareTo(o.name);
		int order=this.name.compareTo(o.name);
		if(order==0)
			order=this.marks-o.marks;
		    if(order ==0){
		    	order=this.rollno-o.rollno;
		    }
		 return order;   
	}
}

public class Example4 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(543, "Ram", 50));
		list.add(new Student(543, "Shyam", 30));
		list.add(new Student(543, "Sita", 40));
		list.add(new Student(543, "Gita", 20));
		
		Collections.sort(list);
		
		for(Student student: list)
		{
			System.out.println(student);
		}
	}

}
