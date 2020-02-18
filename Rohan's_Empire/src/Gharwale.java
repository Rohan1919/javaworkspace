
public class Gharwale {
	private int modularKitchenConsultingFees=2000;
	private int flooringAndCeilingConsultingFees=1500;
	private int fullHomeRenovationConsultingFees=2500;
	
	/*public double consultingFees(ConsultingType type)
	{ double a=0;
	  switch(type)
	  {
	   case MODULAR_KITCHEN:
		   a=modularKitchenConsultingFees;
		   break;
	   case FLOORING_AND_CEILING:
		  a=flooringAndCeilingConsultingFees;
		  break;
	   case FULL_HOME_RENOVATION:
		 a=fullHomeRenovationConsultingFees;
		 break;
	   default:
			  System.out.println("sorry unable to process");
			  break;
			  
	  }
	  return a;
	}*/
	public int consultingFees(ConsultingRequest request)
	{  int a=0;
		 switch(request.getType())
		  {
		   case MODULAR_KITCHEN:
			   a=request.getArea()*modularKitchenConsultingFees;
			   break;
		   case FLOORING_AND_CEILING:
			  a=request.getArea()*flooringAndCeilingConsultingFees;
			  break;
		   case FULL_HOME_RENOVATION:
			 a=request.getArea()*fullHomeRenovationConsultingFees;
			 break;
		   default:
				  System.out.println("sorry unable to process");
				  break;
				  
		  }
		  return a;
	
	}

}
