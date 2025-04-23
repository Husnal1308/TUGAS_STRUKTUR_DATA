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
public class Contoh_Method {
    public static void main(String[] args) {
        
        Contoh_Method contoh = new Contoh_Method();
        contoh.luasLingkaranProsedur();
        contoh.luasLingkaranFungsi();
        
    }
    
    //Cara pertama membuat Method
    //Method Prosedur
    //Ditandai dengan awalan "Void"
    
    public void luasLingkaranProsedur(){
        double jari2 = 10;
        double phi = 3.14;
        double luas = phi * jari2 * jari2;
        System.out.println("Luas Lingkaran dengan Method Prosedur = " + luas);
    }  
    //Cara kedua membuat Method 
    //Method Fungsi
    //Ditandai dengan nilai balik "return" dan diawali dengan tipe data
    
    double luasLingkaranFungsi(){
        double jari2 = 15;
        double phi = 3.14;
        double luas = phi * jari2 * jari2;
        System.out.println("Luas Lingkaran dengan Method Fungsi = " + luas);
        return luas;
        
       }    
    }

  

    

