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
public class Method_Prosedur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Method_Prosedur Mahasiswa = new Method_Prosedur();
        Mahasiswa.mahasiswa();
    }
    
    public void mahasiswa(){
        String nama = "Husna";
        String nim = "2455201002";
        double IPK = 3.5;
        System.out.println("Nama = " + nama + "\nNIM = " + nim + "\nIPK = " + IPK);
    }
}
    

