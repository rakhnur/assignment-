package com.company;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(45);

        myLinkedList.add(91);
        myLinkedList.add(667);
        myLinkedList.add(94);
//        myLinkedList.add(66, 1);
        myLinkedList.add(667);
        myLinkedList.add(700);

        int i = 0;
        System.out.println("LinkedList elements: ");
        while(i != myLinkedList.size()){
            System.out.print(myLinkedList.get(i)+" ");
            i++;
        }

        System.out.println("");
        System.out.println("Element to remove "+myLinkedList.remove(5));

        System.out.println("");
        myLinkedList.add(324, 0);
        System.out.println("");

        int j = 0;
        System.out.println("Modified LinkedList elements: ");
        while(j != myLinkedList.size()){
            System.out.print(myLinkedList.get(j) + " ");
            j++;
        }
    }
}