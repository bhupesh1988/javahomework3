import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter Number to get Fibonacci Sequence:- ");
        int n = scanner.nextInt(),

                firstf = 1, secondf = 1;

        System.out.print("Fibonacci Sequence:- " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstf + ", ");

            // compute the next term
            int nextTerm = firstf + secondf;
            firstf = secondf;
            secondf = nextTerm;
        }

    }
}
