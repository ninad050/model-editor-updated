package com.eca.cme.entities;

public class CustomFile {
	 private final String name;
	 private final String content;
	 
	  public CustomFile(String name, String content) {
	        this.name = name;
	        this.content = content;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getContent() {
	        return content;
	    }

}
