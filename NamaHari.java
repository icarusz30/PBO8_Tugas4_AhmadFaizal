import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kodeHari;

        System.out.print("Masukkan kode hari (1-7): ");
        kodeHari = input.nextInt();

        String namaHari;

        if (kodeHari == 1) {
            namaHari = "Senin";
        } else if (kodeHari == 2) {
            namaHari = "Selasa";
        } else if (kodeHari == 3) {
            namaHari = "Rabu";
        } else if (kodeHari == 4) {
            namaHari = "Kamis";
        } else if (kodeHari == 5) {
            namaHari = "Jumat";
        } else if (kodeHari == 6) {
            namaHari = "Sabtu";
        } else if (kodeHari == 7) {
            namaHari = "Minggu";
        } else {
            namaHari = "Kode tidak valid!";
        }

        System.out.println("Hari ke-" + kodeHari + " adalah " + namaHari);
        input.close();
    }
}
