package test;

import pwd_utils.PasswordService;

public class Demo1 {
	public static void main(String[] args) {
		PasswordService p= new PasswordService();
		String encodepwd=p.encodepwd("Nashik");
		System.out.println(encodepwd);
		
		String decodepwd = p.decodepwd(encodepwd);
		System.out.println(decodepwd);
		
	

	}

}
