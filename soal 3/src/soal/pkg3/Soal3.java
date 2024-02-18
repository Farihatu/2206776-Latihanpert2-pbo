package soal.pkg3;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int kodeASCIIA, kodeASCIIB, jumlahKodeASCII;
        char karakterA, karakterB;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan karakter 'A': ");
        karakterA = input.next().charAt(0);
        System.out.print("Masukkan karakter 'B': ");
        karakterB = input.next().charAt(0);

        kodeASCIIA = (int) karakterA;
        kodeASCIIB = (int) karakterB;
        jumlahKodeASCII = kodeASCIIA + kodeASCIIB;
        
        System.out.println("Jumlah Kode ASCII dari 'A' dan 'B' = " + jumlahKodeASCII);
    }
}