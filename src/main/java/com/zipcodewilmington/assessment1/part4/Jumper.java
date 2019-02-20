package com.zipcodewilmington.assessment1.part4;

import javax.sound.midi.Soundbank;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j)
    {
//        double r = (double)k/j;
//        double count = Math.ceil(r);
        int kmodj = k%j;
        int kdivj = k/j;
        int jump = kmodj + kdivj;

        return jump;
    }

}
