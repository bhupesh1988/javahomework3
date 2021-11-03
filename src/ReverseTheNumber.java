import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any Sequence of number :-");
        int reverse = 0;
        int number = scanner.nextInt();
        for (;number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;

        }
            System.out.println("The Reverse number is : " + reverse);
        }
    }

