package cmpte2e.e2e;

import java.util.Base64;

public class password {
	
	public static void main(String[] args) {

		String encrptData= "Priyanka@22";
				
		byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());
				
		System.out.println("encodedBytes --------------->" + new String(encodedBytes));

		}
			
			
	}

