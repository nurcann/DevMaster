import java.util.InputMismatchException;

public class ReverseInt {
    public int reverse(int x) {
     /*   int rev = 0;
        while(x != 0){
                rev = rev*10 + x%10;
                x = x/10;
        }

        return rev; */

        int y = 0;
        while(x != 0) {
           int yy = y*10 + x%10;

            if ((yy - x%10)/10 != y) return 0;
            else y = yy;

            x = x/10;
        }
        return y;
    }

    public static void main(String[] args) {
        ReverseInt obj = new ReverseInt();
        System.out.println(obj.reverse(321));
    }
}

