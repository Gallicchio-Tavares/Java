package estudos;

import java.util.Scanner;  
public class ArrayInputExample1   
{  
    public static void main(String[] args)   
    {   
        Scanner sc = new Scanner(System.in);  

        int[] array = new int[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i = 0; i < array.length; i++)  
        {  
        //reading array elements from the user   
            array[i] = sc.nextInt();  
        }  
        System.out.println("Array elements are: ");  
        // accessing array elements using the for loop  
        for (int i = 0; i < array.length; i++)   
        {  
            System.out.println(array[i]);  
        }  

        sc.close();
    }  
}  