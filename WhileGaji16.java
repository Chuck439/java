package jobsheet7;

import java.util.Scanner;

public class WhileGaji16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Var
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;

        // Input
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();

        // Process
        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.nextLine();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur + 75000;
            }

            totalGajiLembur += gajiLembur;

            // Output
            System.out.println("Total gaji lembur: " +totalGajiLembur);
        }
    }
}
