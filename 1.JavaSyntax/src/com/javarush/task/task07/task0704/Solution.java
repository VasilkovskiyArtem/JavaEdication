package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int list[] = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        for (int i = 0; i < 10; i++) {
            System.out.println(list[9 - i]);
        }
    }
}

