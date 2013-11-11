package com.mycompany;

import org.apache.camel.Body;


public class JpaBean {
	
	public String saveEntity(@Body String requestString){
		if(requestString != null){
			System.out.println("Lets see if this w1orks");
			
		}
		return requestString;
	}

}
