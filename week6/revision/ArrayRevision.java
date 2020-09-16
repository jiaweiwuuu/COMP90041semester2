package week6.revision;

import java.util.Arrays;

class Student{
    private int id;
    private String name;
    public Student(){
        id = 1;
        name = "default";
    }
}
public class ArrayRevision {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;


        // some ways to create an array

        // first way
        int[] myArray1 = new int[5];
        for(int i =0; i < myArray1.length; i++){
            myArray1[i] = i+1;
        }

        // second way
        int[] myArray2 = new int[]{3,2,1};


        //some ways to output an array
        // first way

        for(int i=0; i<myArray1.length; i++){
            System.out.print(myArray1[i] + " ");
        }

        // second way
        System.out.println();
        System.out.println("-----------------------");
        // for-each loop
        for(int element : myArray1){
            System.out.print(element + " ");
        }
        // third way

        System.out.println();
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(myArray1));

        System.out.println();
        System.out.println("-----------------------");

        // A. [0,0,0]
        // B [null,null,null]
        // C null

        Student[] studentArray = new Student[3];
        System.out.println(Arrays.toString(studentArray));
        // selection sort(asc)
        selectionSort(myArray2);
        System.out.println(Arrays.toString(myArray2));
    }


    public static void selectionSort(int[] nums){
        // [ 3, 2, 1]
        for(int i=0; i < nums.length; i++){
            int minIndex = i;
            for(int j = i+1; j< nums.length;j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}





