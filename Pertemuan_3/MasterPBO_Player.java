package Pertemuan_3;

public class MasterPBO_Player {
    
    //Definisi Atribut
    String nama;
    int kecepatan;
    int stamina;
    
    //Definisi Method lari
    void lari(){
        System.out.println(nama + " sedang berlari...");
        System.out.println("kecepatan = " + kecepatan);
    }
    
    //Definisi Method Game Over untuk mengecek Stamina
    boolean game_over(){
        if (stamina <= 0)return true;
        return false;
    } 
}
