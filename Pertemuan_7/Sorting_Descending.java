/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_7;
 import java.util.Arrays;
/**
 *
 * @author USER
 */
public class Sorting_Descending {
    public static void main(String[] args) {
        int[] original = {4, 5, 10, 7, 11};

        // Bubble Sort (Descending)
        int[] bubble = original.clone();
        bubbleSortDescending(bubble);
        System.out.println("Bubble Sort (Descending)\t: " + Arrays.toString(bubble));

        // Selection Sort (Descending)
        int[] selection = original.clone();
        selectionSortDescending(selection);
        System.out.println("Selection Sort (Descending)\t: " + Arrays.toString(selection));

        // Insertion Sort (Descending)
        int[] insertion = original.clone();
        insertionSortDescending(insertion);
        System.out.println("Insertion Sort (Descending)\t: " + Arrays.toString(insertion));
    }

    // Bubble Sort Descending
    static void bubbleSortDescending(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Descending
    static void selectionSortDescending(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;
        }
    }

    // Insertion Sort Descending
    static void insertionSortDescending(int[] data) {
        int n = data.length;
        for (int i = 1; i < n; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] < key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }
}



