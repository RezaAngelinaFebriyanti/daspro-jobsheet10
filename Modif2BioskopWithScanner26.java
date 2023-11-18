import java.util.Scanner;

public class Modif2BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) { //tambahan opsi menu
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                            } else { //tambahan kode program untuk warning kursi sudah terisi
                                System.out.println("Maaf, kursi tersebut sudah terisi."); 
                            }
                        } else { //tambahan kode program untuk menghandle kursi tidak tersedia
                            System.out.println("Maaf, nomor baris/kolom kursi tidak tersedia.");
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Tampilkan daftar penonton:");
                    for (int b = 0; b < penonton.length; b++) {
                        for (int k = 0; k < penonton[b].length; k++) {
                            if (penonton[b][k] != null) {
                                System.out.print(penonton[b][k] + "\t");
                            } else { //modifikasi null
                                System.out.print("***\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}