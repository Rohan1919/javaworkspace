package com.lti.StringClass;

public class Stringham {
	public static void main(String[] args) {
		String s="hello this is rohan";
		System.out.println(s.charAt(0));
		
		String str1="java";
		String str2="java";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		String str3=new String("java");String str4=new String("java");
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		System.out.println(str1);
		System.out.println(str2.hashCode());
		 System.out.println(str3.hashCode());
		 System.out.println(str4.hashCode());
		 //System.out.println(str3.hashCode());
		 //System.out.println(str4.hashCode());
		 String str5="JAVA";
		 String str6=str1.toUpperCase().intern();
		 System.out.println(str5==str6);
		 //some logic using string concatenation
		 String st1="asdfhjklzxvcnvmbpworiuyiwyririr12345678890";
		 String st2="";
		 long ns1=System.nanoTime();
		 for(int i=0;i<st1.length();i++)
		 {
			 for(int j=0;j<=i;j++)
			 {
				 st2=st2+st1.charAt(j);
			 }
			 }
		 long ns2=System.nanoTime();
		 System.out.println(st2);
		 System.out.println("approx time taken : "+(ns2-ns1)+" nanosecond");
		 
		 //Second version --using StringBuffer
		 StringBuffer sbf=new StringBuffer();
		 long ns13=System.nanoTime();
		 for(int i=0;i<st1.length();i++)
		 {
			 for(int j=0;j<=i;j++)
			 {
				 sbf.append(st1.charAt(j));
			 }
			 }
		 long ns24=System.nanoTime();
		 System.out.println(sbf);
		 System.out.println("approx time taken : "+(ns24-ns13)+" nanosecond");
		 
		 ///StringBuilder
		 
		 StringBuilder sbfb=new StringBuilder();
		 long ns133=System.nanoTime();
		 for(int i=0;i<st1.length();i++)
		 {
			 for(int j=0;j<=i;j++)
			 {
				 sbfb.append(st1.charAt(j));
			 }
			 }
		 long ns244=System.nanoTime();
		 System.out.println(sbf);
		 System.out.println("approx time taken : "+(ns244-ns133
				 )+" nanosecond");
		 
		 
	}

}
