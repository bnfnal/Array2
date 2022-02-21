package com.company;

import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Введите массив целых чисел");
        Scanner sc = new Scanner(System.in);
        List<String> l = List.of(sc.nextLine().split(" "));
        int n = l.size();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(l.get(i));

        int m = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                m++;
            }
        }


        int[] b = new int[m];

        if( m == 0){
            System.out.println("В данном массиве нет четных чисел");
        }
        else{
            System.out.println("Массив четных чисел: ");
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    b[k] = a[i];
                    System.out.print(b[k] + " ");
                    k++;
                }
            }
        }

    }

}