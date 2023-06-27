package org.example.basic100.mode;

import java.util.Arrays;
import java.util.Random;

public class ModeClient {
    public static void main(String[] args) {
        final ModeClient modeClient = new ModeClient();

        final int[] randomInts = modeClient.makeRandomIntArray(20);
        final int[] sortedInts = modeClient.sortRandomIntArray(randomInts);
        final int[] modeInts = modeClient.getModeInArray(sortedInts);
        modeClient.findMode(modeInts);
    }


    public int[] makeRandomIntArray(int length) {
        int[] array = new int[length];

        final Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length);
        }

        return array;
    }

    public int[] sortRandomIntArray(int[] randomInts) {
        Arrays.sort(randomInts);
        System.out.println("randomInts = " + Arrays.toString(randomInts));
        return randomInts;
    }

    public int[] getModeInArray(int[] sortedInts) {
        int[] modeInts = new int[sortedInts.length];

        for (int sortedInt : sortedInts) {
            modeInts[sortedInt]++;
        }

        System.out.println("modeInts = " + Arrays.toString(modeInts));

        return modeInts;
    }

    public void findMode(int[] mode) {
        int modeNum = 0;
        int modeCnt = 0;

        for (int i = 0; i < mode.length; i++) {
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }

        System.out.println("modeNum = " + modeNum);
        System.out.println("modeCnt = " + modeCnt);
    }
}
