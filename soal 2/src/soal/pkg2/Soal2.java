package soal.pkg2;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int rangking;
        boolean naikKelas;
        String hasil;

        System.out.print("Masukkan nilai rangking : ");
        rangking = masuk.nextInt();
        System.out.print("Apakah naik kelas? \t: ");
        naikKelas = masuk.nextBoolean();

        System.out.print("=========================\n");
        hasil = (rangking == 1) && naikKelas ? 
                "Selamat, Anda mendapatkan hadiah karena rangking 1 dan naik kelas." :
                "Maaf, Anda tidak memenuhi syarat untuk mendapatkan hadiah.";
        System.out.println(hasil);
    }
}