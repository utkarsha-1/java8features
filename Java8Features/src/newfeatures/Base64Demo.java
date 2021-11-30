package newfeatures;

import java.util.Base64;
import java.util.Scanner;



//Java Program to encrypt and decrypt data
public class Base64Demo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String userName,password;
		System.out.println("****Welcome here*****");
		System.out.println("****Enter your username*****");
		userName=s.next();
		System.out.println("****Enter your password*****");
		password=s.next();
		
		String encodedPassword=Base64.getEncoder().encodeToString(password.getBytes());
		
		System.out.println("Login Successful");
		System.out.println("Username:"+userName);
		System.out.println("Password:"+encodedPassword);
		System.out.println("***Decrypt th password***");
		//decode Base64 format to byte array
		String decodedPassword=new String (Base64.getDecoder().decode(encodedPassword));
		System.out.println("The password is: "+decodedPassword);
		System.out.println("****URL Encoding****");
		Base64.Encoder encoder=Base64.getUrlEncoder();
		String eUrl=encoder.encodeToString("https://www.coforge.com/industries/public-sector".getBytes());
		System.out.println("Encode URL: "+eUrl);

	}

}
