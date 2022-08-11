package com.scahillcoding;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        byte age =30;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = true;
//        Date now = new Date();
//        System.out.println(isEligible);
//        Point point1 =  new Point(1,1);
//        Point point2 = point1;
//        System.out.println(point2);
        String msg = "hello world";
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 64;
        System.out.println(Arrays.toString(numbers));
        System.out.println(msg);
        int[] [] numbers2d = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers2d));
    }

}