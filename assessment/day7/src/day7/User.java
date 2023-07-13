package day7;

import java.util.HashMap;
import java.util.Map;

public class User implements IValidate {
	
	private String userid;
	private String password;
	
	private static Map<String, String> mp = new HashMap<>();
	
	public void addUser(String userid, String password) {
		
		if(mp.containsKey(userid))
			System.out.println("User is already exists");
		else
			mp.put(userid, password);
	}
	
	public boolean IsAuthenticated(String userid,String password) {
		if(mp.get(userid).equals(password))
			return true;
		else
			return false;
	}
}
