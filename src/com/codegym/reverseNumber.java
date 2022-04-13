package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class reverseNumber {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử: ");
        int capacity = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            System.out.println("Nhập vào từng phần tử");
            int num = scanner.nextInt();
            stack.push(num);
        }
        for (int i = 0; i < capacity; i++) {
            arrayList.add(stack.pop());
        }
        System.out.println(arrayList);
    }
}
