package date;

import java.time.LocalTime;

public class TimeCal {
	public void Name(String name)
	{
	  LocalTime time = LocalTime.now(); 
	  int x=time.getHour();
	  if(x>=5 && x<12)
	  {
		  System.out.println("good morning"+name);
	  }
	  else if(x>=12 && x<16){
		  System.out.println("good afternoon"+name);
		  
	  }
	  else if(x>=16 && x<21)
	  {
		  System.out.println("good evening"+name);
	  }
	  else
		  System.out.println("good night"+name);
	}
}