import java.util.Scanner;

public class Gaji16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int JmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        // Input jumlah masuk dan tidak masuk
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        JmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk = input.nextInt();

        // Masukkan Gaji dan Potongan Gaji
        System.out.println("Masukkan Nominal Gaji Anda ");
        gaji = input.nextInt();
        System.out.println("Masukkan Potongan Gaji Anda ");
        potGaji = input.nextInt();

        // Menghitung total gaji
        TotGaji = (JmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);
    }
}