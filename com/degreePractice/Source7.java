package com.degreePractice;
import java.util.regex.Pattern;

class Email {
	public String body;
	public String greetings;
	Header header;
	
	public Email(Header header, String body, String greetings) {
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
}

class Header {
	public String from;
	public String to;
	
	public Header(String from, String to) {
		this.from = from;
		this.to = to;
	}
}

class EmailOperations {
	
	public int emailVerify(Email e) {
		int count = 0;
		
		Pattern regex = Pattern.compile("^[a-zA-Z_]+@([a-zA-Z]+\\.)+[a-zA-Z]{2,6}$");
		
		if ((regex.matcher(e.header.from)).matches()) {
			count++;
		}
		if ((regex.matcher(e.header.to)).matches()) {
			count++;
		}
		return count;
	}
	
	
	public String bodyEncryption(Email e) {
		String body = e.body;
		String caesarCipher = "";
		
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int i = 0; i < body.length(); i++) {
			
			if (body.charAt(i) == ' ') {
				caesarCipher += ' ';
			}
			else if (Character.isLowerCase(body.charAt(i))) {
				int value = lowerCase.indexOf(body.charAt(i));
				caesarCipher += lowerCase.charAt((value + 3)%26);
			}
			else {
				int value = upperCase.indexOf(body.charAt(i));
				caesarCipher += upperCase.charAt((value + 3)%26);
			}
		}
		return caesarCipher;
	}
	
	public String greetingMessage(Email e) {
		String greetings = e.greetings;
		String name = e.header.from;
		
		int position = name.indexOf('@');
		
		return greetings+" "+name.substring(0,position);
	}
}

public class Source7 {

	public static void main(String[] args) throws Exception {
		Header header = new Header("abcde@gmail.com", "_abcde@gmail.com");
		Email e = new Email(header, "Hi There Hows you", "Good Morning");
		
		EmailOperations eo = new EmailOperations();
		System.out.println(eo.emailVerify(e));
		System.out.println(eo.bodyEncryption(e));
		System.out.println(eo.greetingMessage(e));
	}
}
