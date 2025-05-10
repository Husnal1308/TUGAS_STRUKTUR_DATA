package Pertemuan_5;
import java.util.Stack;
        
public class Stack_denganlibrary {
    
        public static void main(String[] args) {
            
            Stack<String> games = new Stack<String>();
            
            games.add("Call of Duty");
            games.add("Guitar Hero");
            games.add("Super Monkey Ball");
            
            //menampilkan dan menghapus elemen terats
            System.out.println("POP \t\t\t: " + games.pop());
            
            //melihat elemen teratas tanpa menghapus
            System.out.println("PEEK \t\t\t: " + games.peek());
            
            //menambahkan elemen baru
            games.push("Minicraft");
            games.push("Fortain");
            
            //menampilkan semua isi
            System.out.println("Isi stack sekarang \t: ");
                for (String game : games){
                    System.out.println(game);
                }
                
             //menghapus semua isi stack
             games.clear();
             System.out.println("Stack setelah clear \t: " + games);
    }
}
