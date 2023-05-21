package com.takeuforward.sortingstepone;

import java.util.Arrays;

/**
 * Insertion Sort
 */
public class InsertionSort 
{
    public static void main( String[] args )
    {
        System.out.println( "Before Sorting" );
        int[] array= {5,1,0,3,7,8,2};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println( "After Sorting" );
        System.out.println(Arrays.toString(array));
    }

	private static void insertionSort(int[] array) {
		//keep moving element inside a sorted array
		int n = array.length;
		for(int i=1;i<=n-1;i++) {
			for(int j=i;j>0;j--) {
				//compare with new element
				if(array[j-1]>array[j]) {
					//swap and insert
					swap(array,j,j-1);
				}
			}				
		}		
	}
	private static void swap(int[] array,int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;		
	}    
}
