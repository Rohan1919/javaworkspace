package date;



class Parent {
	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("hello");
	}
	{ System.out.print("1");  }

	public Parent(String greeting) { 
		System.out.print("2"); 
		}
	static {
		System.out.println("6");
	}
	}

class Child extends Parent {
	
	
	public Child() { System.out.println("hello child");
		
		
	}
	static {
		System.out.print("3"); 
		}
	
  	{  
		System.out.print("4"); 
		}
	public static void main(String[] args) {
		new Child();
	}
}