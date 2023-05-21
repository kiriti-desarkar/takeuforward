package com.takeuforward.sortingsteptwo;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
        System.out.println( "Before Sorting" );
        int[] array= {5,1,0,3,7,8,2};
        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println( "After Sorting" );
        System.out.println(Arrays.toString(array));

	}

	private static void quickSort(int[] array, int low, int high) {
		if(low<high) {
		int pivot = pivotSort(array,low,high);
		quickSort(array,low,pivot-1);
		quickSort(array,pivot+1,high);
		}
	}

	private static int pivotSort(int[] array, int low, int high) {
		int pivot = array[low];
		int i = low;
		int j = high;
		while(i<j) {
			while(array[i]<=pivot && i<=high-1) {
				i++;
			}
			while(array[j]>pivot && j>=low+1) {
				j--;
			}
			if(i<j) {
				swap(array,i,j);
			}			
		}
		swap(array,low,j);		
		return j;
	}
	private static void swap(int[] array,int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;		
	}    
}
