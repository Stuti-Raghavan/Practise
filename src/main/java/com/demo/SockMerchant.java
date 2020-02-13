package com.demo;

import java.util.Arrays;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int getSockPairs(int n, int[] ar) {
		int pairs = 0;
		Arrays.sort(ar);
		for (int i = 0; i < n; i++) {
			if (i < n - 1 && ar[i] == ar[i + 1]) {
				pairs++;
				i++;
			}
		}
		return pairs;
	}


	public static void main(String[] args)  {

		int n = 9;
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int result = getSockPairs(n, ar);
		System.out.println("no of pairs: " + result);
	}
}
