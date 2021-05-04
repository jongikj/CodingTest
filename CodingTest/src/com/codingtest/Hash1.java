package com.codingtest;

import java.util.HashMap;

class Hash1 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String key : participant)
			map.put(key, map.getOrDefault(key, 0) + 1);
		
		for(String key : completion)
			map.put(key, map.get(key) - 1);
		
		for(String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer = key;
				break;
			}
		}
		
//		map.entrySet().stream().forEach(entry-> {
//			System.out.println("[key]:" + entry.getKey() + ", [value]:"+entry.getValue());
//		});
		
		return answer;
	}
}
	
//	public static void main(String[] args) {
//		Hash1 h = new Hash1();
//		
//		String[] participant1 = {"leo", "kiki", "eden"};
//		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
//		
//		String[] completion1 = {"eden", "kiki"};
//		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
//		String[] completion3 = {"stanko", "ana", "mislav"};
//		
//		h.solution(participant1, completion1);
//		h.solution(participant2, completion2);
//		h.solution(participant3, completion3);
//	}
//}
