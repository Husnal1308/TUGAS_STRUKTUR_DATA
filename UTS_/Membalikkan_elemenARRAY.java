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
public class Membalikkan_elemenARRAY {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        for(int i = array.length -1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}