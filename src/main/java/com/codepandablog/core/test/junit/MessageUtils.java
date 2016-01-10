package com.codepandablog.core.test.junit;

public class MessageUtils {

	private String message;
	public MessageUtils() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageUtils(String message) {
		super();
		this.message=message;
	}
	
	public String salutationMessage(String name){
		return "Hi "+name;
	}
	
	/*public void printMessage(){
		System.out.println(message);
		while(true);
	}*/
	
	public void printMessage(){
		System.out.println(message);
		int a=0;
		int b=1/a;
	}
	
	public String salutationMessage(){
		System.out.println("Hi "+message);
		return "Hi "+message;
	}
}
