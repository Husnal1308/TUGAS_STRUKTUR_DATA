package Pertemuan_5;

import static java.awt.SystemColor.text;
import java.util.Stack;

public class Studikasus_Stack {
  
    private Stack<String> undoStack;   // Stack untuk Undo
    private Stack<String> redoStack;   // Stack untuk Redo
    private String currentText;        // Teks saat ini yang sedang dikerjakan

    public Studikasus_Stack() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        currentText = "";
    }

    // Menambahkan teks
    public void addText1(String text) {
        undoStack.push(currentText);  // Simpan teks sekarang ke dalam undoStack
        currentText += text;          // Menambahkan teks baru
        redoStack.clear();            // Bersihkan redoStack karena ada perubahan baru
        System.out.println("Teks utama\t\t\t: " + currentText);
    }
    public void addText2(String text) {
        undoStack.push(currentText);  // Simpan teks sekarang ke dalam undoStack
        currentText += text;          // Menambahkan teks baru
        redoStack.clear();            // Bersihkan redoStack karena ada perubahan baru
        System.out.println("Tambahkan teks baru\t\t: " + currentText);
    }
     public void addText3(String text) {
        undoStack.push(currentText);  // Simpan teks sekarang ke dalam undoStack
        currentText += text;          // Menambahkan teks baru
        redoStack.clear();            // Bersihkan redoStack karena ada perubahan baru
        System.out.println("Teks setelah mengalami Undo : " + currentText);
    }
    public void addText4(String text) {
        undoStack.push(currentText);  // Simpan teks sekarang ke dalam undoStack
        currentText = text;          // Menambahkan teks baru
        redoStack.clear();            // Bersihkan redoStack karena ada perubahan baru
        System.out.println("Teks setelah mengalami Redo :... " + currentText);
    }
    
    // Membatalkan perubahan terakhir (Undo)
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentText);  // Simpan teks sekarang ke dalam redoStack
            currentText = undoStack.pop(); // Ambil teks terakhir dari undoStack
            System.out.println("Undo dilakukan --> Teks saat ini: " + currentText);
        } else {
            System.out.println("Tidak ada perubahan yang bisa di-undo.");
        }
    }

    // Mengulang perubahan yang dibatalkan (Redo)
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentText);  // Simpan teks sekarang ke dalam undoStack
            currentText = redoStack.pop(); // Ambil teks terakhir dari redoStack
            System.out.println("Redo dilakukan --> Teks saat ini: " + currentText);
        } else {
            System.out.println("Tidak ada perubahan yang bisa di-redo.");
        }
    }

    // Menampilkan teks saat ini
    public void showText() {
        System.out.println("Teks saat ini\t\t\t: " + currentText);
    }

    public static void main(String[] args) {
        Studikasus_Stack editor = new Studikasus_Stack();
        System.out.println("=========================================================================================");
        editor.addText1("Halo, dunia! ");
        editor.addText2("Ini adalah contoh penggunaan stack. ");
        editor.showText();
        
        editor.undo();
        editor.redo();
        System.out.println("==========================================================================================");
        
        System.out.println("==========================================================================================");
        editor.undo();
        editor.addText3("--> Undo digunakan untuk membatalkan tindakan terakhir yang sudah dilakukan ");
        
        editor.redo();
        editor.addText4("--> Rebo digunakan untuk mengembalikan tindakan yang dibatalkan oleh undo. ");
        System.out.println("==========================================================================================");
    }
}
