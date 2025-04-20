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
public class PercabanganIF_ELSE {
    public static void main(String[] args){
        //Contoh percabangan dengan IF ELSE
        int nilai = 88;
        char grade = 0;
        
       if(nilai>=90){
           grade='A';
       }else if(nilai>=80){
           grade='B';
       }else if(nilai>=70){
           grade='C';
       }else if(nilai>=60){
           grade='E';
       }
        System.out.println("Grade Anda adalah : " + grade);
    }
}
    

