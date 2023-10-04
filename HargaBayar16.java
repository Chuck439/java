import java.util.Scanner;

public class HargaBayar16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variabel
        String merk;
        int harga, jumlah, jmlHalaman, dis;
        double total, bayar, jmlDis;

        // Input Barang
        System.out.println("Masukkan merk buku yang akan dibeli ");
        merk = input.next();
        System.out.println("Masukkan tebal halaman buku yang akan dibeli ");
        jmlHalaman = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah = input.nextInt();

        // Menghitung harga
        System.out.println("Masukkan besar diskon (%)");
        dis = input.nextInt();
        total = harga*jumlah;
        jmlDis = total*dis/100;
        bayar = total-jmlDis;

        // 
        System.out.println("Anda akan membeli buku dengan merk " +merk);
        System.out.println("Dengan halaman buku setebal " +jmlHalaman);
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}