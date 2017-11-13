package intellij.git.examples;

import java.util.Scanner;

public class Array {

    public static void main(String[] args){

        // decalaring two-dimensional array

        int a[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 numbers for a matrix: ");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)

            a[i][j] = sc.nextInt();

        System.out.println("Entered data is: ");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)

        System.out.println(a[i][j]);




    }
}
