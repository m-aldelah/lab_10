package lab10;

public class SelectionSort {
	 private int temp;

		/** Creates a new instance of SelectionSort */
	    public SelectionSort() {
	    }
	    
	     int[] basicSelectionSort(int arr[]) {
	    	int i;
	    	int j;
	    	int min_m;
	        for (i = 0; i < arr.length-1; i++) 
	        {
	        	min_m = i;
	            for (j= i+1; j < arr.length; j++) {
	                if (arr[j] < arr[min_m]) {
	                    min_m =j;
	                    int temp;
	                    temp = arr[min_m];
	                    arr[min_m]=arr[i];
	                    arr[i]=temp;
	                }
	            } // end of inner for loop
	        } // end of outer for loop
	        return arr;
	    } // end of basicSelectionSort method



}
