
public class App {

	 public static void main(String args[])
	 {
		 String s;
		System.out.println("welcome to ghrawale");
		System.out.print("our consulting fee is ");
		Gharwale g=new Gharwale();
		ConsultingRequest r=new	ConsultingRequest(ConsultingType.MODULAR_KITCHEN,350);
		System.out.println(g.consultingFees(r)+ "  rs only");
		System.out.println();
	 }
}
