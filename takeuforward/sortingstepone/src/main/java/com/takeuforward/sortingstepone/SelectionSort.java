package com.takeuforward.sortingstepone;

import java.util.Arrays;

/**
 * Selection Sort
 */
public class SelectionSort 
{
    public static void main( String[] args )
    {
        System.out.println( "Before Sorting" );
        int[] array= {5,1,0,3,7,8,2};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println( "After Sorting" );
        System.out.println(Arrays.toString(array));
    }

	private static void selectionSort(int[] array) {
		//select the minimum and sort it
		int n = array.length;
		for(int i=0;i<=n-2;i++) {
			//suppose this element is minimum(index)
			int min = i;
			for(int j=i;j<=n-1;j++) {
				//compare with minimum
				if(array[j]<array[min]) {
					//the new minimum
					min=j;
				}
			}
			//swap minimum with current
			swap(array,i,min);
		}		
	}
	private static void swap(int[] array,int i, int min) {
		int temp = array[i];
		array[i] = array[min];
		array[min] = temp;		
	}    
}
