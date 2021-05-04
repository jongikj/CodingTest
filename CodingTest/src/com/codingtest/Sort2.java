package com.codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort2 {
	public String solution(int[] numbers) {
        String answer = "";

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        
        Collections.sort(list, (a, b) -> {
            String as = String.valueOf(a), bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });
                
        StringBuilder sb = new StringBuilder();
        
        for(Integer i : list) {
            sb.append(i);
        }
        
        answer = sb.toString();
        
        if(answer.charAt(0) == '0') {
            return "0";
            
        }else {
            return answer;
        }
    }
	
	public static void main(String[] args) {
		Sort2 s = new Sort2();
		int[] arr1 = {6, 10, 2};
		System.out.println(s.solution(arr1));
	}
}

//	[6, 10, 2]
//	 6 10 2 | 10 6 2 | 10 2 6 | 2 10 6 | 2 6 10 | 6 2 10
//   4! = 24