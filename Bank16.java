import java.util.Scanner;

public class Bank16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml_pinjaman, lama_pinjaman;
        double persen_bunga = 3;
        double bunga, jml_pinjaman_akhir;
        System.out.println ("Masukkan jumlah pinjaman awal");
        jml_pinjaman = input.nextInt();
        System.out.println ("Masukkan lama pinjaman anda");
        lama_pinjaman = input.nextInt();
        bunga = lama_pinjaman*persen_bunga/100;
        jml_pinjaman_akhir = jml_pinjaman+bunga*jml_pinjaman;
        System.out.println ("Bunga adalah" +bunga);
        System.out.println ("Jumlah pinjaman yang harus dibayar" +jml_pinjaman_akhir);
    }
}