package com.takeuforward.sortingsteptwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
        System.out.println( "Before Sorting" );
        int[] array= {5,1,0,3,7,8,2};
        System.out.println(Arrays.toString(array));
        mergeSort(array,0,array.length-1);
        System.out.println( "After Sorting" );
        System.out.println(Arrays.toString(array));

	}
	
	private static void mergeSort(int[] array, int low, int high) {
		if(low >= high) {
			return; 
		}
		int mid = (low+high)/2;
		mergeSort(array,low,mid);
		mergeSort(array,mid+1,high);
		merge(array,low,high,mid);		
	}

	private static void merge(int[] array, int low, int high, int mid) {
		List<Integer> temp=new ArrayList<>();
		int left=low;
		int right=mid+1;
		while(left<=mid && right<=high) {
			if(array[left]<=array[right]) {
				temp.add(array[left]);
				left++;
			} else {
				temp.add(array[right]);
				right++;				
			}
		}
		while(left<=mid) {
			temp.add(array[left]);
			left++;
		}
		while(right<=high) {
			temp.add(array[right]);
			right++;
		}
		
		for(int i = low;i<=high;i++) {
			array[i+low]=temp.get(i);
		}
	}

}
