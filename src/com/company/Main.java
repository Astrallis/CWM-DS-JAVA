package com.company;

public class Main {

    public static void main(String[] args) {
        Array num=new Array(3);
        int[] second={3,2,4,5};
        num.insert(1);
        num.insert(2);
        num.insert(3);
        num.insert(4);
        num.removeAt(1);
        num.insertAt(9,2);
        num.reverse();
        num.print();
        num.intersect(second);
        num.max();
    }
}
