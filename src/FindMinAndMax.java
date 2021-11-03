import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int numbers = 3;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        System.out.println("Please enter " + numbers + " numbers.");
        for(int a = 0; a < numbers; a++)
        {int current = sc.nextInt();
            if(current > maximum)
            {maximum = current;
            }
            if(current < minimum)
            {
                minimum = current;
            }
        }
        System.out.println("largest of " + numbers + " numbers is: " + maximum);
        System.out.println("smallest of " + numbers + " numbers is: " + minimum);
        sc.close();}}
