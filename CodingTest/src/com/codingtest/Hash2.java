package com.codingtest;

import java.util.HashMap;

public class Hash2 {
	public boolean solution(String[] phone_book) {
        HashMap<String, String> map = new HashMap<>();

        for(String phone : phone_book) 
        	map.put(phone, "");
        
        for(String phone : map.keySet()) {
        	for(int i=0; i<phone.length(); i++) {
        		if(map.containsKey(phone.substring(0, i)))
        			return false;
        	}
        }
        
        return true;
    }
	
//	public static void main(String[] args) {
//		Hash2 h = new Hash2();
//		String[] phone_book1 = {"119", "97674223", "1195524421"};
//		String[] phone_book2 = {"123","456","789"};
//		String[] phone_book3 = {"12","123","1235","567","88"};
//		
//		h.solution(phone_book3);
//	}
}
