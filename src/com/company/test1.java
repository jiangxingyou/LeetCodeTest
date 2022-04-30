package com.company;

/**
 * 两数之和；
 */
public class test1 {

    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * 递归实现
     */
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            //l1,l2皆是非空的，说明；必须都有一个结点；但是有可能值都是0；
            ListNode head = new ListNode(-1);
            addListNode(0, l1, l2, head);
            return head;
        }

        public static int addListNode(int last, ListNode l1, ListNode l2, ListNode l3) {

            //这里都是l1,l2都是不为空的情况下，
            ListNode ll = null;
            int a, b;
            a = l1!=null ? l1.val : 0;
            b = l2!=null ? l2.val : 0;
            int j = a + b + last;
            last = j >= 10 ? 1 : 0;
            j = j%10;
            ll = new ListNode(j);
            if(l3.val == -1){
                //表示是第一次,即第一个结点
                l3.val = j;
            }else{
                l3.next = ll;
                l3 = l3.next;
            }

            if (l1.next == null && l2.next == null){
                //说明，当前l1,l2就是最后一个位；但是这里没有判断l1,l2单个位空的情况；
                if (last == 1){
                    ll = new ListNode(1);
                    l3.next = ll;
                    System.out.println("最后一位是："+ll.val);
                }
                return 0;
            }else if (l1.next == null && l2.next !=null){
                l1.next = new ListNode(0);
                addListNode(last, l1.next, l2.next, l3);
            }else if(l1.next !=null && l2.next == null){
                l2.next = new ListNode(0);
                addListNode(last, l1.next, l2.next, l3);
            }else {
                addListNode(last, l1.next, l2.next, l3);
            }
            return 0;
        }



    public static void main(String[] args) {
        System.out.println("xx");
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);l1.next = l2;
        ListNode l3 = new ListNode(3);l2.next = l3;

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);l4.next = l5;
        ListNode l6 = new ListNode(4);l5.next = l6;

        ListNode l7 = new ListNode(2);
        ListNode l8 = new ListNode(8);
        ListNode l9 = addTwoNumbers(l1, l4);
        System.out.println(l9.val);
        System.out.println(l9.next.val);
        System.out.println(l9.next.next.val);
    }

}
