package com.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	  // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char u='U';
        char d='D';
        int level=0;
        int valleys=0;
        char steps[]=s.toCharArray();

                for(int i=0; i<n; i++){
            if(steps[i]==u){
                level++;
            }else{
                level--;
                if(level==-1){
                valleys++;
            }
            }
            
        }
        return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = 8;
        String s="UDDDUDUU";
		int result = countingValleys(n, s);
		System.out.println("number of valleys: "+ result);
    }
}
