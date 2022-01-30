package com.ZGh;

import java.util.ArrayList;
import java.util.Scanner;

public class Range {

    public static int sum(int x, int y, ArrayList<Integer> arrOfNums) {
        ArrayList<Integer> arrOfNumsRange = new ArrayList<Integer>(arrOfNums.subList(x, y + 1));
        int s = 0;
        for (int num : arrOfNumsRange) {
            s += num;
        }
        return s;
    }

    public static void main(String[] args) {
        ArrayList<Integer> inputArr = new ArrayList<Integer>();
        Scanner nInput = new Scanner(System.in);
        int n = nInput.nextInt();
        int N = nInput.nextInt();
        for (int i = 0; i < n; i++) {
            int number = nInput.nextInt();
            inputArr.add(number);
        }
        for (int i = 0; i < N; i++) {
            System.out.println(sum(nInput.nextInt(), nInput.nextInt(), inputArr));
        }


    }
}
