import java.util.Scanner;
public class ModifikasiBioskop26 {
    public static void main(String[] args) {
        
        String[][] penonton = new String[4][2];
        System.out.println(penonton.length); //modifikasi langkah 4

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
        }

        System.out.println(penonton.length); //modifikasi langkah 5

        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        System.out.println("Penonton pada baris ke-3: "); //tambahan kode pada soal 10

        for (int i = 0; i < penonton[2].length; i++) { 
            System.out.println(penonton[2][i]);

        }
    }
}