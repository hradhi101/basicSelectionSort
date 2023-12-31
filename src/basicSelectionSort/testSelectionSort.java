package basicSelectionSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {

	@Test
	public void Test() {
			//testPositive();
			//testNegative();
			//testMixed();
			testDuplicates();
		}
		public testSelectionSort() {
	    }
		public void testPositive(){
			SelectionSort selectionSortion = new SelectionSort();
			
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
	        
	      assertArrayEquals(Sortedarr, selectionSortion.basicSelectionSort(arr));
		}
		
	    public void testNegative(){
	    	SelectionSort selectionSortion = new SelectionSort();
	    	
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
	    	
	    	assertArrayEquals(Sortedarr, selectionSortion.basicSelectionSort(arr));
	    }
	   
	    public void testMixed(){
	    	SelectionSort selectionSortion = new SelectionSort();
	    	
		    int[] arr = new int[5];
		    arr[0] = -8;
		    arr[1] = 9;
		    arr[2] = 7;
		    arr[3] = -10;
		    arr[4] = -2;
		    
		    int[] Sortedarr = new int[5];
	        Sortedarr[0] = -10;
	        Sortedarr[1] = -8;
	        Sortedarr[2] = -2;
	        Sortedarr[3] = 7;
	        Sortedarr[4] = 9;
		    
		   assertArrayEquals(Sortedarr, selectionSortion.basicSelectionSort(arr));
	    }
		    
		public void testDuplicates(){
			SelectionSort selectionSortion = new SelectionSort();
			
			int[] arr = new int[5];
			arr[0] = -8;
			arr[1] = -8;
			arr[2] = 7;
			arr[3] = 7;
			arr[4] = -7;
			
			int[] Sortedarr = new int[5];
	        Sortedarr[0] = -8;
	        Sortedarr[1] = -8;
	        Sortedarr[2] = -7;
	        Sortedarr[3] = 7;
	        Sortedarr[4] = 7;
			
			assertArrayEquals(Sortedarr, selectionSortion.basicSelectionSort(arr));
		}
			
	
	}

