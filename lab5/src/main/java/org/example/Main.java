package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items: \n");
        int numberOfItems = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter seed: \n");
        int seed = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter upper bound: \n");
        int upperBound = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter lower bound: \n");
        int lowerBound = Integer.parseInt(scanner.nextLine());

        Problem problem = new Problem(numberOfItems, seed, upperBound, lowerBound);
        System.out.print(problem.ToString());

        System.out.print("Enter capacity: \n");
        int capacity = Integer.parseInt(scanner.nextLine());

        Result result = problem.Solve(capacity);
        System.out.println(result.ToString());
    }
}