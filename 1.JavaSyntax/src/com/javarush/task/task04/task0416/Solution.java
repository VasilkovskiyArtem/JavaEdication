package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double Minute = Double.parseDouble(reader.readLine());
        if (Minute%5 <3) System.out.println("зелёный");
        else if (Minute%5 <4)System.out.println("жёлтый");
        else if (Minute%5 <5)System.out.println("красный");
        //напишите тут ваш код

    }
}