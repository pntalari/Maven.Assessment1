package com.zipcodewilmington.assessment1.part4;

import javax.sound.midi.Soundbank;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j)
    {
        int count = 0;
        Integer var = Integer.MAX_VALUE;
        if (k>j) {
            while (var != 0) {
                var = k - j;
                k = var;

                count++;
            }
        }

        else
        {
            var = j - k;
            count ++;
        }

        System.out.printf("Bob must jump %d times to reach %d height flag",count,k);

        return count;
    }
}
