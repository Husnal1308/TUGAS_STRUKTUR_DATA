/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_;

/**
 *
 * @author USER
 */
public class Menggabungkan_duaARRAY {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] gabung = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            gabung[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            gabung[array1.length + i] = array2[i];
        }

        for (int val : gabung) {
            System.out.print(val + " ");
        }
    }
}
