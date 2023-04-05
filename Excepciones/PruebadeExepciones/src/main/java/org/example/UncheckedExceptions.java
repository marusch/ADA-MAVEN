package org.example;

public class UncheckedExceptions {

    public static void main(String[] args) {


        int zero = 0;
        /*
        int result = 10 / zero;
        System.out.println(result);
*/

        // Unchecked Exceptions

        try {
            int result = 10 / zero;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("ERROR :: " + ex.getMessage());
        }
    }
}

