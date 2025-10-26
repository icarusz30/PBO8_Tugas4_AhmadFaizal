import java.util.Scanner;

public class KomisiSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double penjualan, jasa = 0, komisi = 0, totalPendapatan;

        System.out.print("Masukkan total penjualan hari ini (Rp): ");
        penjualan = input.nextDouble();

        if (penjualan <= 2000000) {
            jasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan > 2000000 && penjualan <= 5000000) {
            jasa = 200000;
            komisi = 0.15 * penjualan;
        } else if (penjualan > 5000000) {
            jasa = 300000;
            komisi = 0.20 * penjualan;
        } else {
            System.out.println("Input tidak valid!");
            System.exit(0);
        }

        totalPendapatan = jasa + komisi;

        System.out.println("\n=== Hasil Perhitungan Komisi Sales ===");
        System.out.println("Total Penjualan : Rp" + penjualan);
        System.out.println("Uang Jasa       : Rp" + jasa);
        System.out.println("Komisi          : Rp" + komisi);
        System.out.println("-------------------------------");
        System.out.println("Total Pendapatan: Rp" + totalPendapatan);

        input.close();
    }
}
