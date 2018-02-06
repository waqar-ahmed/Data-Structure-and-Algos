package algos;

/**
 * Created by waqar on 2/6/2018.
 */
public class Palindrome {

    public static boolean stringPlayndrome(String s){
        int pointer = s.length()-1;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(pointer--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean numberPalyndrome(int number){
        return number == getReverseNumber(number);
    }

    public static int getReverseNumber(int number){
        int reverse = 0;
        while(number != 0){
            reverse = reverse*10 + number % 10;
            number = number/10;
        }
        return reverse;
    }

     public static void main(String args[]){
         String s1 = "GOOOG";
         String s2 = "RADARA";

         System.out.println(stringPlayndrome(s1));
         System.out.println(numberPalyndrome(1221));

     }
}
