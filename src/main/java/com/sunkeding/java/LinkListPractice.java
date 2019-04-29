package com.sunkeding.java;

import java.util.LinkedList;

public class LinkListPractice {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 5; i++) {
//            linkedList.add(i);
//        }
//        System.out.println("初始值：" + linkedList.toString());

//        // peek获取并不删除列表的第一个元素
//        Integer peek = linkedList.peek();
//        System.out.println("peek操作后链表："+linkedList.toString()+" peek的值为："+peek.intValue());
//
//        // poll获取并删除列表的第一个元素
//        Integer poll = linkedList.poll();
//        System.out.println("poll操作后链表："+linkedList.toString()+" poll的值为："+poll.intValue());

        // poll是队列数据结构实现类的方法，从队首获取元素，同时获取的这个元素将从原队列删除；
        // pop是栈结构的实现类的方法，表示返回栈顶的元素，同时该元素从栈中删除，当栈中没有元素时，调用该方法会发生异常
//        Integer pop = linkedList.pop();
//        System.out.println("pop操作后链表："+linkedList.toString()+" pop的值为："+pop.intValue());


//        linkedList.push(5);  //即调用了addFirst();
//        System.out.println("push操作后链表：" + linkedList.toString());


        //链表反转
        ListNode listNode = new ListNode(1);
        listNode.next=new ListNode(2);
        System.out.println(listNode.toString());
        ListNode listNode1 = reverseList(listNode);
        System.out.println(listNode1);
    }


    public  static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


}
