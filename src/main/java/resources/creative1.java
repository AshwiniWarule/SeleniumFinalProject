package resources;

import java.util.Random;

public class creative1 {
	public  static String generateemail() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";    //random email getSaltString()+"@gmail.com"
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String email = salt.toString()+"@gmail.com";
		System.out.println(email+"@gmail.com");
		return email;
	}
	public static void main(String[] args) {
	    String generatedEmail = generateemail();
	    System.out.println(generatedEmail);
	}



	}


