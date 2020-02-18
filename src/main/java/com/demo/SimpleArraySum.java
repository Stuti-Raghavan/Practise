package com.demo;

public class SimpleArraySum {

	 /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        int sum=0;
        for (int i =0; i<ar.length;i++){
            sum+=ar[i];
        }
        return sum;
    }


    public static void main(String[] args)  {

        int[] ar = {1,2,3,4,10,11};
        int result = simpleArraySum(ar);
        System.out.println("Sum of Array: "+result);

    }
}
