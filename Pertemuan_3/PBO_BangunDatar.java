package Pertemuan_3;

public class PBO_BangunDatar {
    public static void main(String[] args){
        
        //Deklarasi Objek Lingkaran dari Class Master Bangun Datar
        PBO_MasterBangunDatar Lingkaran = new PBO_MasterBangunDatar();
        Lingkaran.luasLingkaran = Lingkaran.phi * Lingkaran.jari2 * Lingkaran.jari2;
        System.out.println("Luas Lingkaran : " + Lingkaran.luasLingkaran);
        
        //Deklarasi Objek Persegi dari Class Master Bangun Datar
        PBO_MasterBangunDatar Persegi = new PBO_MasterBangunDatar();
        Persegi.luasPersegi = Persegi.sisi * Persegi.sisi;
        System.out.println("Luas Persegi : " + Persegi.luasPersegi);        
    }
}
