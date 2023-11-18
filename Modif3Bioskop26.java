import java.util.Scanner;
public class Modif3Bioskop26 {
    public static void main(String[] args) {

        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.println(penonton.length); //modifikasi langkah 5 foreach loop

        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        for (int i = 0; i < penonton.length; i++) { //modifikasi kode soal 11
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
        }
    }
}