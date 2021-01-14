package com.ironhack.impl;
import com.ironhack.interfaces.IntList;

/** Clase que me implementa la interfaz */

public class IntVector implements IntList {
    private int[] array = new int[10];
    private int count = 0;

    @Override
    public void add(int number) {
        if (count >= array.length) {
            int[] newArray = new int[(int)Math.ceil(array.length *2)];
            for (int i=0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;

        } else {
            array[count]=number;
        }
        count+=1;
    }

    @Override
    public int get(int number) {
        if (number > count) {
            throw new IllegalArgumentException();
        }
        return array[number];
    }
}
