public class latihan1 {
    public static void main(String[] args) {
        int bil1 = 28, bil2 = 54, bil3 = 15;
        String bilTerbesar = "Bilangan terbesar: ";

        if (bil1 > bil2) {
            System.out.print(bilTerbesar+bil1);
        } else if (bil2 > bil3) {
            System.out.print(bilTerbesar+bil2);
        } else if (bil3 > bil1) {
            System.out.print(bilTerbesar+bil3);
        }
    }
}