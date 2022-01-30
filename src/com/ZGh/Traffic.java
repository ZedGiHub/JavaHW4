package com.ZGh;

import java.util.ArrayList;
import java.util.Scanner;

public class Traffic {


    public static void manager(ArrayList<Integer> beheshti, ArrayList<Integer> motahari, int flag) {
        int index = beheshti.indexOf(flag);
        if (index > -1) {
            for (int i = beheshti.size() - 1; i > index; i--) {
                System.out.print(beheshti.get(i));
                System.out.println(" 3");
                motahari.add(beheshti.get(i));
                beheshti.remove(i);
            }
            System.out.print(flag);
            System.out.println(" 1");
            beheshti.remove(index);
        } else {
            index = motahari.indexOf(flag);
            for (int i = motahari.size() - 1; i > index; i--) {
                System.out.print(motahari.get(i));
                System.out.println(" 4");
                beheshti.add(motahari.get(i));
                motahari.remove(i);
            }
            System.out.print(flag );
            System.out.println(" 2");
            motahari.remove(index);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<Integer> beheshtiOrder = new ArrayList<Integer>();
        ArrayList<Integer> motahariOrder = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int carNum = input.nextInt();
            beheshtiOrder.add(carNum);
        }
        int priorityFlag = 1;
        while (priorityFlag<=n){
            manager(beheshtiOrder,motahariOrder,priorityFlag);
            priorityFlag++;
        }
    }

}
