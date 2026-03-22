package edu.norcocollege.cis18b.weekx.mini01;

public class BuiltInExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        String[] alerts = {"CPU High", "Disk Full", "Login Failure"};
        
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero.");
        }
        
        try { 
            System.out.println(alerts[5]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid alert index");
        }

        System.out.println("Program completed.");
    }
}

