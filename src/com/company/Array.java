
package com.company;

import java.util.*;

class Array {
    private int[] array;
    private int[] backup;
    private int countAt = 0;

    Array(int length) {
        array = new int[length];
    }

    void insert(int item) {
        if (countAt < array.length) {
            array[countAt] = item;
            countAt++;
        } else {
            backup = array;
            array = new int[backup.length + 1];
            for (int i = 0; i < backup.length; i++) {
                array[i] = backup[i];
            }
            array[countAt] = item;
            countAt++;
        }
    }

    void removeAt(int index) {
        if (index >= array.length) {
            System.out.println("OUT OF BOUNDS");
        } else {
            backup = array;
            for (int i = index; i < array.length; i++) {
                if (i < array.length - 1)
                    array[i] = backup[i + 1];
            }
            countAt--;
        }
    }

    int indexOf(int item) {
        for (int i = 0; i < countAt; i++) {
            if (array[i] == item)
                return i;
        }
        return -1;
    }

    void max() {
        int max = array[0];
        for (int i = 0; i < countAt; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    } //O(n) Complexity

    void intersect(int[] second) {
        for (int i = 0; i < countAt; i++) {
            if (indexOf(second[i]) != -1)
                System.out.print(second[i] + " ");
        }
        System.out.println();
    }

    void reverse() {
        for (int i = 0; i <= (countAt - 1) / 2; i++) {
            int t = array[i];
            array[i] = array[countAt - i - 1];
            array[countAt - i - 1] = t;
        }
    }

    void print() {
        for (int i = 0; i < countAt; i++) {
            System.out.println(array[i]);
        }
    }

    void insertAt(int item, int index) {
        try {
            if (index == countAt)
                insert(item);
            else {
                insert(array[countAt - 1]);
                int t = array[index];
                for (int i = index; i < countAt - 1; i++) {
                    int b = array[i + 1];
                    array[i + 1] = t;
                    t = b;
                }
                array[index] = item;
            }
        } catch (Exception e) {
            System.out.println("OUT OF BOUNDS");
            countAt--;
        }
    }

}
