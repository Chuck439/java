public class ContohVariabel16 {
    public static void main(String[] args) {
        String SalahSatuHobbySayaAdalah = "Bermain game";
        boolean isPandai = true;
        char JenisKelamin = 'Laki';
        byte umurSayaSekarang = 18;
        double $ipk = 4.0, tinggi = 1.69;
        System.out.println("Apakah Hobby anda? " + SalahSatuHobbySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + JenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}