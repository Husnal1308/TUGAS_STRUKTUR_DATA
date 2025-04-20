package Pertemuan_3;

public class PBO_Player {
    public static void main(String[] args){
        
        //Membuat objek player
        MasterPBO_Player petani = new MasterPBO_Player();
        
        //Mengisi atribut player
        petani.nama = "Petani Padi";
        petani.kecepatan = 80;
        petani.stamina = 100;
        
        // Menjalankan method
        petani.lari();
        
        if (petani.game_over()){
            System.out.println("coba lagi!!");
        }
    }
    
}
