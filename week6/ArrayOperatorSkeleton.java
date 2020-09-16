package week6;/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
   Lecturer: Dr Tilman Dingler, Dr Thuan Pham
   Semester 2, 2020, Week 6
   Workshop Sample Solution
   Copyright The University of Melbourne 2020
*/

/* Skeleton code for operations on an array
	Jianzhong Qi, 10 February, 2016
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayOperatorSkeleton {
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

	private static int getMostFrequent(int[] numbers) {
//		Map<Integer,Integer> map = new HashMap<>();
//		map.put(key,value);
//		map.get(key)

		int mostFrequentElement = numbers[0];
		int maxFrequency = 0;
		int curElement = numbers[0];
		int curFrequency = 0;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] == curElement){
				curFrequency++;
			}
			else{
				if(curFrequency >= maxFrequency){
					mostFrequentElement = curElement;
					maxFrequency = curFrequency;
				}
				curElement = numbers[i];
				curFrequency = 1;
			}
		}
		if(curFrequency >= maxFrequency){
			mostFrequentElement = curElement;
		}
		return mostFrequentElement;
	}

	private static void sortArrayDescendingly(int[] numbers) {
		for(int i=0; i < numbers.length; i++){
			int maxIndex = i;
			for(int j = i+1; j< numbers.length;j++){
				if(numbers[j] > numbers[maxIndex]){
					maxIndex = j;
				}
			}
			int temp = numbers[maxIndex];
			numbers[maxIndex] = numbers[i];
			numbers[i] = temp;
		}
	}

	private static int getSum(int[] numbers) {
		int sum = 0;
		for(int element : numbers){
			sum += element;
			// sum = sum + element;
		}
		return sum;
	}

	private static int getMax(int[] numbers) {
		int maxValue = numbers[0];

//		for(int i =0; i < numbers.length; i++){
//			if(numbers[i] > maxValue){
//				maxValue = numbers[i];
//			}
//		}

		for(int element : numbers){
//			if(element > maxValue){
//				maxValue = element;
//			}
//			maxValue = maxValue < element? element : maxValue;

			maxValue = Math.max(maxValue,element);
		}
		return maxValue;
	}

	private static void display(int[] numbers) {
		for(int element : numbers){
			System.out.print(element + " " );
		}
		System.out.println();
	}

	private static void readArray(int[] numbers) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please input ten integers");
		for(int i =0; i < 10; i++){
			numbers[i] = keyboard.nextInt();
		}
	}
}