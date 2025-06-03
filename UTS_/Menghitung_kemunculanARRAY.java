/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_;
import java.util.HashMap;
/**
 *
 * @author USER
 */
public class Menghitung_kemunculanARRAY {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 2, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : array) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " muncul " + map.get(key) + " kali");
        }
    }
}
