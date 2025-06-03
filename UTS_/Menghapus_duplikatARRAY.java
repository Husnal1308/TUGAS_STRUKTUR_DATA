/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_;
import java.util.LinkedHashSet;
/**
 *
 * @author USER
 */
public class Menghapus_duplikatARRAY {
     public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5, 4};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int val : array) {
            set.add(val);
        }

        for (int val : set) {
            System.out.print(val + " ");
        }
    }
}
