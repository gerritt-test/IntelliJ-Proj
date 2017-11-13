package intellij.git.examples;

import java.util.Scanner;

public class FunctionType {

    int square (int x){
        return x * x;
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number...");
        int x = sc.nextInt();

        // create class objective

        FunctionType fnty = new FunctionType();
        int result = fnty.square(x);
        System.out.println("Square root of a number  is: " + result);
    }

}
