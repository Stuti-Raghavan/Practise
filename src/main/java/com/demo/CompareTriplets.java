package com.demo;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {


	    // Complete the compareTriplets function below.
	    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	        List<Integer> comparisonList=new ArrayList<>();
	        int alicePoints=0;
	        int bobPoints=0;
	        for(int i =0; i<a.size();i++){
	            if(a.get(i)>b.get(i)){
	                alicePoints++;
	            }else if(a.get(i)<b.get(i)){
	                bobPoints++;
	            }
	        }
	        comparisonList.add(alicePoints);
	        comparisonList.add(bobPoints);

	        return comparisonList;

	    }

	    public static void main(String[] args)  {


	        List<Integer> alice = new ArrayList<>();
	        List<Integer> bob = new ArrayList<>();
	        
	        alice.add(17);
	        alice.add(28);
	        alice.add(30);
	        
	        bob.add(99);
	        bob.add(16);
	        bob.add(8);
	        List<Integer> result = compareTriplets(alice, bob);
	        
	        System.out.println("comparison list: "+result);

	    }

}
