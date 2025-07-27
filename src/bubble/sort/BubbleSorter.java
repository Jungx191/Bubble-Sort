/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bubble.sort;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class BubbleSorter {

    private int[] arr;

    public BubbleSorter(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive!");
        }
        arr = new int[size];
        generateRandom();
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null!");
        }
        this.arr = arr;
    }

    public void generateRandom() {
        Random random = new Random();
        int[] newArray = new int[arr.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(newArray.length);
        }
        setArr(newArray);
    }

    public void bubbleSort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void display(String mess) {
        System.out.println(mess + " " + Arrays.toString(arr));
    }

}
