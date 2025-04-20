/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_2;

/**
 *
 * @author USER
 */
public class PerulanganDO_WHILE {
    public static void main(String[] args){
        int n = 5;
        
        int hasil = 0;
        int i = 1;
        do {
            System.out.print(i);
            if (i != n){
                System.out.print(" + ");
            }else {
                System.out.print(" = ");
            }
            hasil += i;
            i++;
        } while (i <= n);
        System.out.println(hasil);
    }   
}