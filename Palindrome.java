public class Palindrome {
    public boolean isPalindrome(int x) {
        boolean result = false;
        int y = 0;
        int keep = x;
        if (x == 0){
            result = true;
        }else {
            while(x != 0) {
                int yy = y*10 + x%10;

                if ((yy - x%10)/10 != y) return false;
                y = yy;

                x = x/10;
            }

            if (keep >0 &&(keep == y))
                result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 222;
        Palindrome obj = new Palindrome();
        if (obj.isPalindrome(number) == true)
            System.out.println(number + " is palindrome");
        else
            System.out.println(number + " is not palindrome");
    }
}