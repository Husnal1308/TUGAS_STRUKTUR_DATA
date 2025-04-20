package Pertemuan_3;

public class PBO_MasterMobil {
    String merk;
    String warna;
    int tahun;
    
    public PBO_MasterMobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    } 
    
    public void Display_Info(){
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
    }  
}
