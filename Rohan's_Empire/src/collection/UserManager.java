package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class UserManager {
	
	private Map<String,String> users;
	public UserManager() {
		
		users=new HashMap<>();
		users.put("rohan", "123");
		users.put("mohan", "423");
		users.put("sohan", "923");
		users.put("majrul", "823");
	
	}
	public boolean isValidUser(String username,String password){
		if(users.containsKey(username)){
		    if( users.get(username).equals(password)){
			     return true;
		     }
		    else{
			     return false;
		     }
		}else{
			return false;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username and password");
		String username=sc.next();
		String password=sc.next();
		
		UserManager mgr=new UserManager();
		boolean isValid=mgr.isValidUser(username, password);
		if(isValid)
		{
			System.out.println("congrats you have login successfully");
		}
		else
		{
			System.out.println("invalid username and password");
		}
		
	}

}
