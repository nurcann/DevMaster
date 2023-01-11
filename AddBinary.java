import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {
      /*  BigInteger m=new BigInteger(a,2);
        BigInteger n=m.add(new BigInteger(b,2));

        return n.toString(2); */

        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            // char -> ASCII value: '0' -> 48, '1' -> 49
            // e.g., subtract '0' from '1' and we have 1
            // converting a character to a number here, by subtracting 0
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            carry = sum / 2;
            res.insert(0, String.valueOf(sum % 2));

        }

        if (carry == 1) res.insert(0, '1');
        return res.toString();


    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        AddBinary obj = new AddBinary();
        System.out.println(obj.addBinary(a,b));

    }
}
