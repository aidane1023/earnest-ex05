package exercise05;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double i = 0;
        double j = 0;

        System.out.println("What is the first number? ");
        i = userInput.nextDouble();
        System.out.println("What is the second number? ");
        j = userInput.nextDouble();

        System.out.format("%.2f + %.2f = %.2f\n%.2f - %.2f = %.2f\n%.2f * %.2f = %.2f\n%.2f / %.2f = %.2f\n", i,j,i+j,i,j,i-j,i,j,i*j,i,j,i/j);
    }
}
