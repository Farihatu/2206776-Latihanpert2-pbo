package soal.pkg1;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int pembilang1, penyebut1, pembilang2, penyebut2, pembilang3, penyebut3;
        double pecahan1, pecahan2, pecahan3;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pecahan pertama: ");
        pembilang1 = input.nextInt();
        penyebut1 = input.nextInt();
        System.out.print("Masukkan pecahan kedua \t: ");
        pembilang2 = input.nextInt();
        penyebut2 = input.nextInt();
        System.out.print("Masukkan pecahan ketiga : ");
        pembilang3 = input.nextInt();
        penyebut3 = input.nextInt();

        pecahan1 = (double) pembilang1 / penyebut1;
        pecahan2 = (double) pembilang2 / penyebut2;
        pecahan3 = (double) pembilang3 / penyebut3;

        System.out.print("=========================\n");
        System.out.println("Hasil penjumlahan \t: " + (pecahan1 + pecahan2 + pecahan3));
        System.out.println("Hasil pengurangan \t: " + (pecahan1 - pecahan2 - pecahan3));
        System.out.println("Hasil perkalian \t: " + (pecahan1 * pecahan2 * pecahan3));
        System.out.println("Hasil pembagian \t: " + (pecahan1 / pecahan2 / pecahan3));
    }
}