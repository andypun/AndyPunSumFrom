package AndyPun;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Choose your integer");
        int n = input.nextInt();
        System.out.println("The sum of 1 to n is " + sumUpTo(n));
    }

    public static int sumUpTo(int n)
    {
        int sum = 0;
        if (n >= 0) {
            for (int i = 1; i < n + 1; i++) {
                sum = sum + i;
            }
            return sum;
        }

        for (int i = 1; i > n - 1; i--) {
            sum = sum + i;
        }
        return sum;
    }
}
