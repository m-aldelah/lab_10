package lab10;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        /** add tests to check for this unit test **/
        assertTrue("First sorted value is 2", arr[0] == Sortedarr[0]);
        assertTrue("Second sorted value is 7", arr[1] == Sortedarr[1]);
           
    }
    
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        /** Test data contains negative values only **/
        assertTrue("First sorted value is -10", arr[0] == Sortedarr[0]);
        assertTrue("Second sorted value is -9", arr[1] == Sortedarr[1]);
       
    }
    
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -2;
        arr[1] = -1;
        arr[2] = 0;
        arr[3] = 15;
        arr[4] = 8;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -1;
        Sortedarr[2] = 0;
        Sortedarr[3] = 8;
        Sortedarr[4] = 15;
        
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        /** Test data contains with both positive, negative and zeros **/
        assertTrue("First sorted value is -2", arr[0] == Sortedarr[0]);
        assertTrue("Second sorted value is -1", arr[1] == Sortedarr[1]);
        
    }
    
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = -9;
        arr[1] = -9;
        arr[2] = 0;
        arr[3] = 10;
        arr[4] = 10;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -9;
        Sortedarr[2] = 0;
        Sortedarr[3] = 10;
        Sortedarr[4] = 10;
        
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        /** Test data contains duplicates **/
        assertTrue("First sorted value is -9", arr[0] == Sortedarr[0]);
        assertTrue("Second sorted value is -9", arr[1] == Sortedarr[1]);
       
    }


}
