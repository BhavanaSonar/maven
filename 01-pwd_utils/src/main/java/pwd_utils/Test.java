package pwd_utils;

public class Test {
	public static void main(String[] args) {
		PasswordService p= new PasswordService();
		String name= p.encodepwd("Bhavana");
		System.out.println(name);
		
		String decodepwd = p.decodepwd(name);
		System.out.println(decodepwd);
		
	}

}
