package testProject;

import java.util.Arrays;

public class CountBetween {
	public static void main(String[] args) {
		
        int[] arr = {1, 0, 0};
        int[] low = {0, 2};
        int[] high = {8, 8};
        Arrays.sort(arr);
        int[] results = countBetween(arr, low, high);
        System.out.println(Arrays.toString(results));
    }	
	
	public static int getUpperIndex(int[] arr, int n, int y) {
	    int left = 0;
	    int right = n-1;
	    while (left <= right) {
	        int mid = (left + right) / 2;
	        if (arr[mid] <= y) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return right;
	}

	public static int getLowerIndex(int[] arr, int n, int x) {
	    int left = 0;
	    int right = n-1;
	    while (left <= right) {
	        int mid = (left + right) / 2;
	        if (arr[mid] >= x) {
	            right = mid - 1;
	        } else {
	            left = mid + 1;
	        }
	    }
	    return left;
	}

	public static int[] countBetween(int[] arr, int[] low, int[] high) {
	    Arrays.sort(arr);
	    int n = arr.length;
	    int[] results = new int[2];
	    results[0] = getUpperIndex(arr, n, low[1]) - getLowerIndex(arr, n, low[0]) + 1;
	    results[1] = getUpperIndex(arr, n, high[1]) - getLowerIndex(arr, n, high[0]) + 1;
	    
	    
	    return results;
	}

}
