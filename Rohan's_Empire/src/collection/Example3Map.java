package collection;

import java.util.HashMap;
import java.util.Map;

public class Example3Map {
	 
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("192.168.12.1", "rohan");
		map.put("192.168.12.2", "mohan");
		map.put("192.168.12.3", "sohan");
		map.put("192.168.12.1", "sohan");
		System.out.println(map.get("192.168.12.1"));
		
	}

}
