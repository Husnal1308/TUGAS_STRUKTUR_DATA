package Pertemuan_6;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_denganlibrary {
    
    public static void main(String[] args) {
        
        Queue<String> antrian = new LinkedList<>();
        
        //menambahkan elemen ke dalam antrian
        antrian.add("Ali");
        antrian.add("Budi");
        antrian.add("Citra");
        
        //menampilkan isi antrian 
        System.out.println("Isi antrian \t\t\t: " + antrian);
        
        //mengeluarkan elemen dari depan
        String keluar = antrian.poll();
        System.out.println("Keluar dari antrian \t\t: " + keluar);
        
        //menampilkan isi antrian setelah queue
        System.out.println("Isi antrian sekarang \t\t: " + antrian);
        
        //melihat elemen paling depan 
        String paling_depan = antrian.peek();
        System.out.println("Yang paling depan sekarang \t: " + paling_depan);   
    }
}
