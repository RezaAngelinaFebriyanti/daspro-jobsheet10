import java.util.Scanner;
public class Modif2Bioskop26 {
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
        
        System.out.println(penonton.length); //modifikasi langkah 4 for loop

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
        }

        System.out.println("Penonton pada baris ke-3: "); //modifikasi soal 10 foreach loop

        for (String i : penonton[2]) {
            System.out.println(i);
        }
    }
}