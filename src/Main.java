import java.util.*;


class Day1{
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        else{
            int number = x,remainder=0;
            while(x > 0){
                int digit = x % 10;
                remainder = remainder * 10 + digit;
                x /= 10;
            }
            return number == remainder;
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number=sc.nextInt();
       boolean Result= isPalindrome(number);
        System.out.println(Result);
    }
}