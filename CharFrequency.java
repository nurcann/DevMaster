import java.util.*;
public class CharFrequency {

    // function to sort hashmap by values
    public static Map<Character, Integer> sortByValue(Map<Character, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list =
                new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });


        // put data from sorted list to hashmap
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        return temp;
        // return reverseSortedMap;
    }

    public String frequencySort(String s) {
        String result = "";
        char[] strArray = s.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<Character,Integer>();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }

        }

        //sort hashMap
        charCountMap = sortByValue(charCountMap);

        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            int k = Integer.parseInt(entry.getValue().toString());
            for(int i = 0;i<k;i++) {
                result = result+ entry.getKey();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String myText = sc.nextLine();
        CharFrequency obj = new CharFrequency();
        System.out.println(obj.frequencySort(myText));

    }

}