package Pertemuan_6;

import java.util.LinkedList;
import java.util.Queue;

public class Studikasus_Queue {
 
    public static void main(String[] args) {
        Queue<String> pesanan = new LinkedList<>();

        // Menambahkan pesanan ke antrian (enqueue)
        pesanan.add("Pesanan #1 - Burger");
        pesanan.add("Pesanan #2 - Ayam Goreng");
        pesanan.add("Pesanan #3 - Nasi Goreng");
        pesanan.add("Pesanan #4 - Es Teh");
        pesanan.add("Pesanan #5 - Kentang Goreng");

        System.out.println("Daftar pesanan saat ini:");
        for (String p : pesanan) {
            System.out.println(p);
        }

        System.out.println("\nMulai melayani pesanan...\n");

        // Memproses pesanan satu per satu (dequeue)
        while (!pesanan.isEmpty()) {
            String pesananDilayani = pesanan.poll();
            System.out.println(pesananDilayani + " sedang diproses...");
        }

        System.out.println("\nSemua pesanan telah dilayani.");
    }
}