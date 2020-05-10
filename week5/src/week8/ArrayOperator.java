/*
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

import java.util.Scanner;

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
		int mostFrequent = getMostFrequent(numbers);
		System.out.println("Most frequent value is: " + mostFrequent);
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
}
