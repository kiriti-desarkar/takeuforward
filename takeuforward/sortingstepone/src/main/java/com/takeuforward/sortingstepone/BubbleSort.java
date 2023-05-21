package com.takeuforward.sortingstepone;

import java.util.Arrays;

/**
 * Bubble Sort
 */
public class BubbleSort 
{
    public static void main( String[] args )
    {
        System.out.println( "Before Sorting" );
        int[] array= {5,1,0,3,7,8,2};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println( "After Sorting" );
        System.out.println(Arrays.toString(array));
    }

	private static void bubbleSort(int[] array) {
		//keep swapping to bubble the largest
		int n = array.length;
		for(int i=0;i<=n-2;i++) {
			//if no swaps happened stop already sorted
			boolean isSwapped = false;
			for(int j=1;j<=n-i-1;j++) {
				//compare with previous element
				if(array[j-1]>array[j]) {
					//swap if out of order
					swap(array,j-1,j);
					isSwapped = true;
				}
			}
			if(!isSwapped) {
				break;
			}			
		}		
	}
	private static void swap(int[] array,int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;		
	}    
}
