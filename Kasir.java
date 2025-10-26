import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalBelanja, uangBayar, diskon = 0, totalBayar, kembalian;
        String member;

        System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
        member = input.nextLine();

        System.out.print("Masukkan total belanja (Rp): ");
        totalBelanja = input.nextDouble();

        // Logika if-else sesuai ketentuan
        if (member.equalsIgnoreCase("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else { // tidak punya member
            if (totalBelanja > 100000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        }

        totalBayar = totalBelanja - diskon;

        System.out.print("Masukkan uang yang dibayarkan (Rp): ");
        uangBayar = input.nextDouble();

        kembalian = uangBayar - totalBayar;

        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Status Member : " + member);
        System.out.println("Total Belanja : Rp" + totalBelanja);
        System.out.println("Diskon        : Rp" + diskon);
        System.out.println("Total Bayar   : Rp" + totalBayar);
        System.out.println("Uang Dibayar  : Rp" + uangBayar);
        System.out.println("Kembalian     : Rp" + kembalian);

        input.close();
    }
}
