import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter your String: ");
        Scanner sc = new Scanner(System.in);
        String text= sc.nextLine();

        int length= text.length();
        boolean isPalindrome= true;

        for (int i = 0; i < length/2; i++) {
            if (text.charAt(i) != text.charAt(length-i-1)){
                isPalindrome=false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
