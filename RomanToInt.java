import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        int number = 0;
        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length-1;i++){
            if(roman.get(arr[i])<roman.get(arr[i+1])  ) {
                number = number - roman.get(arr[i]);
            }else {
                number = number + roman.get(arr[i]);
            }

        }
        // Adding last element of the char array
        number = number + roman.get(arr[arr.length-1]);
        return number;
    }
    public static void main(String[] args) {
        String number = "LVIII";
        RomanToInt obj = new RomanToInt();
        int result = obj.romanToInt(number);
        System.out.println(result);
    }
}
