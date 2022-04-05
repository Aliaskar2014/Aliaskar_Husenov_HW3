package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double [] num = {1.6, -3.5 , 2.7 , -3.8 , 1.4 , -6.3 , 7.1 , -4.7 , 8.2 , -6.4 ,
                -3.7 , 2.7 , -4.6 , 2.7 , -5.8};

        double sum = 0;
        int kol = 0;
        boolean otr = false;
        for (double hat : num){
            if (hat < 0) {
                otr = true;
            }
            else {
                if (otr) {
                    kol++;
                    sum += hat;
                }

            }
       }System.out.println(" Average =\t "+sum / kol);

        boolean isSorted = false;
        double buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < num.length-1; i++) {
                if(num[i] > num[i+1]){
                    isSorted = false;

                    buf = num[i];
                    num[i] = num[i+1];
                    num[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(num));
}
}