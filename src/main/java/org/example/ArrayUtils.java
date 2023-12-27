package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtils {

    static void reverseArray(Double array[]){

        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
    }

    public static void main(String[] args) {

        Double [] arr = {2.8,5.4,6.3,5.54454};

        reverseArray(arr);
    }


}
