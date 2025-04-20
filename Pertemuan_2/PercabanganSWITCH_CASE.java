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
public class PercabanganSWITCH_CASE {
    public static void main(String[] args){
        
        int grade = 88;
        
        switch(grade){
        case 100:
        System.out.println( "Excellent!" );
        break;
        case 90:
        System.out.println( "Bagus!" );
        break;
        case 80:
        System.out.println( "Belajar lagi!" );
        break;
        default:
        System.out.println( "Maaf, Anda Gagal." );
        break;
        }
    }
    
}
