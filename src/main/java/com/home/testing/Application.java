package com.home.testing;

import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words){
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
		}
    
    public Application() {
       System.out.println ("Hello world!F");
		
		
    }

   
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
		//app.greet();
		int count = app.countWords("Creating my first maven project");
		System.out.println("Word count: " + count);
    }
}