package com.codingtest;

public class StackHeap2 {
	public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        while(true) {
        	
        	for(int i=0; i<progresses.length; i++) {
        		if(progresses[i] >= 100) {
        			continue;
        		} else {
        			progresses[i] += speeds[i];
        		}
        	}
        	
    		break;
        }
        
        return answer;
    }
    
//    public static void main(String[] args) {
//    	StackHeap2 s = new StackHeap2();
//        int[] progresses1 = {93, 30, 55};
//        int[] speeds1 = {1, 30, 5};
//        
//        int[] progresses2 = {95, 90, 99, 99, 80, 99};
//        int[] speeds2 = {1, 1, 1, 1, 1, 1};
//        
//        s.solution(progresses1, speeds1);	// [2, 1]
//	    s.solution(progresses2, speeds2);	// [1, 3, 2]
//    }
}
