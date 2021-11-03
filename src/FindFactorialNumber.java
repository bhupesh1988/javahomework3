import java.util.Scanner;

public class FindFactorialNumber {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter any number to get Factorial number:- ");
        int i,fact=1;
        int number=scanner.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;

        }
        System.out.println("Factorial of "+number+" is :-"+fact);
    }
}
