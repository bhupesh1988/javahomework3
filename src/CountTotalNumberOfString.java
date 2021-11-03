import java.security.spec.RSAOtherPrimeInfo;

public class CountTotalNumberOfString {
    public static void main(String[]args){
        String personal="bhupesh kumar patel";
        int string = 0;
        char temp;
        for (int i = 0; i < personal.length(); i++) {

            temp = personal.charAt(i);
            if (temp == 'a')
                string++;
        }

        System.out.println("a appears " + string + " times in that String");
    }
}
