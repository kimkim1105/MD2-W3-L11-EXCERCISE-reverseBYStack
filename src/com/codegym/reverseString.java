package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class reverseString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String mWord = scanner.nextLine();
        String[] list = mWord.split(" ");
        for (int i = 0; i < list.length; i++) {
            wStack.push(list[i]);
        }
        mWord = "";
        for (int i = 0; i < list.length; i++) {
            mWord +=wStack.pop()+" ";

        }
        System.out.println(mWord);
    }
}
