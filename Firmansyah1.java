import java.util.Scanner;

public class Firmansyah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Var
        double bobotPotensiAkademik = 0.5;
        double bobotBahasaInggris = 0.3;
        double bobotWawancara = 0.2;

        // Input
        System.out.print("Masukkan nilai Tes Potensi Akademik (0-100): ");
        double nilaiPotensiAkademik = input.nextDouble();

        System.out.print("Masukkan nilai Tes Bahasa Inggris (0-100): ");
        double nilaiBahasaInggris = input.nextDouble();

        System.out.print("Masukkan nilai Tes Wawancara (0-100): ");
        double nilaiWawancara = input.nextDouble();

        // Process
        double nilaiAkhir = (nilaiPotensiAkademik * bobotPotensiAkademik) + (nilaiBahasaInggris * bobotBahasaInggris) + (nilaiWawancara * bobotWawancara);

        // Output
        System.out.println("Nilai Akhir Anda Adalah: " + nilaiAkhir);
    }
}
