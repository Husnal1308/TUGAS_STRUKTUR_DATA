/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_4;

/**
 *
 * @author USER
 */
public class Method_Fungsi {
    public static void main(String[] args){
        
          Method_Fungsi Luas = new Method_Fungsi();
          Luas.luasSegitiga();   
    }
    
    float luasSegitiga(){
        float alas = 15;
        float tinggi = 3;
        float luas = ((alas * tinggi)/2);
        
        System.out.println("Luas Segitiga = " + luas );
        return luas;
    } 
}

