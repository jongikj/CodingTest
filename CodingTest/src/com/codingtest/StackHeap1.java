package com.codingtest;

public class StackHeap1 {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		
		for(int i=0; i<prices.length; i++) {
			int cnt = 0;
			
			for(int j=i+1; j<prices.length; j++) {
				cnt++;
				if(prices[i] > prices[j]) { answer[i] = cnt; break; }
				
				answer[i] = cnt;
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.printf(answer[i] + " ");
		}
		
		return answer;
	}
	
//	public static void main(String[] args) {
//		StackHeap1 s = new StackHeap1();
//		int[] prices = {1, 2, 3, 2, 3};
//		s.solution(prices);
//	}
}
