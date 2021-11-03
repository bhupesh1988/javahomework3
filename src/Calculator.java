import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double num1;
        double num2;
        double result;
        char operator;
        System.out.println("please enter your number:- ");
        num1= scanner.nextDouble();
        System.out.println("please enter your number");
        num2=scanner.nextDouble();
        System.out.println("please select operator: +,-,*,%");
        operator=scanner.next().charAt(0);
        switch(operator){
            case'+':result=num1+num2;
                System.out.println(result);
                break;
            case'-':result=num1-num2;
                System.out.println(result);
            break;
            case'*':result=num1*num2;
                System.out.println(result);
            break;
            case'%':result=num1%num2;
                System.out.println(result);
            break;
            default:
                System.out.println("Invalid Entry");
        }


    }
}
