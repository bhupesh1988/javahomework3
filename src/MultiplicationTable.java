import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number :- ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 12; ++i) {
            System.out.println(number + "x" + i + "=" + number * i);
            }


        }
    }
