public class latihan1 {
    public static void main(String[] args) {
        int bil1 = 28, bil2 = 54, bil3 = 15;
        String bilTerbesar = "Bilangan terbesar: ";

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.print(bilTerbesar+bil1);
            } else {
                System.out.print(bilTerbesar+bil3);
            }
        } else if (bil2 > bil3) {
            if (bil2 > bil1) {
                System.out.print(bilTerbesar+bil2);
            } else {
                System.out.print(bilTerbesar+bil3);
            }
        }
    }
}