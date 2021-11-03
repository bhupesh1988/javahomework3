import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter to check prime or not:- ");
        int n=scanner.nextInt();
        boolean flag=false;
        for(int i=2; i<=n/2;i++) {


            if (n % i == 0) {
                flag = true;
            }
        }
              if (flag)

                    System.out.println("prime");
                    else{
                    System.out.println("not prime");




        }}}




