package week8;/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
   Lecturers: Dr. Tilman Dingler Prof. Rui Zhang
   Semester 1, 2020, Week 7
   Workshop sample solution
   Copyright The University of Melbourne 2020
*/

/* Sample solution for operations on an array
	Jianzhong Qi, 10 February 2016
*/

import java.awt.*;
import java.util.*;
import java.util.List;

public class ArrayOperator {
	private static int ARRAY_LENGTH = 10;

	public static void main(String[] args){
		int [] numbers = new int [ARRAY_LENGTH];

		// Read in the array from keyboard
		readArray(numbers);

		// Display an array
		display(numbers);

		// Get maximum value of an array
		int max = getMax(numbers);
		System.out.println("Max value is: " + max);

		// Get the sum of all elements in an array
		int sum = getSum(numbers);
		System.out.println("Sum is: " + sum);

		// Sort array elements in descending order
		sortArrayDescendingly(numbers);

		// Display an array
		display(numbers);

		// Find the element with the largest number of appearances
		// If there is a tie then return the smaller element

		List<Integer> result = getMostFrequent2(numbers);
		System.out.println(result);

	}















	public static void readArray(int[] array){
		System.out.print("Enter 10 integers: ");
		Scanner keyboard = new Scanner(System.in);

		for(int i = 0; i < array.length; i++){
			array[i] = keyboard.nextInt();
		}
	}





	public static void display(int[] array){
		System.out.print("Array: ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int getMax(int[] array){
		int tempMax = array[0];
		for(int i = 1; i < array.length; i++){
			if(tempMax < array[i]){
				tempMax = array[i];
			}
		}
		return tempMax;
	}

	public static int getSum(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return sum;
	}

	public static void sortArrayDescendingly(int[] array){
		int temp;
		int index;
		for(int i = 0; i < array.length; i++){
			// Find the i^th max
			temp = array[i];
			index = i;
			for(int j = i + 1; j < array.length; j++){
				if(temp < array[j]){
					temp = array[j];
					index = j;
				}
			}
			// Swap elements
			array[index] = array[i];
			array[i] = temp;
		}
	}

	public static int getMostFrequent1(int[] array){
		int mostFrequentNumber = array[0];
		int maxFrequency = 1;
		int i =1;

		while(i < array.length){
			if(array[i] == array[i-1]){
				maxFrequency ++;
				i++;
			}
			else{
				break;
			}
		}

		if(i == array.length){
			return array[0];
		}
		else{
			int curFrequency = 0;
			int curNum = array[i];
			while(i< array.length){
				if(array[i] != array[i-1]){
					curFrequency++;

				}
				else{
					if(curFrequency >= maxFrequency){
						maxFrequency = curFrequency;
						mostFrequentNumber = array[i-1];
					}
					curFrequency = 1;
					curNum = array[i];
				}
			}
		}
		return mostFrequentNumber;
	}



	public static List<Integer> getMostFrequent2(int[] array){
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for(int i =0; i< array.length; i++){
			if(map.containsKey(array[i])){
				int frequency = map.get(array[i]);
				int newFrequency = frequency+1;
				map.put(array[i],newFrequency);
			}
			else{
				map.put(array[i],1);
			}

		}

		int maxFrequency = 0;
		int mostFrequentNum = array[0];

		for(int i=0; i< array.length; i++){
			int curFrequency = map.get(array[i]);
			if(maxFrequency < curFrequency){
				list.clear();
				list.add(array[i]);
				maxFrequency = curFrequency;

			}
			else if(maxFrequency == curFrequency){
				if(array[i] < mostFrequentNum){
					list.add(array[i]);
				}
			}

		}
		return list;
	}





















	public static int getMostFrequent(int[] array){
		// Since the array is already sorted, same elements are next to each other.
		// We can scan the array once and count the element frequency during the scan
		int mostFrequentNumber = array[0];
		int maxFrequency = 1;
		int i = 1;

		// Assume that the first element is the most frequent element
		// Calculate its frequency
		while (i < array.length && array[i] == mostFrequentNumber) {
			i++;
			maxFrequency++;
		}

		if (i == array.length) {
			return mostFrequentNumber;
		}

		int currentNumber = array[i];
		int currentFrequency = 1;
		i++;
		while (i < array.length) {
			if (array[i] == currentNumber) {
				// Same number: simply increase the frequency count
				currentFrequency++;
			} else {
				// New number: update most frequent number
				if (currentFrequency >= maxFrequency) {
					maxFrequency = currentFrequency;
					mostFrequentNumber = currentNumber;
				}
				// Reset counter
				currentNumber = array[i];
				currentFrequency = 1;
			}
			i++;
		}
		// Test the frequency of the last number
		if (currentFrequency >= maxFrequency) {
			maxFrequency = currentFrequency;
			mostFrequentNumber = currentNumber;
		}

		return mostFrequentNumber;
	}






//	public static List<Integer> getMostFrequent1(int[] array){
//		List<Integer> result = new ArrayList<>();
//
//		Map<Integer,Integer> map = new HashMap<>();
//
//		for(int i =0; i < array.length; i ++){
//			if(map.containsKey(array[i])){
//				int curFrequency = map.get(array[i]);
//				int newFrequency = curFrequency+1;
//				map.put(array[i],newFrequency);
//			}
//			else{
//				map.put(array[i],1);
//			}
//		}
//
//		int mostFrequencyNum = array[0];
//		int maxFrequency = 0;
//		for(int j=0; j < array.length; j++){
//			int curFrequency = map.get(array[j]);
//			if(maxFrequency < curFrequency){
//				result.clear();
//				maxFrequency = curFrequency;
//				mostFrequencyNum = array[j];
//				result.add(mostFrequencyNum);
//			}
//			else if(maxFrequency == curFrequency){
//				result.add(array[j]);
//			}
//		}
//		return result;
//	}
















}
