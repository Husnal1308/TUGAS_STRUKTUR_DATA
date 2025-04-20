package Pertemuan_3;

public class PBO_Mobil {
    public static void main(String[] args){
        PBO_MasterMobil mobil1 = new PBO_MasterMobil("BMW_x_Mercedess", "Hitam", 2050);
        PBO_MasterMobil mobil2 = new PBO_MasterMobil("PajeroSport_X08", "Drak Blue Glossy", 2070);
        
        //Menampilkan Informasi Mobil Pertama
        System.out.println("Informasi Mobil Messi");
        mobil1.Display_Info();
        
        //Menampilkan Informasi Mobil Kedua
        System.out.println("\nInformasi Mobil Rossi");
        mobil2.Display_Info();
    }   
}
