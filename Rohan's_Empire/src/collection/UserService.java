package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
	
	private List<User> users;
	public UserService() {
		
	 users =new ArrayList<>();
	users.add(new User("rohan", "123",false));
	users.add(new User("mohan", "423",true));
	users.add(new User("sohan", "923",true));
	users.add(new User("majrul", "823",false));
	
	}
	
	public boolean isValidUser(String username,String password){
		for(User i :users){
		if(i.getUsername().equals(username) && i.getPassword().equals(password) && i.isAllowed()){
			return true;
			
		}
		}	
		return false;
		
	}
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username and password");
		String username=sc.next();
		String password=sc.next();
		
		UserService mgr=new UserService();
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
