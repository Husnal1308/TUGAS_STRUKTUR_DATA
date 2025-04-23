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
public class  MethodFungsi_Parameter {
    public static void main(String[] args){
        float alas = 15;
        float tinggi = 3;
        MethodFungsi_Parameter Luas = new MethodFungsi_Parameter();
        Luas.luasSegitiga(alas, tinggi, alas);
    }
    float luasSegitiga(float alas,float tinggi,float luas){
        luas = ((alas*tinggi)/2);
        System.out.println("alas = " + alas);
        System.out.println("tinggi = " + tinggi);
        System.out.println("Luas Segitiga = " + luas);
        return luas;
    }
}
