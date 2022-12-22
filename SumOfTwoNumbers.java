import java.util.List;

public class SumOfTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

 /*   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode sum = new ListNode(0);
        while(l1 != null && l2 != null){
                temp = l1.val + l2.val;
                if(temp >= 10){
                    sum.val = (l1.val + l2.val)%10;
                    ListNode new_Node = new ListNode(temp/10);
                }else{
                  sum.val = temp;
                }
                l1 = l1.next;
                l2 = l2.next;
                sum = sum.next;
        }

        return sum;

    } */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode temp = new ListNode(-1);
        ListNode result = temp;
        int carry = 0;
        while(n1 != null && n2 != null){
            int v1 = 0;
            int v2 = 0;
            if (n1 != null){
                v1 = n1.val;
                n1 = n1.next;
            }
            if (n2 != null){
                v2 = n2.val;
                n2 = n2.next;
            }
            int sum = v1 + v2 + carry;
            result.next = new ListNode(sum % 10);
            result = result.next;
            carry = sum / 10;

        }
        if (carry > 0){
            result.next = new ListNode(carry);
        }
        return temp.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2= new ListNode(4);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        ListNode n4 = new ListNode(5);
        ListNode n5= new ListNode(6);
        ListNode n6 = new ListNode(4);
        n4.next = n5;
        n5.next = n6;

        SumOfTwoNumbers s = new SumOfTwoNumbers();

        ListNode temp = s.addTwoNumbers(n1,n4);
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("Null"+"\n");
    }

}
