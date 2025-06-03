/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_;
import java.util.Arrays;
/**
 *
 * @author USER
 */
public class SORTING_namaarray {
    public static void main(String[] args) {
        String[] nama = {"Husna", "Rois", "Cipa", "Eka", "Adel", "Devi", "Isna"};

        System.out.println("Bubble Sort:");
        bubbleSort(nama.clone());

        System.out.println("\nSelection Sort:");
        selectionSort(nama.clone());

        System.out.println("\nInsertion Sort:");
        insertionSort(nama.clone());
    }

    static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            String tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}

