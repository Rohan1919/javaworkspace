package banksol;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvToCollection {
	List<Complaints> complaints ;
	public int read(){
		int count=0;
	//ArrayList<Complaints> complaints = new ArrayList<Complaints>();
try{
	complaints = new ArrayList<Complaints>();
	BufferedReader br = new BufferedReader(new FileReader(new File("D:/complaints.csv")));
    String line;
	 while ((line = br.readLine()) != null) {

	    String[] entries = line.split(",");
	   complaints.add(new Complaints(entries[0],entries[1],entries[2],entries[3],entries[4],entries[5],entries[6],entries[7],entries[8],entries[9],entries[10],entries[11],entries[12],entries[13]));
	   count++;
	 }
	 
	/*for(Complaints c:complaints)
	 {
		 System.out.println(c.getDateRecieved());
	 }*/
}
	 catch(Exception e){
		 
	 }
	    
	  return count;

	    //complaints.add(complaints);
	}

	
	
  public void case1(String year){
	  for(Complaints comp:complaints){
		  if(comp.getDateRecieved().contains(year)){
			  System.out.println(comp.getCompany()+"\t\t"+comp.getComplaintId()+"\t\t "+comp.getCompanyResponse()+"\t\t"+comp.getConsumerDispute()+" "+comp.getDateSent()+" "+comp.getSubIssue()+" "+comp.getIssue()+" "+comp.getProduct()+" "+comp.getSubProduct()+" "+comp.getTimelyResponse() );
		     
		  }
	  }
	}



@Override
public String toString() {
	return "CsvToCollection [complaints=" + complaints + "]";
}




	
	
	
	
	
	

}
