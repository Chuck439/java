import java.util.Scanner;
public class ArrayRataNilai16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiMhs;
        double total = 0;
        int lulus = 0;
        int tdklulus = 0;
        int jmlhNilaiLulus = 0;
        double ratanilaiLulus = 0;
        double ratanilaitdkLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = input.nextInt();
        nilaiMhs = new int[n];
        
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jmlhNilaiLulus += nilaiMhs[i];
                lulus++;
            }else tdklulus++;
        }
        
        ratanilaiLulus = jmlhNilaiLulus / lulus;
        ratanilaitdkLulus = (total - jmlhNilaiLulus) / tdklulus;
        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + ratanilaiLulus );
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + ratanilaitdkLulus);
        
        input.close();
    }
}
