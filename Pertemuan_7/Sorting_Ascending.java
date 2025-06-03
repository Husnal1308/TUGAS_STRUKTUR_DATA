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
public class Sorting_Ascending {
    public static void main(String[] args) {
        int[] original = {4, 5, 10, 7, 11};

        // Bubble Sort
        int[] bubble = original.clone();
        bubbleSort(bubble);
        System.out.println("Bubble Sort (Ascending)\t\t: " + Arrays.toString(bubble));

        // Selection Sort
        int[] selection = original.clone();
        selectionSort(selection);
        System.out.println("Selection Sort (Ascending)\t: " + Arrays.toString(selection));

        // Insertion Sort
        int[] insertion = original.clone();
        insertionSort(insertion);
        System.out.println("Insertion Sort (Ascending)\t: " + Arrays.toString(insertion));
    }

    // Bubble Sort Method
    static void bubbleSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Method
    static void selectionSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }

    // Insertion Sort Method
    static void insertionSort(int[] data) {
        int n = data.length;
        for (int i = 1; i < n; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }
}










