import java.util.Scanner;

public class Firmansyah2 {
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
        double nilaiRata = (nilaiBahasaInggris + nilaiPotensiAkademik + nilaiWawancara) / 3;

        // Output
        System.out.println("Nilai Akhir Anda Adalah: " + nilaiAkhir);
        System.out.println("Nilai rata-rata Anda adah: " + nilaiRata);
        if ((nilaiBahasaInggris >= 70) && (nilaiWawancara > 80)) {
            System.out.println("Anda diterima di Jurusan Sistem Informasi");
        } else if (((nilaiBahasaInggris > 70) && (nilaiPotensiAkademik > 70) && (nilaiWawancara > 70)) || ((nilaiBahasaInggris == 100) || (nilaiPotensiAkademik == 100) || (nilaiWawancara == 100))) {
            System.out.println("Anda diterima di Jurusan Ilmu Komputer");
        } else if ((nilaiRata == 75) && (nilaiBahasaInggris > 50)) {
            System.out.println("Anda diterima di Jurusan Bisnis Manajemen");
        } else if (((nilaiBahasaInggris > 60) && (nilaiPotensiAkademik > 60) && (nilaiPotensiAkademik > 60)) || ((nilaiPotensiAkademik == 100) && (nilaiBahasaInggris == 100))) {
            System.out.println("Anda diterima di Jurusan Teknik Informatika");
        } else {
            System.out.println("Anda tidak diterima di jurusan manapun");
        }
        input.close();
    }
}
