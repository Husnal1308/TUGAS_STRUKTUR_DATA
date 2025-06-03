/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_;

/**
 *
 * @author USER
 */
public class Mengecek_MATRIKSidentitas {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        boolean identitas = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && matriks[i][j] != 1) || (i != j && matriks[i][j] != 0)) {
                    identitas = false;
                    break;
                }
            }
        }
        System.out.println("Apakah Matriks Identitas ? " + identitas);
    }
}
        
