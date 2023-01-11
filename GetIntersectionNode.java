public class GetIntersectionNode {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=0;
        ListNode ptrA=headA;
        while(ptrA!=null){
            ptrA=ptrA.next;
            sizeA++;
        }

        int sizeB=0;
        ListNode ptrB=headB;
        while(ptrB!=null){
            ptrB=ptrB.next;
            sizeB++;
        }

        int diff=Math.abs(sizeA-sizeB);
        ptrB=headB;
        ptrA=headA;
        if(sizeA>sizeB){
            for(int i=0; i<diff; i++){
                ptrA=ptrA.next;
            }
        }else{
            for(int i=0; i<diff; i++){
                ptrB=ptrB.next;
            }
        }

        while(ptrA!=null){
            if(ptrA==ptrB) return ptrA;
            ptrA=ptrA.next;
            ptrB=ptrB.next;
        }
        return null;
    }
}
