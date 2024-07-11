// Simple example of try block with multiple catch blocks
package com.tnsif.exception;

public class MultipleException {

    public static void main(String[] args) {
        int a = 6, b = 0;
        int[] arr = {1, 2, 3};

        try 
        {
            int result = a / b;
            System.out.println("Result: " + result);
            System.out.println(arr[5]);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("exception caught  " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("exception caught  " + e.getMessage());
        }
    }
}
