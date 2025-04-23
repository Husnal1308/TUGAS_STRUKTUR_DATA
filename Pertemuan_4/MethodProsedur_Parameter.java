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
public class MethodProsedur_Parameter {
    public static void main(String[] args){
        String Nama = "Husna";
        String NIM = "2455201002";
        double IPK = 3.5;
        MethodProsedur_Parameter Mahasiswa = new MethodProsedur_Parameter();
        Mahasiswa.mahasiswa(Nama,NIM,IPK);
    }
    
    public void mahasiswa(String Nama,String NIM,double IPK){
        System.out.println("Nama = " + Nama + "\nNIM = " + NIM + "\nIPK = " + IPK);     
    }   
}
